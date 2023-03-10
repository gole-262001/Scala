
object ArrayTest {
  def main(args: Array[String]): Unit = {

    val myArr = Array.ofDim[Int](2, 2)
    var n: Int = 2
    var column: Int = 4
    var row: Int = 2
    val myArr2 = Array(Array(1, 2, 3, 4), Array(3, 4, 5, 6))
    myArr(0)(0) = 10
    myArr(0)(1) = 20
    /*
    println(myArr(0)(0))
    for(i <- 0 until n; j <- 0 until n)
      {
        print(i,j)
        println("=" +myArr(i)(j))

      }

    for(i <-0 until  row)
      {
        for( j <-0 until column)
          {
            print(" " +myArr2(i)(j));
          }
          println("\n");
      }

    */
    /*
    val myArr3 = Array(Array(1,2,3,4),Array(3,4,5,6),Array(7,8,9,10),Array(11,12,13,14))
    for (i <- 0 until myArr3.length) {
      for (j <- 0 until myArr3(i).length) {
        print(" " + myArr3(i)(j));
      }
      println("\n");
    }

    */
    var v = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //    v.foreach(printthis)
    //    v.foreach(n=>println(n));
    v.foreach((n)=>{
      println(n)
    })

  }
    def printthis(i:Int)={
      if(i == 5)
      {
        println("Five")
      }else{
        println(i)
      }
    }

    def printArr(arr:Array[Int]): Unit = {
      arr.foreach(printValue)
      println("\n")
    }
    def printValue(i:Int): Unit = {
      print(s"$i,")
    }


  }

