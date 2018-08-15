package gov.wicourts.cucumber

import cucumber.api.scala.{ScalaDsl, EN}
import org.scalatest.Matchers
import org.scalatest.selenium._

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

class WebSteps extends ScalaDsl with EN with Matchers with HtmlUnit {
  val host = "http://localhost:8080/"

  Given("""^I am on the home page$"""){ () =>
    go to (host)
  }

  Given("""^I am on the index page$"""){ () =>
    go to (host + "index.html")
  }

  Then("""^the title should be "([^"]*)"$"""){ (title:String) =>
    pageTitle should be(title)
  }

  Then("""^I should see "([^"]*)"$"""){ (message:String) =>
    find("/") should be (1)
  }
}
