package Assignment2

object Ex1{
    //////////////////////////////////
    val way1 = Array(1,"2",3)
    //////////////////////////////////
    val n = 5
    val way2 = new Array[Int](n)
    for (i <- 0 until 5){
        way2(i) = i
    }
    //////////////////////////////////
    val way3 = way1 ++ way2

    def main(args:Array[String]): Unit ={
        for (i <- way1){
            println(i)
        }
        for (i <- way2){
            println(i)
        }
        for (i <- way3){
            println(i)
        }
    }

}