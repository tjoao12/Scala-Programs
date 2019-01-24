object UniqueSum extends App{

  def uniqueSum (num1:Int, num2:Int, num3:Int)={

    var total = 0

    if (num1==num2 && num1==num3){
      println(s"$total")
    }
    else {
      if (num1==num3){
      total = num2
        println(s"$total")
      }
      else if (num1==num2){
        total = num3
        println(s"$total")
      }
      else if (num2==num3){
        total = num1
        println(s"$total")
      }
      else {
        total = num1 + num2 + num3
        println(s"$total")
      }
    }
  }
  uniqueSum (3,2,3)
}
