import BrokenKeyboard.WordStorage

object BrokenKeyboard extends App {
  import scala.io.Source
  var Characters = Array("a", "b", "c", "d")
  val file = "C:\\myfriend\\Scala\\ScalaChallenge\\words.txt"
  val words = Source.fromFile(file).getLines.toArray
  var WordStorage = " "
  var wordLength = 0

  for (x <- 0 until words.length) {
    WordStorage = words(x)
    while (wordLength < WordStorage.length){
      if (WordStorage.substring(x,x+1) != Characters(0) && WordStorage.substring(x,x+1) != Characters(1) && WordStorage.substring(x,x+1) != Characters(2) && WordStorage.substring(x,x+1) != Characters(3)) {
        wordLength+= WordStorage.length
        wordLength = 0
      }else{
          println(WordStorage)
          wordLength+=1
      }
     }
  }
}

//println("Please enter a number")
//scala.io.StdIn.readInt()
