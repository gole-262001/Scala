object HighOrder1 {
  def mycalculator(a:Int , b:Int,func:(Int,Int)=>Int):Int={
    var x = func(a,b);
    return a+b*x
  }
  def main(args: Array[String]): Unit = {
    var c = mycalculator(10,20,add)
    println(c)
  }
  def add(a:Int, b:Int): Int = {
    return (a+a)*(b+b)
  }
}
