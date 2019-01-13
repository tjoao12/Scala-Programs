object MorseCode extends App {

  var storage = ""
  def morseCode(word: String) {
      word match {
        case "a" | "A" => print(".-")
        case "b" | "B" => print("-...")
        case "c" | "C" => print("-.-.")
        case "d" | "D" => print("-..")
        case "e" | "E" => print(".")
        case "f" | "F" => print("..-.")
        case "g" | "G" => print("--.")
        case "h" | "H" => print("....")
        case "i" | "I" => print("..")
        case "j" | "J" => print(".---")
        case "k" | "K" => print("-.-")
        case "l" | "L" => print(".-..")
        case "m" | "M" => print("--")
        case "n" | "N" => print("-.")
        case "o" | "O" => print("---")
        case "p" | "P" => print(".--.")
        case "q" | "Q" => print("--.-")
        case "r" | "R" => print(".-.")
        case "s" | "S" => print("...")
        case "t" | "T" => print("-")
        case "u" | "U" => print("..-")
        case "v" | "V" => print("...-")
        case "w" | "W" => print(".--")
        case "x" | "X" => print("-..-")
        case "y" | "Y" => print("-.--")
        case "z" | "Z" => print("--..")

        case "0"       => print("-----")
        case "1"       => print(".----")
        case "2"       => print("..---")
        case "3"       => print("...--")
        case "4"       => print("....-")
        case "5"       => print("-----")
        case "6"       => print("-....")
        case "7"       => print("--...")
        case "8"       => print("---..")
        case "9"       => print("----.")
        case _         => print(" / ")

      }
    }

  def wordSplit (count:String){

    for (x<- 0 until count.length){
      storage += morseCode(count.substring(x,x+1))
    }
  }
  wordSplit("he l o lo o")
}

