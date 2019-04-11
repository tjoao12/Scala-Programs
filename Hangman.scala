import com.sun.xml.internal.fastinfoset.util.StringArray

import scala.util.Random

object Hangman extends App {

  startScreen

  var attempts = 0

  def startScreen {

    var stringArray = Array[String]("resolute", "brainy", "ahead", "conscious", "aback", "animated", "servant", "stuff", "yard", "unsuitable", "interesting", "uninterested", "majestic", "splendid", "doubtful", "red", "lame", "grape", "punishment", "head", "deeply", "evasive", "rejoice", "mate", "hilarious", "juggle", "economic", "dust", "notice", "gaze")
    var string = stringArray(Random.nextInt(stringArray.length-1))
    var string2 = string.toArray

    println("Welcome to the Hangman game!")
    println("Press (1) to play")
    println(string)

    scala.io.StdIn.readInt match {
      case 1 => game(string2)
      case _ => {
        println("Try again")
        startScreen
      }
    }
  }

  def game (string2: Array[Char]) {
    var counter = 0

    println("Type your guess")
    println("_ " * string2.length)
    var letterGuess = scala.io.StdIn.readChar

    for (x <- 0 until string2.length) {

      if (letterGuess == string2(x)) {
        print(string2(x))
        counter += 1
      } else {
        print("_ ")
      }
    }
    if (counter == 0) {
      attempts += 1
      println(s"\nThe guess $letterGuess was incorrect, you have had $attempts attempts")
      printHangman(attempts, string2)
    } else {
      game(string2)
    }
    game(string2)
  }

  def printHangman(attempts: Int, string2: Array[Char]) {
    attempts match {
      case 1 => println("One more and the hangman will start appearing")
      case 2 => println("__________")
      case 3 => println("|\n|\n|\n|\n|\n|\n__________")
      case 4 => println("_____\n|\n|\n|\n|\n|\n|\n__________")
      case 5 => println("_____\n|    |\n|\n|\n|\n|\n|\n__________")
      case 6 => println("_____\n|    |\n|    o\n|   \\|/\n|\n|\n|\n__________")
      case 7 => {
        println("_____\n|    |\n|    o\n|   \\|/ \n|    |\n|    /\\ \n|\n__________")
        println(s"Game over! The word was $string2")
        startScreen
      }
    }
  }
}
