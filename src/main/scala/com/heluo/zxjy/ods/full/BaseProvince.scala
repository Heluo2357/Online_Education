package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object BaseProvince {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_base_province_full", "2024-06-18")
  }
}