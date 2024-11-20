package com.heluo.zxjy.common.constant

import org.apache.spark.sql.SparkSession
import com.heluo.zxjy.common.util.XMLFileUtil.XMLConfigReader

object Constant {
  System.setProperty("HADOOP_USER_NAME", "heluo")

  val ODS = "ods"
  val DIM = "dim"
  val DWD = "dwd"
  val DWS = "dws"
  val ADS = "ads"

  private val tempHdfsPath: String = XMLConfigReader("src/main/resources/core-site.xml")
  val HDFS_URL: String = if (tempHdfsPath.nonEmpty) tempHdfsPath else "hdfs://bigdata1:8020"

  val spark: SparkSession = SparkSession.builder()
    .master("local[*]")
    .appName("education")
    .config("spark.sql.parquet.writeLegacyFormat", "true")
    .config("hive.exec.dynamic.partition.mode", "nonstrict")
    .config("spark.sql.sources.partitionOverwriteMode", "dynamic")
    .config("spark.sql.orc.compression.codec", "snappy")
    .enableHiveSupport()
    .getOrCreate()


}
