package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object TestPaper {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_test_paper_full", "2024-06-18")
  }
}
