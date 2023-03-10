object SetExample {
  def main(args: Array[String]): Unit = {
    val myset = Set(1,2,3,4,5,6,7)
    println(myset)
    println(myset.tail)
    println(myset.head+"===")
    println(myset.size)
    val myset2 = myset.map(x=>x*x)
    val myset3 = myset.flatMap(x=>List((x*x),10,20))
    println(myset3)
    println(myset2)

    println(myset.isEmpty)
    println(myset2.apply(2))
    val myset4 = myset.diff(myset2)
    println(myset4)
    val myset6 = myset.intersect(myset2)
    println(myset6)
    val myset7 = myset.union((myset3))
    println(myset7)
    println("--------------------")
    for(elem <- myset) {println(elem)}
    val myset8 = myset++myset6
    println(myset8)


  }

}
