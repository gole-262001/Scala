import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;
object matchExample{
def main(args:Array[String])={
println("Please Enter the operator");
var opr = readLine()
println("Please Enter the First Number");
var first = readInt;
println("Please Enter the second Number");
var second = readInt;
opr match{
case "+" => println("Answer of operation " +(first + second));
case "-" => println("Answer of operation " +(first - second));
case "*" => println("Answer of operation " +(first * second));
case "/" => println("Answer of operation " +(first / second));
case _ => println("print proper Operator");
}
}}