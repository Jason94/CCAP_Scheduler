package gov.wicourts.scheduler

import org.scalatra._

class SchedulerServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
