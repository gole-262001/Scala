object StringInterpolation {
  def main(args: Array[String]): Unit = {
    var x = 10;
    var l = 2.2
    println(s"the value of x is $x");
    var k = s"this is the value $x"
    println(k);
    println(f"this is string $l%2.20f $k%S")
    println(s"the value \n of x is $x");
    println(raw"the value \n of x is $x");
    println(s"the valu$$e of x is $x");
  }
}
