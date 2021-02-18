object LeetCode7 extends App {

  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    val y = mat.length
    val x = mat(0).length
    var index = 0

    var vis: Array[Int] = new Array[Int](y)
    var result: Array[Int] = new Array[Int](k)

    for (j <- 0 to x) {
      for (i <- 0 until y) {
        if (vis(i) == 0 && (j == x || mat(i)(j) == 0)) {
          result(index)= i
          index+=1
          vis(i)+=1
        }
        if (index == k) {
          return result
        }
      }
    }

    result
  }

}
