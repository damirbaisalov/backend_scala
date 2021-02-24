object Task2 extends App {

  def average(salary: Array[Int]): Double = {

    var maxSalary = 0
    var minSalary = 1000001
    var sumSalary = 0

    for (s <- salary) {
//      maxSalary = maxSalary.max(s)
//      minSalary = minSalary.min(s)
      if (s>maxSalary)
        maxSalary = s
      if (s<minSalary)
        minSalary = s
      sumSalary+=s
    }

    val result: Double = (sumSalary-maxSalary-minSalary)/(salary.length-2)

    result
  }

  def testCase(): Unit = {
    val list = Array(2000,1000,3000,4000)
    print(average(list))
  }

  testCase()

  //    val result = (salary.sum - salary.max - salary.min) /(salary.length - 2) - usign known methods
}
