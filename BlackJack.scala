object Blackjack extends App {


  def blackJack (card1:Int, card2:Int)={

    var total = 0
    if ((card1>0 && card1<12) & (card2>0 && card2<12)){

      total = card1 + card2

      total match {

        case 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 => println(s"the total amount is: $total")
        case 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 => println(s"the total amount is: $total")
        case _ => println(s"the total amount is: $total you have lost the game")
      }
    }
    else {
      println("invalid input")
    }
  }
  blackJack (10,11)
}
