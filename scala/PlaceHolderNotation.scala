
object PlaceHolderNotation {
  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 20
val v1 = testM(_+_,a,b,30.0)
    println(s"===>$v1")

  }
  def testM(highfunction: (Int, Int) => Int, a: Int, b: Int, d: Double): Double = {

    return highfunction(a, b) * d
  }
  }




