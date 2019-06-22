package madlabs.scala.ch03

import scala.collection.mutable.Map
import java.io.File

object ArrayTest {

  def main(args: Array[String]): Unit = {
    for (arg <- args)
      Console println arg

    val greetingString = new Array[String](3)
    greetingString(0) = "Hello"
    greetingString(1) = ", "
    greetingString(2) = "There"

    for (index <- 0 to 2)
      Console println greetingString(index)

    val numNames = Array("1", "2", "3")

    // arrays end

    val list1 = List("1", "2", "3")
    val list2 = 1 :: 2 :: Nil

    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))

    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
    println(romanNumeral)

    val result = for (index <- 1 to 10) yield (index + 1)
    println(" Result :" + result.last)

    val filesHere = new File(".").listFiles()

    def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList

    val forLineLengths =
      for {
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(".*for.*")
      } yield trimmed.length

    (x: Int) => x + 1

    
  }

}