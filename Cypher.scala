object Cypher extends App {


  var storage = " "


  def Cypher(word:String) {

    word match {
      case "a" | "A" => print("Z")
      case "b" | "B" => print("Y")
      case "c" | "C" => print("X")
      case "d" | "D" => print("W")
      case "e" | "E" => print("V")
      case "f" | "F" => print("U")
      case "g" | "G" => print("T")
      case "h" | "H" => print("S")
      case "i" | "I" => print("R")
      case "j" | "J" => print("Q")
      case "k" | "K" => print("P")
      case "l" | "L" => print("O")
      case "m" | "M" => print("N")
      case "n" | "N" => print("M")
      case "o" | "O" => print("L")
      case "p" | "P" => print("K")
      case "q" | "Q" => print("J")
      case "r" | "R" => print("I")
      case "s" | "S" => print("H")
      case "t" | "T" => print("G")
      case "u" | "U" => print("F")
      case "v" | "V" => print("E")
      case "w" | "W" => print("D")
      case "x" | "X" => print("C")
      case "y" | "Y" => print("B")
      case "z" | "Z" => print("A")
    }
  }

    def wordSplit (wordCount:String){

      for (x<- 0 until wordCount.length){
        storage += Cypher(wordCount.substring(x,x+1))
      }
    }
    wordSplit("abc")
}
