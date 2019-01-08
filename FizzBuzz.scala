object FizzBuzz extends App {
  def task13(word: String, word2: String, count: Int) {

    var amount = 1

    while (amount <= count) {

      if ((amount % 3 == 0) & (amount % 5 == 0)) {

        println(word + word2)

      }

      else if (amount % 3 == 0) {

        println(word)

      }

      else if (amount % 5 == 0) {

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

