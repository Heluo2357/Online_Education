package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object VideoInfo {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_video_info_full", "2024-06-18")
  }
}
