object Task3 extends App {

  def dayOfTheWeek(day: Int, month: Int, year: Int): String = {

    val months = Array(31,28,31,30,31,30,31,31,30,31,30,31)
    val dayNames = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    var sum = 4

    for (i <- 1971 until  year) {
      if (((i%4==0) && (i%100!=0)) || (i%400==0)) {
        sum+=366
      } else {
        sum+=365
      }
    }

    for (i <- 1 until  month) {
      if (i == 2 && (((year%4==0) && (year%100!=0)) || (year%400==0))) {
        sum+=1
      }
      sum+=months(i-1)
    }

    sum+=day

    dayNames(sum%7)
  }

  def testCase(): Unit = {
    val result = dayOfTheWeek(18,7,1999)
    print(result)
  }

  testCase()
}
