import scala.concurrent.ExecutionContext

class InMemoryCalculatorRepository(implicit ec: ExecutionContext) extends CalculatorRepository {
  override def calculate(expression: String): String = {
    Calculator.readSymbols(expression)
  }
}