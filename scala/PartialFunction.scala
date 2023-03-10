object PartialFunction {
  def main(args: Array[String]): Unit = {
    val abill = getBill(20,100,400)
    println(abill)
    val actbill = calculateBill(400)
    println(s"====>$actbill")
  }
  def calculateBill=getBill(20,100,_:Double)  // partial function

  def getBill(vatPercentage:Int ,serviceTax:Int,netBill:Double):Double={
    return netBill*(vatPercentage/100) + serviceTax+netBill;
  }
}
