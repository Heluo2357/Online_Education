package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object CartInfo {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_cart_info_full", "2024-06-18")
  }
}
