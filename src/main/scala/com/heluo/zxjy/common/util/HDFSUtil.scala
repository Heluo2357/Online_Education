package com.heluo.zxjy.common.util

import com.heluo.zxjy.common.constant.Constant.HDFS_URL
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileSystem, Path}

import java.io.IOException

object HDFSUtil {

  def HDFSPathCheck(path: String): Boolean = {
    // 指定要检查的路径
    val hdfsPath = s"$HDFS_URL$path"

    // 配置 Hadoop 配置项
    val conf = new Configuration()
    conf.set("fs.defaultFS", HDFS_URL) // 设置 Namenode 地址

    var fs: FileSystem = null
    try {
      // 获取 HDFS 文件系统
      fs = FileSystem.get(conf)
      // 检查路径是否存在
      val path = new Path(hdfsPath)
      if (fs.exists(path)) true
      else false

    } catch {
      case e: IOException => {
        e.printStackTrace()
        false
      }
    } finally {
      // 关闭文件系统
      if (fs != null) {
        try fs.close()
        catch {
          case e: Exception => e.printStackTrace()
        }
      }
    }
  }

}
