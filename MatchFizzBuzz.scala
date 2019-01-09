object MatchFizzBuzz extends App {
  var number = 1

  while (number < 16) {

    number match {

      case 1 | 2 | 4 | 7 | 8 | 11 | 13 | 14 => println(number)

      case 3 | 6 | 9 | 12 => println("fizz")

      case 5 | 10 => println("buzz")

      case 15 => println("buzzfizz")

      case _ => println("not in the list")

    }

    number = number + 1

  }
}
