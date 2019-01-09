object TuesdayTasks extends App {
/*
  def task1(bottle1: Int) {
    var bottle2 = bottle1 - 1
    if (bottle1 > 0) {
      println(s"$bottle1 bottles of beer on the wall, $bottle1 bottles of beer.")
      println(s"Take one down and pass it around, $bottle2 bottles of beer on the wall.")
      task1(bottle1-1)
    }
    else {
      println("No more bottles of beer on the wall, no more bottles of beer.")
      println("Go to the store and buy some more, 99 bottles of beer on the wall.")
    }
  }
  task1(99)
*/
  var numbers = Array(2,2,3,4,5,5,6,6,8,10,11,5)
  //var numbers = Array.fill(10)(10)
  var Value = numbers.length
  var Count = 0

    while (Value>0) {
        Count=Value
      if (Value == Count) {
        println("this number is repeated:" + Count )
        sys.exit()
      }
      else {
        println("there are no repeated numbers")
      }
      Value-1
    }

}