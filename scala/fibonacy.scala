import scala.io.StdIn.readInt
object fibonacy {
  def main(args: Array[String]): Unit = {
    println("how many fibonacy digit you want");
    var num = readInt()
    var i = 0;
    while(i < num)
      {
        print(" " +fin(i))
        i = i+1;
      }
  }
  def fin(num : Int):Int={
      if(num == 1 || num ==0)
        {
          return num;
        }else{

        return (fin(num-1)+fin(num-2));
      }

  }


}
