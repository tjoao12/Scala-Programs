object AmountOfWords extends App {

  def counter(words:String){

    var amount=0
    var amount2=0
    var word= "Joao"
    var wordCounter = words.split(" ")

    for (x<- 0 to wordCounter.length-1) {

      if (wordCounter(x) == word) {
        amount += 1
      }else {
        amount2 +=1
      }
    }
    println("The amount of " + word + "(s) is " + amount)
    println(amount2 + " are not the word " + word)
  }
  counter("Joao Joao is Joao is is")
}
