
class Calculator {

  def add(firstNr: Int, secondNr: Int): Int = {
    val total1 = firstNr + secondNr
    println("the result is " + total1)
    total1
  }

  def substract(firstNr: Int, secondNr: Int): Int = {
    var total2 = firstNr - secondNr
    println("the result is " + total2)
    total2
  }

  def divide(firstNr: Int, secondNr: Int): Int = {
    var total3 = firstNr / secondNr
    println("the result is " + total3)
    total3
  }

  def multiply(firstNr: Int, secondNr: Int): Int = {
    var total4 = firstNr * secondNr
    println("the result is " + total4)
    total4
  }
}

  var selection = new Calculator()
  var option = 0

  while(option<5) {
    println("Welcome to the calculator: \npress 1 for adding \npress 2 for subtracting \npress 3 for multiplying \npress 4 for multiplication \npress 5 to exit")
    var option = scala.io.StdIn.readInt()

    if (option==1) {
      println("please enter your first number")
      var firstNr = scala.io.StdIn.readInt()
      println("please enter your second number")
      var secondNr = scala.io.StdIn.readInt()
      selection.add(firstNr,secondNr)
    }

    if (option==2) {
      println("please enter your first number")
      var firstNr = scala.io.StdIn.readInt()
      println("please enter your second number")
      var secondNr = scala.io.StdIn.readInt()
      selection.substract(firstNr,secondNr)
    }

    if (option==3) {
      println("please enter your first number")
      var firstNr = scala.io.StdIn.readInt()
      println("please enter your second number")
      var secondNr = scala.io.StdIn.readInt()
      selection.divide(firstNr,secondNr)
    }

    if (option==4) {
      println("please enter your first number")
      var firstNr = scala.io.StdIn.readInt()
      println("please enter your second number")
      var secondNr = scala.io.StdIn.readInt()
      selection.multiply(firstNr,secondNr)
    }
    
    if (option==5) {
        println("Thanks for using my calculator")
        sys.exit(0)
    }
  }
