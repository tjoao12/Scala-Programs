package Programs

  object MorseCode extends App {

    var storage = ""

    def morseCode(word: String) {

      word match {
        case "a" | "A" => println(".-")
        case "b" | "B" => println("-...")
        case "c" | "C" => println("-.-.")
        case "d" | "D" => println("-..")
        case "e" | "E" => println(".")
        case "f" | "F" => println("..-.")
        case "g" | "G" => println("--.")
        case "h" | "H" => println("....")
        case "i" | "I" => println("..")
        case "j" | "J" => println(".---")
        case "k" | "K" => println("-.-")
        case "l" | "L" => println(".-..")
        case "m" | "M" => println("--")
        case "n" | "N" => println("-.")
        case "o" | "O" => println("---")
        case "p" | "P" => println(".--.")
        case "q" | "Q" => println("--.-")
        case "r" | "R" => println(".-.")
        case "s" | "S" => println("...")
        case "t" | "T" => println("-")
        case "u" | "U" => println("..-")
        case "v" | "V" => println("...-")
        case "w" | "W" => println(".--")
        case "x" | "X" => println("-..-")
        case "y" | "Y" => println("-.--")
        case "z" | "Z" => println("--..")

        case "0" => print("-----")
        case "1" => print(".----")
        case "2" => print("..---")
        case "3" => print("...--")
        case "4" => print("....-")
        case "5" => print("-----")
        case "6" => print("-....")
        case "7" => print("--...")
        case "8" => print("---..")
        case "9" => print("----.")
        case _ => print(" / ")
      }

    }

    def wordSplit (count:String){

      for (x<- 0 until count.length){
        storage += morseCode(count.substring(x,x+1))
      }
    }
    wordSplit("he l o lo o")

}
