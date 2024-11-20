package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object BaseCategoryInfo {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_base_category_info_full", "2024-06-18")
  }
}
