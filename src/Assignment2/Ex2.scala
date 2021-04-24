package Assignment2

object Ex2 {
  val set1 = scala.collection.mutable.Set("a","b",1)
  set1("add") = true
  set1.addOne(1234)

  val set2 = scala.collection.immutable.Set("ab","cb",12)
//  set2("add") = true

  set1 ++= set2 - 12

  def main(args:Array[String]): Unit ={
    for (i <- set1){
      println(i)
    }
  }
}
