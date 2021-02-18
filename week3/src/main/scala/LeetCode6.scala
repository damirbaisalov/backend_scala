object LeetCode6 extends App {

  def sumZero(n: Int): Array[Int] = {
    var index = 0
    var k = 1
    var result: Array[Int] = new Array[Int](n)

    if ( n % 2 != 0) {
      result(index) = 0
      index = index + 1
    }

    while (index < n){
      result(index) = k
      if (k<0) {
        k=k-1
      }

      k=k*(-1)
      index = index + 1
    }

    result
  }

  def test(): Unit = {
    val res = sumZero(5)
    for (i <- res)
      print(i + " ")
  }

  test()
}
