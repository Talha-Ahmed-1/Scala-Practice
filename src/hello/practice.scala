package hello

import javax.swing.text.html.HTML

object practice extends App {
//  val multiplyByTwo: Int => Int = i => i * 2
//  val display: Int => String = i => "  -- RESULT : $i"
//  println(multiplyByTwo)
//  def abc(): String = { val ab = "talha"
//  ab}
//  println(abc())


//  def displayPage(): Int = { val HTML = "<html> <body></body> </html>" }
//  println(displayPage("talha"))

//  val some: Option[Int] = Some(10)
//
//  val multiplyByTwo: Int => Int = i => i * 2 //is this function pure ?
//  val display: Int => String = i => s"  -- RESULT : $i" // does this function have any knowledge about context?
//
//  some.map(multiplyByTwo).foreach(i => println(s"  -- multiplied by two : $i"))
//  some.map(multiplyByTwo).map(display).foreach(println)
//
//  val default = some.filter(_ > 10).getOrElse(-1)
//  some.filter(_ > 10).orElse(Some(-1)).map(i => s" -- filter(remove) & orElse -1 : i=$i").foreach(println)
//  some.filter(_ < 10).orElse(Some(-1)).map(i => s" -- filter & orElse : i=$i").foreach(println)
//  some.filter(_ == 10).orElse(Some(-1)).map(i => s"-- filter accessed : i=$i").foreach(println)
//
////  val onSuccess: Int => String = i => s"business value $i"
//  val onSuccess: Int => String = b => s"abc $b*1"
//  val onError: String = "raise an error"
//  val result = some.fold(onError)(onSuccess)
//  println(result)

//  case class Purchase(productName: String, date: String, profit: Int)
//
//  val purchasesOnDate: String => List[Purchase] = _ match {
//    case ("01-01-2016") => List(Purchase("tv", "01-01-2016", 300), Purchase("console", "01-01-2016", 200))
//  }
//
//  println("  -- counting profit - moving from set of possible values into a single value")
//  val singleProfit = purchasesOnDate("01-01-2016").map(_.profit).reduce(_ + _)
//  println("  -- singleProfit : " + singleProfit)
//  def sum(b:Int): Int = b
//  val a = List(1,2,3)
//  println(a.flatMap(sum))
    object abc {
      var a = 2
    }

    val b = abc
    b.a = 3

    val c = abc
    c.a = 4

    println(b.a,c.a)


}

