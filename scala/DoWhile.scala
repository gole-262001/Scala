import scala.io.StdIn.readInt

object DoWhile {
  def main(args: Array[String]): Unit = {
    do{
      println("Please Enter your input")
      println("1.add 2. subtract 3. divide 4. multiply")
      var choise = readInt()
      println("please enter a value")
      var a = readInt()
      println("please enter b value")
      var b = readInt()
      choise match {
        case 1 =>
          var sum = a+b
          println(s"addition result$sum");
        case 2 => println(a - b);
        case 3 => println(a * b);
        case 4 => println(a / b);
        case _ => println("invalid input");
      }
    }while(true)
  }
}
