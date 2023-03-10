import scala.io.StdIn.readInt

object PrintEvenNumber {
  def main(args: Array[String]): Unit = {
    println("Enter 1st Range ")
    var low = readInt()
    println("Enter 2nd range")
    var high = readInt();

    for(i <- low to high if(i % 6 != 0 && i % 2 == 0))
      {
        print(i +" ");
      }

  }
}
