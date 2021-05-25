package Assignment2
import scala.collection.mutable.Map
object Task5 {
  def buildMap[A,B](data:Seq[A], f:A=>B): Map[A,B] ={
    val map1 = Map[A,B]()
    def go(data:Seq[A], f:A=>B, n:Int):Map[A,B]={
      if (n < 0) map1
      else{
        map1 ++= Map(data(n) -> f(data(n)))
//        println(f(data(n)),data(n))
        go(data, f, n-1)
      }
    }
    return go(data, f, data.size-1)
  }
  val lst = Array(1,2,3,4,5,6,7,8,9,10)
  def f: Int => Boolean = n => n%2 == 0
  def main(args:Array[String]): Unit = {
    val result = buildMap(lst,f)
    println(result)
  }
}
