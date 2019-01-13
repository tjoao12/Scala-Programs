import HangMan.attempts

import scala.util.Random

object RockPaperScissors extends App {

  firstMenu()
  var choices = Array("Rock", "Paper", "Scissors")
  var userInput = scala.io.StdIn.readInt

  def firstMenu() {
    println("Press 1 to play or 2 to quit")
      scala.io.StdIn.readInt match {
      case 1 => secondMenu2()
      case 2 => sys.exit(0)
    }
  }

  def secondMenu2() {

    println("Make your selection Press 1 for Rock, Press 2 for Paper and 3 for Scissors")
    val secondMenu = scala.io.StdIn.readInt
    secondMenu match {
      case 1 => println("You have chosen Rock")
      case 2 => println("You have chosen Paper")
      case 3 => println("You have chosen Scissors")
      case _ => println("Incorrect Key" + sys.exit(0))
    }
    pc()
    result(secondMenu)
    firstMenu()

  }

  def pc() {

    computerChoice() match {
      case 0 => println("The computer has chosen Rock")
      case 1 => println("The computer has chosen Paper")
      case 2 => println("The computer has chosen Scissors")
    }
  }

  def result(choice:Int) {

    if (choice == 1) {
      computerChoice() match {
        case 0 => println("You have drawn")
        case 1 => println("You have lost")
        case 2 => println("You have won")
      }
    } else if (choice == 2) {
      computerChoice() match {
        case 0 => println("You have won")
        case 1 => println("You have drawn")
        case 2 => println("You have lost")
      }
    } else if (choice == 3) {
      computerChoice() match {
        case 0 => println("You have lost")
        case 1 => println("You have won")
        case 2 => println("You have drawn")
      }
    }

  }

  def computerChoice(): Int = {
    Random.nextInt(3)
  }


}

