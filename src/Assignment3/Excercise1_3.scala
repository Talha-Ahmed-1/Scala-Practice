package Assignment3

object Excercise1_3 {
  implicit val x = "Talha"

  def fun(implicit vary:String):List[String] = List(vary)

  def main(args:Array[String]): Unit = {
    println(fun)
  }
}
