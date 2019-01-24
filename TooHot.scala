import TooHot.tooHot

object TooHot extends App {

  def tooHot(temperature: Int, isSummer: Boolean) {
    if (isSummer) {
      if (temperature < 60 && temperature > 100) {
        println(s"$temperature and does not fall into range")
      }
      else{
        println(s"$temperature and does fall into range")
      }
    }
    else {
        if (temperature < 60 && temperature > 90) {
          println(s"$temperature and does not fall into range")
        }
        else{
          println(s"$temperature and does fall into range")
        }
    }
  }
    tooHot(90, true)

}