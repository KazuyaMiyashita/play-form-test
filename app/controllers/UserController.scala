package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import play.api.i18n.I18nSupport // hasErrors.errorsAsJson　で利用
import play.api.libs.json.{Json, JsValue}

import models.User
import models.forms.{UserFormData, UserForm}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class UserController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) with play.api.i18n.I18nSupport {

  def search() = Action { implicit request: Request[AnyContent] =>
    def searchFromExample(formData: UserFormData): Seq[User] = {
      val filterName: User => Boolean = (formData.name: Option[String]) match {
        case Some(name) => { user: User => user.name == name }
        case None => { _ => true }
      }
      val filterAge: User => Boolean = (formData.age: Option[Int]) match {
        case Some(age) => { user: User => user.age == age }
        case None => { _ => true }
      }

      val users = User.findAll.filter(filterName).filter(filterAge)

      users
    }

    UserForm.bindFromRequest().fold(
      badForm => {
        BadRequest(badForm.errorsAsJson)
      },
      form => {
        val users: Seq[User] = searchFromExample(form)
        val usersJson: JsValue = Json.toJson(users)
        Ok(usersJson)
      }
    )
  }

  
}
