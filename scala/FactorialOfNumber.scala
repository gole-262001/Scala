import scala.io.StdIn.readInt

object FactorialOfNumber {

  def main(args: Array[String]): Unit = {
    println("Enter the Number");

    val num = readInt();
    println(s"factorial of $num  is " +factorial(num));
    /*
    var number = num;
    if(num == 0 && num == 1)
      {
        println(s"Factorial of $number is" +1)
      }else{
      while(num >= 1)
        {
          fac = fac * num;
          num = num - 1;
        }
      println(s"Factorial of $number is " +fac)
    }

     */

  }
  /*
  def factorial(v :Int): Int={
    var n = v;
    var fac = 1;
    if (n == 0 && n == 1) {
      return 1;
    } else {
      while (n >= 1) {
        fac = fac * n;
        n = n - 1
      }
      return fac;
    }

  }
   */
  /*
  def factorial(v: Int): Int = {
  if(v <= 1)
    {
      return 1;
    }else{
     return v * factorial(v-1);
    }

  }

   */
  def factorial(v: Int): Int = {
   return if(v<=1) 1 else v * factorial(v-1);

  }

}
