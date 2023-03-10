object RecursionTail {
  def main(args: Array[String]): Unit = {
    println(factorial(20))
  }

  def factorial(n: BigInt): BigInt = {

    var x = 10
    var y = 10
    var x1 = 10
    var x2 = 10
    var x3 = 10


    if (n <= 1)
      1
    else {
      n * factorial(n - 1)
    }
  }

}
