object Main extends App{
  def task12 (a:String, b:Int) {

    var word = a

    var amount = b


    while (amount > 0) {

      println(word * b)

      amount = amount - 2 // if you want it as a square change the -1 to -2

    }
  }
    task12("O",10)


}

