object Library extends App {

  var choice = List[String]("Game of Throne", "Harry Potter", "Motivation")

  def findBook(book: String): String = {
    for (x <- 0 until choice.length) {
      if (choice(x) == book) {
        return choice(x)
      }
    }
    return "the library doesnt have this book"
  }

  println(findBook(book="Harry Potter"))
}
