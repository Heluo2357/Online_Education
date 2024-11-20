package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object TestExamQuestion {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_test_exam_question_inc", "2024-06-18")
  }
}
