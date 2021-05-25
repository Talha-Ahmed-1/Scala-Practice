package Assignment2
import scala.util.Random.nextInt
object Task1 {
  val lst = List.fill(15)(util.Random.between(50,500))
  val isPrime:Int => Boolean = n => n <= 1 || n == 2 || !(2 to (n-1)).exists(n % _ == 0)
  val iter = lst.filter(isPrime).sortWith(_ < _).iterator
//  val iter = lst.filter(_%2 != 0).sortWith(_ < _).iterator
  val map1 = scala.collection.mutable.Map[Int,Int]()
  def main(args:Array[String]): Unit = {
    println("Iterator values are:")
    var count = 0
    while (iter.hasNext){
      val item = iter.next()
      map1 += (item -> count)
      println(item)
      count += 1
    }
    println("Formatted Map:")
    println(map1)
  }
}
