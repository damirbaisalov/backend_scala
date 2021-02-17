object LeetCode1 extends App {

  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    var result: Array[Boolean] = new Array[Boolean](candies.length)
    var maxCandies = 0
    for (candy <- candies) {
      maxCandies = candy.max(maxCandies)
    }

    for (i <- result.indices) {
      if (candies(i)+extraCandies >= maxCandies)
        result(i) = true
      else
        result(i) = false
    }

    result
  }

  def test() = {
    val candies = Array(2,3,5,1,3)
    val extraCandies = 3
    val list = kidsWithCandies(candies, extraCandies)
    for (i <- list){
      print(i + " ")
    }
  }

  test()
}
