object creditCard extends App {

  println("Please enter your credit card number")
  val accNum = scala.io.StdIn.readLine()

  def Bank(accNum:String){

  //for (i <- accNum.length-1 to 1 by -2) {
   for (i <- accNum.length-1 to 1) {

    if (i % 10 == 0) {
      println(s"This $accNum is valid")
    }
    else {
      println(s"This $accNum is not valid")
    }
  }
  }
}