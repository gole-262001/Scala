import scala.io.StdIn.readInt

object MultipliationTable {
  def main(args: Array[String]): Unit = {
    println("enter number")
    var num = readInt()
    for (i <- 10 to 1 by -1 if (i != 7)) {
      var pro = (num * i);
      println(s"$num * $i = $pro");
    }

  }

}
