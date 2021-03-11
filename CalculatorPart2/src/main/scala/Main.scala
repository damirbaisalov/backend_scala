import scala.io.StdIn.readLine
import akka.actor.typed.{ActorSystem, Behavior}
import akka.actor.typed.scaladsl.Behaviors
import org.slf4j.{Logger, LoggerFactory}

object Main{

  final case class ReadFromInput(expression: String)

  def apply(): Behavior[ReadFromInput] =
    Behaviors.setup { context =>
      val calculator = context.spawn(CalculatorObject(), "greeter")

      Behaviors.receiveMessage { message =>
        val replyTo = context.spawn(CalculatorBot(), message.expression)
        calculator ! CalculatorObject.Expression(message.expression, replyTo)
        Behaviors.same
      }
    }

  def main(args: Array[String]): Unit = {

    implicit val log: Logger = LoggerFactory.getLogger(getClass)

    val system: ActorSystem[ReadFromInput] =
      ActorSystem(Main(), "MainCalculator")

    system ! ReadFromInput("3+3=")

  }
}
