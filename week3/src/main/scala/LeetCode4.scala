object LeetCode4 extends App {
  def repeatedNTimes(A: Array[Int]): Int = {
    var uniqueArray = Set[Int]()
    var result = 0
    for (num <- A) {
      if (uniqueArray.contains(num))
        result = num
      uniqueArray+=num
    }

    result
  }

  def test() = {
    val nums = Array(1,2,3,4)
    val res = repeatedNTimes(nums)
    print(res)
  }

  test()
}
