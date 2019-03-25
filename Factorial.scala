object Factorial extends App {
var total=1
  
  def factorial (n: Int){
    if(n==1){
      print(total)
    }else{
      total=total*n
        factorial(n-1)
    }
  }
  factorial(5)
}
