object MorseCode extends App {


  def morseCode(word: String) {
    var count = 0
    while (count < word.length) {
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
      }
      count += 1
      print(word)
    }
  }

    morseCode("joao")



}

