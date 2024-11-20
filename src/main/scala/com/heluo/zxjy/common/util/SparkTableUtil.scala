package com.heluo.zxjy.common.util

import com.heluo.zxjy.common.constant.Constant._
import org.apache.spark.sql.{DataFrame, Dataset, Row, SaveMode}
import spark.implicits._

object SparkTableUtil {

  def readDimTable(table: String, date: String): Dataset[Row] = spark.table(table).where($"dt" === date)

  def readDwdTable(table: String, date: String): Dataset[Row] = spark.table(table).where($"dt" === date)

  def readDwsTable(table: String, date: String): Dataset[Row] = spark.table(table).where($"dt" === date)

  def loadOdsTable(tableName: String, date: String): Unit = {
    var path: String = ""
    if (tableName.toLowerCase.contains("log")){
      path = s"/origin_data/education/log/edu_log/$date"
    } else {
      path = s"/origin_data/education/db/${tableName.substring(4)}/$date"
    }

    var lastPartition: String = null

    if (HDFSUtil.HDFSPathCheck(path)) {
      spark.sql(s"LOAD DATA INPATH '$path' OVERWRITE INTO TABLE $tableName PARTITION(dt='$date')")

      lastPartition = spark.sql(s"show partitions $tableName")
        .as[String]
        .collect()
        .last

      if (lastPartition.contains(date)) {
        println(s"${tableName}表添加分区数据成功！")
      } else {
        println(s"${tableName}表添加分区数据失败！（原因：hive表最后一个分区值$lastPartition 不等于 $date）")
      }

    } else {
      println(s"${HDFS_URL}${path}目标路径不存在！")
      if (lastPartition == null) {
        lastPartition = spark.sql(s"show partitions $tableName")
          .as[String]
          .collect()
          .last
      }

      if (lastPartition.contains(date)) {
        println(s"${tableName}表的${date}分区数据已存在！")
      } else {
        println(s"${tableName}表的${date}分区数据不存在！（原因：hive表最后一个分区值$lastPartition 不等于 $date。请检查源数据是否已同步...）")
      }


    }

    spark.stop()
  }

  def writeDimTable(dataFrame: DataFrame, tableName: String): Unit = {
    dataFrame.write.format("hive")
      .mode(SaveMode.Overwrite)
      .orc(s"/warehouse/edu/ods/$tableName")
  }

}
