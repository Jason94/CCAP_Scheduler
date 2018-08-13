package gov.wicourts.cucumber

import cucumber.api.scala.{ScalaDsl, EN}
import org.scalatest.Matchers

class TestSteps extends ScalaDsl with EN with Matchers {
  var today: String = ""
  var queryDay: String = ""

  def compareDays(a: String, b: String) = if(a == b) "Yep" else "Nope"

  Given("""^today is "([^"]*)"$"""){ (arg0: String) =>
    today = arg0
  }
  When("""^I ask whether it's Friday yet$"""){ () =>
    queryDay = "Friday"
  }
  Then("""^I should be told "([^"]*)"$"""){ (arg0:String) =>
    compareDays(today, queryDay) should be (arg0)
  }
}
