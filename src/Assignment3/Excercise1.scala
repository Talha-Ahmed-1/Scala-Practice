package Assignment3

object Excercise1 {
  val a = 3
  val b = 5
  val c = 7

  def loop(from:Int,to:Int):List[Int] = {
    def go(n:Int,n1:Int, res:List[Int]):List[Int] = {
      if (n == n1+1 ){
        res
      }else{
        go(n+1,n1, res :+ n)
      }
    }
    return go(from,to,List())
  }

  val lst = loop(-3,3)

  def y(x:Int) = a*(x*x) + b*x + c

  def main(args:Array[String]): Unit = {
    val lstRes = lst.map(y _)
    println(lstRes)
  }
}
