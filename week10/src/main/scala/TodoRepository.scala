import scala.concurrent.Future

trait TodoRepository {
  def all(): Future[Seq[Todo]]

  def done(): Future[Seq[Todo]]

  def pending(): Future[Seq[Todo]]

  def create(createTodo: CreateTodo):Future[Todo]

  def update(id: String, updateTodo: UpdateTodo): Future[Todo]
}

object TodoRepository {

  final case class TodoNotFound(id: String) extends Exception(s"Todo with id $id not found.")
  final case class TitleIsExist(create: CreateTodo) extends Exception("The title is already exist")

}