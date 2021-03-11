import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }

object HelloWorldMain {

  final case class SayHello(name: String)

  def apply(): Behavior[SayHello] =
    Behaviors.setup { context =>
      val greeter = context.spawn(HelloWorld(), "greeter")

      Behaviors.receiveMessage { message =>
        val replyTo = context.spawn(HelloWorldBot(max = 3), message.name)
        greeter ! HelloWorld.Greet(message.name, replyTo)
        Behaviors.same
      }
    }

}

//import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}
//import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
//import org.slf4j.{Logger, LoggerFactory}
//
//object HelloWorldMain {
//
//  final case class SayHello(name: String)
//
//  def apply(): Behavior[SayHello] =
//    Behaviors.setup { context =>
//      val greeter = context.spawn(HelloWorld(), "greeter")
//
//      Behaviors.receiveMessage { message =>
//        val replyTo = context.spawn(HelloWorldBot(max = 3), message.name)
//        greeter ! HelloWorld.Greet(message.name, replyTo)
//        Behaviors.same
//      }
//    }
//
//  def main(args: Array[String]): Unit = {
//
//    implicit val log: Logger = LoggerFactory.getLogger(getClass)
//
//    val system: ActorSystem[HelloWorldMain.SayHello] =
//      ActorSystem(HelloWorldMain(), "hello")
//
//    system ! HelloWorldMain.SayHello("World")
//    system ! HelloWorldMain.SayHello("Akka")
//  }
//
////  HelloWorldMain.main(Array.empty)
//}
