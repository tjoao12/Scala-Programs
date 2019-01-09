object Iteration extends App {

  def task12(word: String, count: Int) {

    var amount = count

    while (amount > 0) {

      println(word * count)

      amount = amount - 1 // if you want it as a square change the -1 to -2

    }

  }

  task12("h", 10)
}
