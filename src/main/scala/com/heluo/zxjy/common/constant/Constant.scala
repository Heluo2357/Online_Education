package com.heluo.zxjy.common.constant

import org.apache.spark.sql.SparkSession

object Constant {
  val ODS = "ods"
  val DIM = "dim"
  val DWD = "dwd"
  val DWS = "dws"
  val ADS = "ads"

  val spark: SparkSession = SparkSession.builder()
    .master("local[*]")
    .appName("medical")
    .config("spark.sql.parquet.writeLegacyFormat", "true")
    .config("hive.exec.dynamic.partition.mode", "nonstrict")
    .enableHiveSupport()
    .getOrCreate()



}
