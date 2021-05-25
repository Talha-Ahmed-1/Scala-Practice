package Assignment3

object Excercise3 {
  val lst = List(1,2,3,4,5,6)

  def EuclideanNorm(lst: List[Int]) = math.sqrt(lst.map(math.pow(_,2)).reduce(_+_))

  def main(args:Array[String]): Unit = {
    println(s"Euclidean Norm = ${EuclideanNorm(lst)}")
  }
}
