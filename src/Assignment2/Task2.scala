package Assignment2

object Task2 {
  def CharArray(start:Int): List[Char] ={
    def go[T](n:Int, lst:List[Char]): List[Char]={
      if (n > 97+25) return lst
      else{
        go(n+1, lst ::: List(n.toChar))
      }
    }
    val lst = List()
    return go(start, lst)
  }

  def main(args:Array[String]): Unit = {
    println(CharArray(97))
  }
}
