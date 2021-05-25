package Assignment3

object Excercise1_2 {
  def apply(lst:List[Int]) = lst.reduce(_+_)

  def main(args: Array[String]): Unit = {
    println(this.apply(List(1,2,3)))
  }
}
