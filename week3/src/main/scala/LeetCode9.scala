object LeetCode9 extends App {
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {

    var setOfNums1 = Set[Int]()
    var setOfNums2 = Set[Int]()

    for (i <- nums1) {
      setOfNums1 += i
    }
    for (i <- nums2) {
      setOfNums2 += i
    }
    var result: Array[Int] = new Array[Int](100)
    result = setOfNums1.intersect(setOfNums2).toArray

    result
  }

  def testCase(): Unit = {
    val nums1 = Array(1,2,2,1)
    val nums2 = Array(2,2)

    val result = intersection(nums1,nums2)
    for (i <- result)
      print(i + " ")
  }

  testCase()
}
