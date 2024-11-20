package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object PaymentInfo {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_payment_info_inc", "2024-06-18")
  }
}
