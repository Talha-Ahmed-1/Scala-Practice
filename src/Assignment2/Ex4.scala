package Assignment2

object Ex4 {

  val array1 = Array.range(1,100)

  def main(args:Array[String]): Unit ={
    val a = array1.filter(_%2 == 0)
    println(a.foreach(println))
    println(a.forall(_ > 0))
  }
}
