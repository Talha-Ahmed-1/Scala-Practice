package Assignment2

object Ex3 {
  def opType(param: Option[String]) = {
    if (param.isDefined) param
    else None
  }


  def main(args:Array[String]): Unit ={
    val op = opType(Some("Talha"))
    println(op.get)
  }

}
