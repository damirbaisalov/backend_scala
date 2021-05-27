object MaximumUnitsOnTruck extends App {

  def maximumUnits(boxTypes: Array[Array[Int]], truckSize: Int): Int = {

    //reverse sorting with given condition
    var newBoxTypes = boxTypes.sortWith((a,b)=>a(1)>b(1))
    var sum = 0
    var res=0
    var k = 0

    while (k<newBoxTypes.length){

      sum+=newBoxTypes(k)(0)
      if (sum<=truckSize){
        res+=newBoxTypes(k)(0)*newBoxTypes(k)(1)
      } else {
        sum-=newBoxTypes(k)(0)
        res+=(truckSize-sum)*newBoxTypes(k)(1)
        return res
      }
      k+=1
    }

    res

  }

  def testCase(): Unit = {
    val s = Array(Array(1,3),Array(2,2),Array(3,1))
    val t = 4

    val result = maximumUnits(s,t)

    print(result)
  }

  testCase()

}
