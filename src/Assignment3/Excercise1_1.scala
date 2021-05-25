package Assignment3
import scala.util.control.Breaks._


//Implemented Counter by usin FSM and companion object
class Excercise1_1{
  // Params
  val initial = 5
  val max = 20

  //Initialize state and counter
  var state = Excercise1_1.first.toString
  var count = initial

  //Counter Begins
  while (true){
    state match {
      case "idle" => {
        print(s"${count}\n")
        count = count + 1
        println(count)
        state = Excercise1_1.second.toString
      }
      case "going_up" => {
        if (count == max){
          count = initial
          state = Excercise1_1.third.toString
        }
        else{
          count = count + 1
          println(count)
        }
      }
      case "exit" => break//println("FSM Exit")
    }
  }
}


object Excercise1_1 extends Enumeration {

  val first = Value("idle")
  val second = Value("going_up")
  val third = Value("exit")

  def main(args:Array[String]): Unit = {
    val obj = new Excercise1_1()
//    println(first)
  }
}
