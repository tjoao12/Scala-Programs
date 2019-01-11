import HangMan.attempts
import scala.util.Random

object RockPaperScissors extends App {

  var choices = Array ("Rock", "Paper", "Scissors")
  var computerChoice = (Random.nextInt(choices.length))
  def startMenu(userInput: Int) {
    println("Welcome to the Rock, make your selection \nPress 1 for Rock \nPress 2 Paper \nPress 3 Scissors \nAny other key to quit")
    var userInput = scala.io.StdIn.readInt
  }

  def user(userInput: Int) {
    userInput match {
      case 1 => println("You have chosen Rock")
      case 2 => println("You have chosen Scissors")
      case 3 => println("You have chosen Paper")
      case _ => println("You have quit the game")
    }
  }

  def pc(computerChoice: Int) {
    computerChoice match {
      case 0 => println("The computer has chosen Rock")
      case 1 => println("The computer has chosen Scissors")
      case 2 => println("The computer has chosen Paper")
    }
  }

  def options(userInput:Int) {
    if (userInput == 1) {
      computerChoice match {
        case 0 => println("You have drawn")
        case 1 => println("You have lost")
        case 2 => println("You have won")
      }
    } else if (userInput == 2) {
      computerChoice match {
        case 0 => println("You have won")
        case 1 => println("You have drawn")
        case 2 => println("You have lost")
      }
    }

    else if (userInput == 3) {
      computerChoice match {
        case 0 => println("You have lost")
        case 1 => println("You have won")
        case 2 => println("You have drawn")
      }

    }

  }

}

