object Main extends App {

  var total = 0

  def naturalNumbers(count: Int, number: Int): Int = {

    if (count <= number) {
      total = total + count
      naturalNumbers(count + 1, number)
    }
    total
  }

  println(s"Number Sum: ${naturalNumbers(1, 10)}")


  var total2=1

  def recursion(num1: Int, num2:Int):Int ={

    if(num1==0) num1
    if (num1<=num2) {
      total2 = total2 * num1
      recursion(num1+1, num2)
    }
  total2
  }
  println(s"the recursion is ${recursion(1,5)}")


  var myArray = Array(1,2,3,4,5,6,7,8,8,9,10)
  var zero = 0
  def zeroCounter(myArray:Array[Int], element:Int):Int={
    if(element<myArray.length){
      if(myArray(element)==0) zero+=1
      zeroCounter(myArray,element+1)
    }
    zero
  }
  println(s"Number of zeroes is: ${zeroCounter(myArray,0)}")


  var result = myArray(0)

  def minimumNumber(myArray:Array[Int], element:Int):Int={
    if(element<myArray.length){
      if(myArray(element)<result) result=myArray(element)
      minimumNumber(myArray,element+1)
    }
    result
  }
  println(s"Smallest number is: ${minimumNumber(myArray,0)}")



  def printerArray(myArray:Array[Int], element:Int):Unit={
    if(element<myArray.length){
      println(myArray(element))
      printerArray(myArray, element+1)
    }
  }
  printerArray(myArray,0)

}
