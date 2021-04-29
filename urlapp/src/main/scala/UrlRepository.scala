import scala.concurrent.Future

trait UrlRepository {

  def all(): Future[Seq[Url]]

  def create(createUrl: CreateUrl): Future[Url]
}