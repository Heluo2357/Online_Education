package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object TestPaperQuestion {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_test_paper_question_full", "2024-06-18")
  }
}
