package ru.talismanov.util

import org.scalatest.FunSuite

import scala.collection.mutable


class MapUtilTest extends FunSuite {

  test("increment of values by 1") {
    println("testing increment of values by 1")
    var map: mutable.Map[String, Int] = scala.collection.mutable.Map[String, Int]()
    MapUtils.incrementByOne("Git", map)
    assert(map("Git") == 1)

    map += ("Spring" -> 100)
    MapUtils.incrementByOne("Spring", map)
    assert(101 == map("Spring"))
  }

  test("increment by defined value") {
    val stringToIntMap = scala.collection.mutable.Map[String, Int]()
    stringToIntMap += "Git" -> 101
    MapUtils.incrementByValue("Git", stringToIntMap, 99)
    assert(stringToIntMap("Git") == 200)
  }
}
