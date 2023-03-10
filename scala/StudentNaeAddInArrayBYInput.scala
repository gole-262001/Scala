import scala.io.StdIn.{readInt, readLine}

object StudentNaeAddInArrayBYInput {

  def main(args: Array[String]): Unit = {
    println("Enter the number of student")
    var num = readInt();
    var arr:Array[String] = new Array[String](num)
  println("please enter the name")
    for(i <- 0 to num-1)
      {
        arr(i) = readLine()

      }
    print("Your Student List is : ")
      for(j <- arr)
        {
          print(s"$j ")
        }
  }

}
