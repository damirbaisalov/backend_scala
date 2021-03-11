import org.slf4j.{Logger, LoggerFactory}
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }

object MainApp extends App {

  implicit val log: Logger = LoggerFactory.getLogger(getClass)

  val system: ActorSystem[HelloWorldMain.SayHello] =
    ActorSystem(HelloWorldMain(), "hello")

  system ! HelloWorldMain.SayHello("World")
  system ! HelloWorldMain.SayHello("Akka")
}
