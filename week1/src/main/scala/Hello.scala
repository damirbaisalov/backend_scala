object Hello extends App {
  println("Hello, world")

  def ex1(): Unit = {
    val x = 1
    var y = 0
    val s = "a string"
    println(x)
    println(y)
    println(s)
  }

  def ex2(a: Int, b:Int): Int = {
    val x = if (a < b) a else b

    x
  }

  def ex3(i: Int): String = {
    val result = i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "not 1 not 2"
    }

    result
  }

  def ex4(isTrue: Boolean): String = {
    val booleanAsString = isTrue match {
      case true => "true"
      case false => "false"
    }

    booleanAsString
  }

  def getClassAsString(x: Any):String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"
  }

  def ex5(): Unit = {
    // "x to y" syntax
    for (i <- 0 to 5) println(i)

    // "x to y by" syntax
    for (i <- 0 to 10 by 2) println(i)

    val x = for (i <- 1 to 5) yield i * 2
    println(x)
  }

  def ex6(): Unit= {
    val fruits = List("apple", "banana", "lime", "orange")

    val fruitLengths = for {
      f <- fruits
      if f.length > 4
    } yield f.length
    println(fruitLengths)
    println(fruits)
  }

  def ex7(): Unit = {
    var result = 0
    while(result<5){
      result+=1
    }
    var result2 = 0
    do {
      result2+=1
    } while (result2<5)
    println(result)
    println(result2)
  }

  class Person(var firstName: String, var lastName: String) {
    def printFullName() = println(s"$firstName $lastName")
  }

  val p = new Person("Julia", "Kern")
  println(p.firstName)
  p.lastName = "Manes"
  p.printFullName()

  ex1()
  println(ex2(2,3))
  println(ex3(3))
  println(ex4(true))
  println(getClassAsString("Hello"))
  ex5()
  ex6()
  ex7()
}