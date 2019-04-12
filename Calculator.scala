object calculator extends App {

  startMenu
  def startMenu {
    println("Calculator \n(1)multiply (2)divide (3)subtract (4)add")
    var option = scala.io.StdIn.readInt

    option match {
      case 1 => multiply
      case 2 => divide
      case 3 => divide
      case 4 => add
      case _ => print("you have made a mistake")
    }
  }

  def multiply{
    println("Type in first number")
    var num1= readInt
    println("Type in second number")
    var num2= readInt
    var total= num1*num2
    println(s"The total is: $total")
    startMenu
  }
  def divide{
    println("Type in first number")
    var num1= readInt
    println("Type in second number")
    var num2= readInt
    var total= num1/num2
    println(s"The total is: $total")
    startMenu
  }
  def subtract{
    println("Type in first number")
    var num1= readInt
    println("Type in second number")
    var num2= readInt
    var total= num1-num2
    println(s"The total is: $total")
    startMenu
  }
  def add{
    println("Type in first number")
    var num1= readInt
    println("Type in second number")
    var num2= readInt
    var total= num1+num2
    println(s"The total is: $total")
    startMenu
  }
}
