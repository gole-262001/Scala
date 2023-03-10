object StringCompare {
  def main(args: Array[String]): Unit = {
    val a = "hello"
    val b = "hello"
    if(a == b)
      {
        println("a is equal to b")
      }else{
      println("a is not equals to b")
    }
    if(a eq b)
      {
        println("a is equal to b")
      }else{
      println("a is not equals to b")
    }
    if(a.equals(b))
      {
        println("is equsls")
      }
      val k = "kite";
    val l = "kite";
    if (k == l) {
      println("k is equal to l")
    } else {
      println("k is not equals to l")
    }
    if (k eq l) {
      println("k is equal to l")
    } else {
      println("k is not equals to l")
    }
    if(k.toUpperCase() == l.toUpperCase())
      {
        println("k and l are equal ")
      }

  }
}
