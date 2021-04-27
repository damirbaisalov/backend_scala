import scala.concurrent.ExecutionContext

trait CalculatorRepository {
  def calculate(expression: String): String
}

class InMemoryCalculatorRepository(implicit ec: ExecutionContext) extends CalculatorRepository {
  override def calculate(expression: String): String = {
    Calculator.readSymbols(expression)
  }
}