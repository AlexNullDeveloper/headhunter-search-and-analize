package ru.talismanov.util

import org.scalatest.FunSpec

import scala.collection.mutable

class MapCleanUpFromGarbageTest extends FunSpec {
  describe("A Map") {
    describe("When Have Doublicates in Meaning") {
      it("should have only one of them as sum of their values") {
        var map: mutable.Map[String, Int] = scala.collection.mutable.Map[String, Int]()
        map += ("JavaEE" -> 50)
        map += "J2EE" -> 50

        MapUtils.mapCleanUpFromGarbage(map)
        assert(map("JavaEE") == 100)
        assert(map.getOrElse("J2EE", 0) == 0)
      }
    }
  }
}
