package com.heluo.zxjy.ods.inc

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object TestExam {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_test_exam_inc", "2024-06-18")
  }
}
