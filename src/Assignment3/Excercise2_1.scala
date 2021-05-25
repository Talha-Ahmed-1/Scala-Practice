package Assignment3

import scala.collection.mutable.ArrayBuffer

object Excercise2_1 {
  case class Example(name:String, age:Int)

  def main(args:Array[String]): Unit = {
    val ob1 = new Example("Talha", 20)
    println("---Shallow Copy---")
    val ob2 = ob1.copy()
    println(ob1.name,ob2.name)
    println(ob1.age,ob2.age)
    println("case classes only do shallow copy rather than deep copy")

  }
}
