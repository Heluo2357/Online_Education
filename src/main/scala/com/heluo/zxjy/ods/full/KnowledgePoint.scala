package com.heluo.zxjy.ods.full

import com.heluo.zxjy.common.util.SparkTableUtil.loadOdsTable

object KnowledgePoint {
  def main(args: Array[String]): Unit = {
    loadOdsTable("ods_knowledge_point_full", "2024-06-18")
  }
}