object TuppleExample {
  def main(args: Array[String]): Unit = {
    var mytuple = (1,2.0,31,4.1,"test")
    var mytuple2 = new Tuple5(1,2.0,31,4.1,"test")
    var mytuple3 = new Tuple6(1,2.0,31,4.1,"test",(2,3))
    var mytuple6 = new Tuple6(1,2.0,31,4.1,"test" ,(2,3))

    println(mytuple._1) // give 1st element of tuple mytuple
    println(mytuple3._6._1)  // give 6st element og tuple mytuple3 which is tuple and give 1st element

    println("1st method of print tuple")
    mytuple2.productIterator.foreach((x)=>{
      println(x)
    })
    println("2st method of print tuple")
    mytuple2.productIterator.foreach((x)=> println(x));
    println("3st method of print tuple")
    mytuple2.productIterator.foreach( println(_));

    var mytuple4 = ("a"->"b")  // this symbol is used for only two element
    println(mytuple4)

    var(z,i) = mytuple4
    println(z)
    println(i)

  }
}
