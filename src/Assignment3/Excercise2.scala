package Assignment3
import Excercise1._

object Excercise2 {
  val lst1 = loop(-3,3)
  val lst2 = lst1.map(y _)

  val lst3 = lst1.zip(lst2).zipWithIndex map {case ((a, b), c) => List(a, b, c)}

  val sum1 = lst3.map(_(1)).reduce(_+_)
  val sum2 = lst3.map(_(2)).reduce(_ max _)+1
  val mean = sum1/sum2

  def main(args:Array[String]): Unit = {
    println(lst3)
    println(s"Mean = ${mean}")
  }

}
