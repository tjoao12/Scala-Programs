
object BrokenKeyboard extends App {
  import scala.io.Source

  def WordCalc: Unit = {

    val lines = Source.fromFile("C:\\myfriend\\Scala\\ScalaChallenge\\words.txt").getLines.toArray
    println("please enter your word")
    val word = scala.io.StdIn.readLine()
    val array = word.toArray
    val arrayLength = array.length
    var wordCount = 0
    var char = 0
    var count = 0
    var LongestLength = 0
    var LongestWord = " "
    var length = 0



    while (wordCount < lines.length) {
      while (count < arrayLength) {
        if (lines(wordCount).contains(array(char))) {
          char += 1
          count += 1
        }
        else {
          count += 1
        }
      }
      if (char == arrayLength) {
        println(lines(wordCount))
        length = lines(wordCount).length()
        if( length > LongestLength) {
          LongestWord = lines(wordCount)
          LongestLength = length
        }
        wordCount += 1
        char = 0
        count = 0
      }
      else {
        wordCount += 1
        char = 0
        count = 0
      }
    }
    println(s"the longest word is: $LongestWord")
  }
  println("please enter number")
  val WordNumber = scala.io.StdIn.readInt()
  var b = 0
  while( b < WordNumber) {
    WordCalc
    b+=1
  }
}
