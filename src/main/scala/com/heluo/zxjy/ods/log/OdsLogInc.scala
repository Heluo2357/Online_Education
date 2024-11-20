package com.heluo.zxjy.ods.log

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object OdsLogInc {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_log_inc", "2024-06-18")
  }
}
