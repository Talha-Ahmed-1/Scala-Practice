package Assignment3

object Excercise1 {
  val a = 3
  val b = 5
  val c = 7
  val lst = List(-3,-2,-1,0,1,2,3)

  def y(x:Int) = a*(x*x) + b*x + c

  def main(args:Array[String]): Unit = {
    val lstRes = lst.map(y _)
    println(lstRes)
  }
}
