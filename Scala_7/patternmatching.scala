import scala.io.StdIn.readInt;
object matchExample{
def main(args:Array[String])={
println("Please Enter the value");
var ip: Int = readInt()
ip match{
case 1 => println("this is first line");
case 2 => println("this is second line");
case _ => println("this is default line");
}
}}