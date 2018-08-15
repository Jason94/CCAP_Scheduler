package gov.wicourts.scheduler

import org.scalatest._
import org.scalatest.matchers._
import org.scalatest.selenium._
import org.openqa.selenium._


class SelSpec extends FlatSpec with Matchers with HtmlUnit {

  def captureDriver(implicit driver: WebDriver) = driver

  val host = "http://localhost:8080/"

  "Test" should "have hello" in {
    go to (host)
    pageTitle should be("Test Title")
    webDriver.findElement(By.tagName("span")).getText() should be("Hello")
  }

}
