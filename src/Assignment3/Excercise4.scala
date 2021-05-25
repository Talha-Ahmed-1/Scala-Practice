package Assignment3

object Excercise4 {
  val uList = List(1,2,3,4,5)
  val ulist_Twice = uList.map(_*2)

  def f(x:Int) = if (x>2) x*x else None
  val uList_Squared = uList.map(f(_))

  def g(v:Int) = List(v-1, v, v+1)
  val uList_Extended = uList.map(g(_))

  val ulist_Extended_flatmap = uList.flatMap(g(_))

  def main(args: Array[String]): Unit = {
    println(ulist_Twice)
    println(uList_Squared)
    println(uList_Extended)
    println(ulist_Extended_flatmap)


  }
}