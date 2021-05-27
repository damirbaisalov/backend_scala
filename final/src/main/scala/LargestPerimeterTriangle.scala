object LargestPerimeterTriangle extends App{

  def largestPerimeter(nums: Array[Int]): Int = {

    var result = 0
    val newNums = nums.sorted

    for (i <- 0 until newNums.length-2) {

      //check for triangle rule a+b>c
      if (newNums(i)+newNums(i+1)>newNums(i+2))
        result = result.max(newNums(i)+newNums(i+1)+newNums(i+2))
    }

    result
  }

  def testCase(): Unit = {
    val nums = Array(1,3,3,5)
    val result = largestPerimeter(nums)

    print(result)
  }

  testCase()
}
