object Task2 extends App {

  def average(salary: Array[Int]): Double = {

    var maxSalary = 0
    var minSalary = 1000001
    var sumSalary = 0

    for (s <- salary) {
      maxSalary = math.max(s,maxSalary)
      minSalary = math.min(s,minSalary)
      sumSalary+=s
    }

    val result = (sumSalary-maxSalary-minSalary)/(salary.length-2.0)

    result
  }

  def testCase(): Unit = {
    val list = Array(2000,1000,3000,4000)
    print(average(list))
  }

  testCase()

  //    val result = (salary.sum - salary.max - salary.min) /(salary.length - 2.0) - usign known methods
}
