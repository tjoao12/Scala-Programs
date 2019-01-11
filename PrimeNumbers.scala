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


