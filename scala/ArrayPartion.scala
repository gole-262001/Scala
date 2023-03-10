object ArrayPartion {
  def main(args: Array[String]): Unit = {
    val myarr = Array(1,2,3,4,5,6,7,8,9)
/*
    val myarr2 = myarr.map((x)=>{
      x*2
    })
    var myarr3 = myarr.map(_*2)
    myarr2.foreach(println(_)+",")
    println("\n")
    myarr3.foreach(println(_))
*/
    println("1st method to partition")
    var (even,odd) = myarr.partition(p =>{
      if(p%2 == 0)  true;
      else  false;
    })

    even.foreach(print(_))
    println()
    odd.foreach(print(_))
    println()
    println("2nd method to partition")
    var(even1,odd1) = myarr.partition(_%2==0)
    even1.foreach(print(_))
    println()
    odd1.foreach(print(_))

  }

}
