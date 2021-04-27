case class Todo(id: String, title: String, description: String, done: Boolean)
case class CreateTodo(title:String, description:String)

case class TitleIsExist(create: CreateTodo) extends Exception