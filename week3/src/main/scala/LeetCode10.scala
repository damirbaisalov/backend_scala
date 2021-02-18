object LeetCode10 extends App {
  def buildArray(target: Array[Int], n: Int): List[String] = {
    var result: List[String] = List[String]()
    var start = 1
    for(i <- target) {
      for(j <- start until i) {
        result :+= "Push"
        result :+= "Pop"
      }
      result :+= "Push"
      start = i + 1
    }
    result
  }

  def testCase(): Unit = {
    val target = Array(1,3)
    val n = 3
    var result = buildArray(target,n)

    for (i <- result)
      print(i + " ")
  }

  testCase()
}
