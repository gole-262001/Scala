object FunctionDemo {
  def main(args: Array[String]): Unit = {
    var result = sum(10,20)
    println(result);
  }
  def sum(a:Int , b:Int):Int={
  var sum = a+b;
    return sum;
  }
}
