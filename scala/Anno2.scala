import java.lang

object Anno2 {
  def main(args: Array[String]): Unit = {
    var x = (v1:String , v2 :String) =>{
        s"v1 is $v1 v2 is $v2"
    }
    println(x("abc" , "xyz"))

    var x1 =(_:Int) + (_:Int)
      println(x1(10,20));
  }
}
