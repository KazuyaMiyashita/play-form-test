package models.forms

  import play.api.data.Form
  import play.api.data.Forms._

case class UserFormData(
  name: Option[String],
  age: Option[Int]
)

object UserForm extends Form[UserFormData](
  mapping(
    "name" -> optional(nonEmptyText),
    "age" -> optional(number(min = 0))
  )(UserFormData.apply)(UserFormData.unapply)
  , Map.empty, Nil, None
)
