object LeetCode10 extends App {
  def buildArray(target: Array[Int], n: Int): List[String] = {
    var result: List[String] = List[String]()
    var start = 1
    for (i <- target.indices) {
      if (target(i) == start) {
        result +:="push"
      } else {
        result +:="push"
        result +:="pop"
      }
      start=start+1
    }

    result
  }
}
