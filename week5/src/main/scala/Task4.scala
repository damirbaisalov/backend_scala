object Task4 extends App {

  def findPairs(nums: Array[Int], k: Int): Int = {

    var result = Set[(Int, Int)]()
    var numsSet = Set[Int]()

    if(k < 0)
      return 0

    for(i <- nums) {
      if(numsSet.contains(i + k)) {
        val minNum = math.min(i + k, i)
        val maxNum = math.max(i + k, i)
        result += ((minNum, maxNum))
      }
      if(numsSet.contains(i - k)) {
        val minNum = math.min(i - k, i)
        val maxNum = math.max(i - k, i)
        result += ((minNum, maxNum))
      }
      numsSet += i
    }

    result.size
  }

  def testCase(): Unit = {
    val nums = Array(3,1,4,1,5)
    val answer = findPairs(nums,2)
    print(answer)
  }

  testCase()
}
