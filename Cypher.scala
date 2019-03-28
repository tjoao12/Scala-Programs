object Cypher extends App {

  var list = List[String](".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
  var list2 = ('a' to 'z').toList
  var storage = " "


  startMenu(storage:String, list: List[String], list2:List[Char])

  def startMenu(storage:String, list: List[String], list2:List[Char]) {
    println("This is the Cypher, press (1) to type a sentence or anything else to quit")
    scala.io.StdIn.readInt match {
      case 1 => typeWord(storage:String, list: List[String], list2:List[Char])
      case _ => sys.exit(0)
    }
  }
  def typeWord (storage:String, list: List[String], list2:List[Char]) {

    println("type in your sentence")
    var input = scala.io.StdIn.readLine
    converter(input, storage, list, list2)
  }

  def converter(input: String, storage: String, list: List[String], list2:List[Char]) {
    var storage = " "
    for (x <- 0 until input.length) {
      for (i <- 0 until list2.length) {
        if (input.substring(x,x+1) == list2(i).toString) {
          storage+= list(i) + " "
        }
      }
      if (x>0 && storage.substring(x-1,x)!= " " && input.substring(x,x+1)==" ") {
        storage+= " / "
      }
    }
    println("The outcome is" + storage)
    startMenu(storage:String, list: List[String], list2:List[Char])
  }
}
