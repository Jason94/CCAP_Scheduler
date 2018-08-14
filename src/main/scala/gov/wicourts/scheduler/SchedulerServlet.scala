package gov.wicourts.scheduler

import org.scalatra._

class SchedulerServlet extends ScalatraServlet {

  get("/") {
    <html>
      <head><title>Test Title</title></head>
      <body>
        <span>BOoyh</span>
      </body>
    </html>
  }

}
