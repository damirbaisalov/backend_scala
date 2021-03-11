
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

object CalculatorBot {

  def apply(): Behavior[CalculatorObject.ExpressionResult] = {
    bot()
  }

  private def bot(): Behavior[CalculatorObject.ExpressionResult] =
    Behaviors.receive { (context, message) =>
//      println("Result from bot: " + message.expression + message.result )
      context.log.info( "Result from bot: {}", message.result)
      Behaviors.stopped
    }
}
