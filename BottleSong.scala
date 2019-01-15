object BottleSong extends App {

  def bottle(bottle1: Int) {
    var bottle2 = bottle1 - 1
    if (bottle1 > 0) {
      println(s"$bottle1 bottles of beer on the wall, $bottle1 bottles of beer.")
      println(s"Take one down and pass it around, $bottle2 bottles of beer on the wall.")
      bottle(bottle1-1)
    }
    else {
      println("No more bottles of beer on the wall, no more bottles of beer.")
      println("Go to the store and buy some more, 99 bottles of beer on the wall.")
    }
  }
  bottle(99)


}