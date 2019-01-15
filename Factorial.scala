object Factorial extends App{


    def factorial(number: Int) {

      var number1 = number
      var total = 1

      while (number1 != 1) {
        total *= number1
        number1=(number1-1)

      }
      println(total)
    }
    factorial(10)

}
