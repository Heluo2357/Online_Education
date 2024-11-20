package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object VipChangeDetail {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_vip_change_detail_inc", "2024-06-18")
  }
}
