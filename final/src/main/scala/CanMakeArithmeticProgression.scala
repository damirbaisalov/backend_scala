object CanMakeArithmeticProgression extends App{

  def canMakeArithmeticProgression(arr: Array[Int]): Boolean = {

    val sortedArr = arr.sorted
    //difference value which is constant
    val d = sortedArr(1)-sortedArr(0)

    for (i <- 2 until sortedArr.length){

      if (sortedArr(i)-sortedArr(i-1)!=d)
        return false
    }

    true
  }

  def testCase(): Unit = {
    val nums = Array(1,3,5)
    val result = canMakeArithmeticProgression(nums)

    print(result)
  }

  testCase()
}
