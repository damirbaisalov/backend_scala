object Task1 extends App {

  def maxProduct(nums: Array[Int]): Int = {

    val numsSorted = nums.sorted
    val result = (numsSorted(numsSorted.length-2)-1)*(numsSorted(numsSorted.length-1)-1)

    result
  }


  def maxProduct2(nums: Array[Int]): Int = {
    var max1 = 0
    var max2 = 0

    for (i <- nums) {
      if (i > max1) { //if current element is smaller than max1 then update both max1 and max2
        max2 = max1
        max1 = i
      }
      else if (i > max2) //if i is between  max1 and max2 then update second
        max2 = i
    }

    val result = (max1-1)*(max2-1)

    result
  }

  def testCase(): Unit = {
    val list = Array(1,5,4,5)
    print(maxProduct(list))
  }

  testCase()
}
