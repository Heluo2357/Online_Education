package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object UserChapterProcess {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_user_chapter_process_full", "2024-06-18")
  }
}
