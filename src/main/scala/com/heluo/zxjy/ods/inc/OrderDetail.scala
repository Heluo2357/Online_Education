package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object OrderDetail {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_order_detail_inc", "2024-06-18")
  }
}
