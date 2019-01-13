import scala.collection.mutable.ArrayBuffer

object practice extends App {

 val vector = Vector(1,2,3) //vectors are immutable
  println(vector)

  var y = List("joao", "jay", "jo")// lists are immutable
  for (i <- y) {
    println(i)
  }
  y map (_.toList)
  y flatMap(_.toList)
  println("the tail elements " + y.tail)
  println("the head element " + y.head)
  println("the last element " + y.last)

  var x = Array(1,2,3,4,7,6,5)//arrays values are mutable, size is immutable
  for (i <- x) {
    println(i)
  }
  println("the max is " + x.max)
  val min = x.reduceLeft(_ min _)
  println(s"The min number is: $min")
  val max = x.reduceRight(_ max _)
  println(s"The max number is: $max")
  val min1 = x.foldLeft(10)(_ + _)
  println(s"the min number is: $min1")


  val arrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Int]
  arrayBuffer +=1
  arrayBuffer += 33
  arrayBuffer.toArray
  println(arrayBuffer)

  val set = scala.collection.mutable.Set(1,2,3,4,5)//does not have an order or duplicate values
  val subSet = Set(8,9,3)
  set += 9
  set ++= subSet// adds subset
  set add 1// adds value
  set - 2 // removes 2
  subSet -- set // removes subset
  set retain (x => x >3) // gets rid of values less than 3
  println(set)
  set.clone()// you can clone sets

  val map = Map (1 -> "a", 2 -> "b")//???
  map(1)
  map.get(1)
  map.getOrElse(9, "No value found")
  map contains 3

  var sum = 0
  val list = List (1,2,3,4,5)

  list foreach (element => sum += element)
  print(list)
  println(sum)


}
