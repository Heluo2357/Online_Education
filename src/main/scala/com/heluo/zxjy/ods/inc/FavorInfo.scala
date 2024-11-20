package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object FavorInfo {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_favor_info_inc", "2024-06-18")
  }
}
