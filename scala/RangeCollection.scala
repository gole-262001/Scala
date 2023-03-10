\import scala.math.BigDecimal.double2bigDecimal

object RangeCollection {
  def main(args: Array[String]): Unit = {
    var r1  = 1 to 10;
    var r2 = 1 until 10;
    println("-----------------------------")
    println(r2);
    println(r2++r1);

    val oddRange = 1 to 100 by 2; // increment by 2;
    val evenRange = 10 to 100 by 2;
    println("-----------------------------")
    println(oddRange)
    println("-----------------------------")
    oddRange.foreach((i=> print(i +" ")))
    println("\n")
    evenRange.foreach((i=> print(i +" ")))
    println("\n")
    println("-----------------------------")
    val doubleRabge = 1.0 to 2.0 by 0.2;
    doubleRabge.foreach(i=>print(i +" "));
    println("\n")
    println("-----------------------------")
    val range = 1 to 10;
    val take2 : Range = range.take(2)
    take2.foreach(i=>print(i +" "))
    println("\n")
    println("----------------------------")
    val drop5: Range = range.drop(4)
    drop5.foreach(i=>print(i +" "));
  }
}
