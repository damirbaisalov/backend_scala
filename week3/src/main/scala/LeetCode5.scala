object LeetCode5 extends App {

  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    var index = 0
    var sizeOfList = 0

    for(i <- nums.indices) {
      if(i % 2 == 0) sizeOfList += nums(i)
    }

    var result: Array[Int] = new Array[Int](sizeOfList)

    for (i <- nums.indices by 2) {
      val j = i+1
      var freq = nums(i)
      val value = nums(j)
      while (freq>0){
        result(index) = value
        freq=freq-1
        index=index+1
      }
    }


    result
  }

  def test(): Unit = {
    val nums = Array(1,2,3,4)
    val list = decompressRLElist(nums)
    for (i <- list) {
      print(i + " ")
    }
  }

  test()
}
