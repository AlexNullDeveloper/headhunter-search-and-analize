package ru.talismanov.util

import scala.collection.mutable

object MapUtils {

  def printMap(map: mutable.Map[String, Int]): Unit = {
    for ((k, v) <- map) {
      println(k + " : " + v)
    }
  }

  def incrementByOne(key: String, map: mutable.Map[String, Int]): map.type = {
    incrementByValue(key, map, 1)
  }

  def incrementByValue(key: String, map: mutable.Map[String, Int], n: Int): map.type = {
    var count = map.getOrElse(key, 0)
    count += n
    map += (key -> count)
  }

  def fromMapToReversedSequenceAndPrint(map: mutable.Map[String, Int]): Unit = {
    println("===============")
    var tuples = map.toSeq.sortBy(_._2).reverse

    for (tuple <- tuples) {
      println(tuple._1 + " " + tuple._2)
    }
  }

  def mapCleanUpFromGarbage(map: mutable.Map[String, Int]): Unit = {
    val cppCount = map.getOrElse("C/C++", 0)
    MapUtils.incrementByValue("C++", map, cppCount)
    map.remove("C/C++")

    val coreCount = map.getOrElse("core", 0)
    MapUtils.incrementByValue("Core", map, coreCount)
    map.remove("core")

    //JS встретилось 178, а JSP 67. Значит про JavaScript писали в JS - JSP случаях. 178-67=111
    val jsCount = map.getOrElse("JS", 0)
    val jspCount = map.getOrElse("JSP", 0)
    val difference = jsCount - jspCount
    MapUtils.incrementByValue("JavaScript", map, difference)
    map.remove("JS")

    val j2eeCount = map.getOrElse("J2EE", 0)
    MapUtils.incrementByValue("JavaEE", map, j2eeCount)
    map.remove("J2EE")

    val iocCount = map.getOrElse("IoC", 0)
    MapUtils.incrementByValue("Inversion of Control", map, iocCount)
    map.remove("IoC")
  }

}
