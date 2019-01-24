
import scala.io.Source
import scala.util.Random

object HangMan extends App {


  val words = Source.fromFile("C:\\myfriend\\Scala\\ScalaChallenge\\words.txt").getLines.toArray
  var wordPicked = scala.util.Random.nextInt(words.length)
  var wordStorage = words(wordPicked)
  var attempts = 5
  var letterGuessed = " "
  var printOut = new Array(wordStorage.length)


  println("Welcome to Hangman, pick the letter to check")

  attempts match {
    case 0 => println("you have 0 attempt left, you have lost")
    case 1 => println("you have 1 attempt left")
    case 2 => println("you have 2 attempt left")
    case 3 => println("you have 3 attempt left")
    case 4 => println("you have 4 attempt left")
    case 5 => println("you have 5 attempt left")
  }

        if(attempts==0){
          sys.exit(0)
        } else{
        for (x <- 0 until wordStorage.length) {
          print("_ ")
        }
        for (x <- 0 until wordStorage.length) {
          letterGuessed = scala.io.StdIn.readLine()

          if (letterGuessed == wordStorage.substring(x, x + 1)) {
            println(s"that is correct $attempts left")
          } else {
            attempts -= 1
            println(s"that is not correct $attempts left")
          }
        }
  }
}


