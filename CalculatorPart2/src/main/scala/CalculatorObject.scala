import akka.actor.typed.{ActorRef, Behavior}
import akka.actor.typed.scaladsl.Behaviors

object CalculatorObject {

  final case class Expression(expressionBody: String, replyTo: ActorRef[ExpressionResult])
  final case class ExpressionResult(result: String, from: ActorRef[Expression])

  var calculatorInstance = new Calculator()

  def apply(): Behavior[Expression] = Behaviors.receive { (context, message) =>
//   println(s"Your request: ${message.exp}")
    context.log.info("Your expression request {}", message.expressionBody)
    val answer = calculatorInstance.readSymbols(message.expressionBody).toString
    message.replyTo ! ExpressionResult(answer, context.self)
    Behaviors.same
  }
}
