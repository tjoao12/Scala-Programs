object PrimeNumbers extends App {

  var number = 1
  var prime = 1

  while (number<100){
    if (number%prime==0){
      prime = number
      println(prime + " is a prime number")
    }
    else {
      println(number + " is not a prime number")
    }

    number= number+1
  }

}
  /*println("Please enter your number limit")
  var num = scala.io.StdIn.readInt()
  var number = 2


  for (i <- 3 to num by 2) {
    var count = 0
    while (count < num) {
      if (i % 2 == 0 && i!=count) {
        println(count + " is a prime number")
        count = count + 1
      }
      else {
        println(i + " is not a prime number")
      }
      number=count+1

    }
    println(s"The amount of prime numbers are $count")
  }*/

