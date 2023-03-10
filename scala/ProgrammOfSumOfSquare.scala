object ProgrammOfSumOfSquare {
  def compute(a: Int, b: Int, func: (Int) => Int): Int = {
    var x = func(a) + func(b);
    return x
  }
  def main(args: Array[String]): Unit = {
    var ans = compute(4:Int , 5:Int , square)
    var ans1 = compute(4:Int , 5:Int , cube);
    var ans3 = compute(10,30,(x:Int)=>{
      x*x*x*x*x
    })
    println(ans);
    println(ans1);
    println(s"===> $ans3");
  }
  def square(a : Int): Int = {
    return a*a ;
  }
  def cube(a : Int): Int = {
    return a*a*a ;
  }
}
