package Assignment3

object Excercise2_2 {
  def main(args:Array[String]): Unit = {}
  println("-------This code is written in CHISEL and successfully tested by using SBT-------")
  println("You run this code by using SBT, as this code is not run in this folder.")
}
//
//import chisel3._
//import chisel3.util._
//import chisel3.experimental._
//
//object Main extends App{
//  println((new chisel3.stage.ChiselStage).emitVerilog(new Top(new Add, new Sub)))
//}
//
//trait ModuleIO {
//  def in1:UInt
//  def in2:UInt
//  def out:UInt
//}
//class Add extends RawModule with ModuleIO {
//  val in1 =IO(Input(UInt(8.W)))
//  val in2 =IO(Input(UInt(8.W)))
//  val out =IO(Output(UInt(8.W)))
//  out := in1+in2
//}
//class Sub extends RawModule with ModuleIO {
//  val in1 =IO(Input(UInt(8.W)))
//  val in2 =IO(Input(UInt(8.W)))
//  val out =IO(Output(UInt(8.W)))
//  out := in1-in2
//}
//class Top[T <: BaseModule with ModuleIO] (genT: =>T, genT1: =>T) extends Module{
//  val io = IO(new Bundle{
//    val in1=Input(UInt(8.W))
//    val in2=Input(UInt(8.W))
//    val out=Output(UInt(8.W))
//  })
//  val sub_Module = Module(genT)
//  val sub_Module1 = Module(genT1)
//
//  sub_Module.in1:=io.in1
//  sub_Module.in2:=io.in2
//  io.out := sub_Module.out
//
//  sub_Module1.in1:=io.in1
//  sub_Module1.in2:=io.in2
//  io.out := sub_Module1.out
//}