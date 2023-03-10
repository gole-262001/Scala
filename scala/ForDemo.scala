object ForDemo {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10)
      {
        println(i +" ");
      }
      for(i <- 1 until 10)
        {
          println(s"hello $i")
        }
        for(i <- 1 to 10 if i%2 == 0)
          {
            println(i +" ");
          }
    for (i <- 1 to 10 by 2) {
      println(s"hello $i")
    }
    for (i <- 1 to -10 by -2) {
      println(s"hello $i")
    }
    for (i <- 1 to -10 by -2 if i%2 == 0) {
      println(s"hello $i")
    }
  }
}
