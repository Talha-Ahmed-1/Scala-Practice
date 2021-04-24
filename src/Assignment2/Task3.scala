package Assignment2

object Task3 {

  def ArraySum(arr1:Array[Double], arr2:Array[Double], arr3:Array[Double]):Array[Double] = {
    def go(n:Int, arr1:Array[Double], arr2:Array[Double], arr3:Array[Double]): Array[Double]={
      if (n < 0) arr3
      else{
        arr3(n) = arr1(n)+arr2(n)
        go(n-1, arr1, arr2, arr3)
      }
    }
    return go(arr1.size-1, arr1,arr2,arr3)
  }

  def main(args:Array[String]): Unit = {
    val arr1 = Array(1.0,2.0,3.0)
    val arr2 = Array(4.0,5.0,6.0)

    val arr3 = new Array[Double](arr1.size)
    for (i <- ArraySum(arr1,arr2,arr3)) {
      println(i)
    }
  }
}
