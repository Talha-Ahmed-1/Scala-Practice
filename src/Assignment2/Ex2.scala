package Assignment2

object Ex2 {
  val set1 = scala.collection.mutable.Set("a","b",1)
  set1("add") = true
  set1.addOne(1234)

  val set2 = scala.collection.immutable.Set("ab","cb",12)
//  set2("add") = true

  set1 ++= set2 - 12
//////////////////////////////////////////////////////////////
  val map1 = scala.collection.mutable.Map("one" -> 1, "two" -> 2, "three" -> 3)
  map1 += ("four" -> 4)
  map1("one") = 11

  val map2 = scala.collection.immutable.Map("one" -> 1, "two" -> 2, "three" -> 3)
//  following operations are not allowed in immutable map
//  map2 += ("four" -> 4)
//  map2("one") = 11

  def main(args:Array[String]): Unit ={
    for (i <- set1){
      println(i)
    }
    println(map1)
    println(map2)
  }
}
