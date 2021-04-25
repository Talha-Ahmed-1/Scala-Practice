package Assignment2

object Task4 {
  val arr1 = Array.fill(100)(util.Random.nextInt(100) )

  def countRecursive(arr:Array[Int]):Int={
    def go(arr:Array[Int], n:Int, res:Int):Int={
      if (n >= arr.size) res
      else{
        if (arr(n)%2 == 0) go(arr,n+1,res+1)
        else go(arr,n+1,res)
      }
    }
    go(arr,0,0)
  }

  def main(args:Array[String]): Unit = {
    arr1.foreach(println)
    println("1-- By using recursive function:",countRecursive(arr1))
    println("2-- By using count method:",arr1.count(_%2 == 0))
  }
}
