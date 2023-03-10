object Student{
def main(args:Array[String])
{
	var name = args(0)
	var first = args(1).toInt
      var second = args(2).toInt 
      var third = args(3).toInt
      var fourth = args(4).toInt
      var five = args(5).toInt
	
        var ans = ((first+second+third+fourth+five)/5) ;
		// println("percentage of " +name +" " +ans);
		if(ans >= 30) 
			{
				println("Pass")

			}else{println("Fail")}
	  
	
}
}


