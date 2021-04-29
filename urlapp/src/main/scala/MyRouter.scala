import akka.actor.typed.ActorSystem
import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.{Directives, Route}

import scala.concurrent.ExecutionContext

trait  Router {
  def route:Route
}

class MyRouter(urlRepository: UrlRepository)(implicit system: ActorSystem[_],  ex:ExecutionContext)
  extends Router
    with  Directives {

  import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport._
  import io.circe.generic.auto._

  override def route = pathPrefix("urls") {
    pathEndOrSingleSlash {
      get {
        complete(urlRepository.all())
      }
    }
  }
}