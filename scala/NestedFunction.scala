object NestedFunction {
  def main(args: Array[String]): Unit = {
    findMinMax(100,200)
  }
  def findMinMax(i:Int , j :Int): Unit = {
    def max(i:Int , j:Int): Unit = {
      if(i > j)
        {
          println(s"$i is max")
        }
    }

    def min(i: Int, j: Int): Unit = {
      if (i < j) {
        println(s"$j is max")
        println(s"$i is min")
      }
    }

    max(i,j)
    min(i,j)
  }

}
