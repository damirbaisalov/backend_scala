import scala.io.StdIn.readLine

object Main extends App {
  val expression = readLine()
  val answer: Calculator = new Calculator(expression)
  println(answer.readSymbols())
}
