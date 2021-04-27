import akka.actor.typed.ActorSystem
import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.{Directives, Route}

import scala.concurrent.ExecutionContext

trait  Router {
  def route:Route
}

class MyRouter(calculatorRepository: CalculatorRepository)(implicit system: ActorSystem[_],  ex:ExecutionContext) extends Router with  Directives {

  override def route = concat(
    path("ping") {
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "pong"))
      }
    },
    path("calc") {
      get {
        parameters('exp.as[String]) { exp =>
          complete {
            HttpEntity(ContentTypes.`text/html(UTF-8)`, calculatorRepository.calculate(exp))
          }
        }
      }
    }
  )
}
