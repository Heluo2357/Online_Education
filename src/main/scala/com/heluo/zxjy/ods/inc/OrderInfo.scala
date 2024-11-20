package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object OrderInfo {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_order_info_inc", "2024-06-18")
  }
}
