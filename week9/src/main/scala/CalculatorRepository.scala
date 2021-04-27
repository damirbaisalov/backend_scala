import scala.concurrent.ExecutionContext

trait CalculatorRepository {
  def calculate(expression: String): String
}