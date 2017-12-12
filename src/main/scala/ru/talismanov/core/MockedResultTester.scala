package ru.talismanov.core

import java.io.{BufferedReader, FileInputStream, InputStreamReader}

import ru.talismanov.util.MapUtils

import scala.collection.mutable

object MockedResultTester {
  var map: mutable.Map[String, Int] = scala.collection.mutable.Map[String, Int]()

  def main(args: Array[String]): Unit = {


    MapUtils.incrementByOne("key", null)

    var bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:/test/mapOfSkills.txt"), "UTF-8"))

    var line = bufferedReader.readLine()
    while (line != null) {
      val lastIndex = line.lastIndexOf(" ")

      map += (line.substring(0, lastIndex) -> line.substring(lastIndex + 1).toInt)
      line = bufferedReader.readLine()
    }


    MapUtils.fromMapToReversedSequenceAndPrint(map)


    MapUtils.mapCleanUpFromGarbage(map)

    println("=======================")
    MapUtils.fromMapToReversedSequenceAndPrint(map)
  }
}
