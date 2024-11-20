package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object CartInfo {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_cart_info_inc", "2024-06-18")
  }
}
