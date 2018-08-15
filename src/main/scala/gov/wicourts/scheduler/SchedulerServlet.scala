package gov.wicourts.scheduler

import org.scalatra._

class SchedulerServlet extends ScalatraServlet {

  get("/") {
    <span>Hello</span>
  }

  get("/index.html") {
    <html>
      <head><title>Test Title</title></head>
      <body><span>Friday</span></body>
    </html>
  }

}
