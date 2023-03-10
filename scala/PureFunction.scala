//A pure function is a function that depends only on its declared inputs and its internal algorithm to produce its output. It does not read any other values from “the outside world” — the world outside of the function's scope — and it does not modify any values in the outside world.
object PureFunction {
  val k = 10
  def main(args: Array[String]): Unit = {
    println(changeVal())
    println(sum(10,20))
  }
  //pure function
  def sum(i:Int , j:Int):Int={
    i+j*10
  }
  // not pure function
  def changeVal(): Int = {
    k
  }
}
