object FizzBuzz extends App {
  def task13(word: String, word2: String, count: Int) {

    var amount = 1

    while (amount <= count) {

      val mod3 = amount % 3 == 0
      val mod5 = amount % 5 == 0
      if (mod3 & mod5) {

        println(word + word2)

      }

      else if (mod3) {

        println(word)

      }

      else if (mod5) {

        println(word2)

      }

      else {

        println(amount)

      }

      amount = amount + 1

    }

  }

  task13("Fizz", "Buzz", 50)
}


