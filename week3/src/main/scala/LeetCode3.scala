
object LeetCode3 extends App {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    var cnt = 0
    val list: Array[Int] = new Array[Int](nums.length)
    for (i <- nums.indices){
      for (j <- nums.indices)
      {
        if (nums(i)!=nums(j) && nums(j)<nums(i))
        {
          cnt=cnt+1
        }
      }
      list(i) = cnt
      cnt = 0
    }

    list
  }

  def test() = {
    val nums = Array(8,1,2,2,3)
    val list = smallerNumbersThanCurrent(nums)
    for (i <- list){
      print(i + " ")
    }
  }

  test()
}
