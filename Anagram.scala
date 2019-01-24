import scala.io.Source

object Anagram extends App {
  val word = Source.fromFile("C:\\myfriend\\Scala\\ScalaChallenge\\anagram.txt").getLines.toArray

  def wordCount(words:String){

  for (y <- 0 until word.length){
    println(word(y))
  }
  }
  wordCount("abc")
}
