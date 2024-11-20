package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object UserInfo {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_user_info_inc", "2024-06-18")
  }
}
