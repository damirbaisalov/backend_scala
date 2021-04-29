import java.util.UUID

import scala.concurrent.{ExecutionContext, Future}

class InMemoryUrlRepository(initialUrl:Seq[Url] = Seq.empty)(implicit ec:ExecutionContext) extends UrlRepository {

  private var urls: Vector[Url] = initialUrl.toVector

  override def all(): Future[Seq[Url]] = Future.successful(urls)

  override def create(createUrl: CreateUrl): Future[Url] = {

  }
}