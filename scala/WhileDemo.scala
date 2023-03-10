import scala.io.StdIn.readInt

//import scala.io.StdIn.readInt;
object WhileDemo {
  def main(args: Array[String]): Unit = {
        while(true)
          {
            println("Please Enter your input")
            println("1.add 2. subtract 3. divide 4. multiply")
            var choise = readInt()
            println("please enter a value")
            var  a = readInt()
            println("please enter b value")
            var b = readInt()
            choise match{
              case 1 => println(a+b);
              case 2 => println(a-b);
              case 3 => println(a*b);
              case 4 => println(a/b);
              case _ => println("invalid input");
            }
          }
  }

}
