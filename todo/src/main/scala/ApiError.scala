import akka.http.scaladsl.model.{StatusCode, StatusCodes}

final case class ApiError private(statusCode: StatusCode, message: String)

object ApiError {
  private def apply(statusCode: StatusCode, message: String): ApiError = new ApiError(statusCode, message)

  val generic: ApiError = new ApiError(StatusCodes.InternalServerError, "Unknown error.")

  val emptyTitleErrorField: ApiError = new ApiError(StatusCodes.BadRequest, "Title field must not be empty.")

  def todoNotFound(id: String): ApiError =
    new ApiError(StatusCodes.NotFound, message = s"The todo with id $id could not be found.")
}