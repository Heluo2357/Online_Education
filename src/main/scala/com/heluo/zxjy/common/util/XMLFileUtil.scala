package com.heluo.zxjy.common.util

import scala.xml.XML

object XMLFileUtil {

  // 指定 XML 文件路径
  def XMLConfigReader(xmlFilePath: String): String = {
    // 要查找的配置项名称
    val targetPropertyName = "fs.defaultFS"

    // 解析 XML 文件
    val xmlFile = XML.loadFile(xmlFilePath)

    // 查找 <property> 节点并提取目标值
    val properties = (xmlFile \\ "property")
    val targetValue = properties
      .find(property => (property \ "name").text == targetPropertyName)
      .map(property => (property \ "value").text)

    // 输出结果
    targetValue match {
      case Some(value) => {
//        println(s"配置项: $targetPropertyName, 值: $value")
        value
      }
      case None => {
        println(s"未找到配置项: $targetPropertyName")
        null
      }
    }
  }

}
