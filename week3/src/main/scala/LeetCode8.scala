/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     def f(x: Int, y: Int): Int = {}
 * };
 */

object LeetCode8 extends App {

  class CustomFunction {
    def f(x : Int, y : Int): Unit = {

    }
  }

  def findSolution(customfunction: CustomFunction, z: Int): List[List[Int]] = {
    var resultList: List[List[Int]] = List[List[Int]]()
    for (x <- 1 to 1000) {
      for (y <- 1 to 1000) {
        val valueOfFun = customfunction.f(x,y)
        if (valueOfFun == z) {
          var res = List[Int]()
          res :+= x
          res :+= y
          resultList :+= res
        }
      }
    }

    resultList
  }

}

