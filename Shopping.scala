import javax.sound.midi.Receiver

import scala.collection.mutable.ListBuffer

object Shopping extends App {

  def options(receipt: List[String]) {
    var apple = 0
    var orange = 0

    println("This is the receipt: ")

    for (x <- 0 until receipt.length) {
      println(receipt(x))

      if (receipt(x) == "orange") {
        orange +=1

      } else if (receipt(x) == "apple"){
        apple +=1
      }
    }
    println("The total price is: " + ((orange*0.25) + (apple*0.60)))
  }

  options(List[String]("orange", "apple", "apple"))

}