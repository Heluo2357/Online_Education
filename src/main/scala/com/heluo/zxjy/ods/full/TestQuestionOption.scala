package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object TestQuestionOption {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_test_question_option_full", "2024-06-18")
  }
}
