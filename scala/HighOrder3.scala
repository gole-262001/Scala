object HighOrder3 {
  def MathOperation(name :String): (Int ,Int) => Int

  =(x :Int, y:Int )=> {
    name match{
      case "addition" => x+y;
      case "multiplication" => x*y;
      case "division" => x/y;
      case "subtraction" => x-y;
    }
  }
  def add: (Int ,Int) => Int = {return MathOperation(name = "addition")}

  def mul : (Int ,Int) => Int = {MathOperation(name = "multiplication")}

  def div : (Int ,Int) => Int = {MathOperation(name = "division")}

  def sub : (Int ,Int) => Int = {MathOperation(name = "subtraction")}


  def main(args: Array[String]): Unit = {
    var v =add(10,4);
    println(v);
  }
}
