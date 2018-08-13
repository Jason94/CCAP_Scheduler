package gov.wicourts.scheduler

import org.scalatra.test.scalatest._

class SchedulerServletTests extends ScalatraFunSuite {

  addServlet(classOf[SchedulerServlet], "/*")

  test("GET / on SchedulerServlet should return status 200") {
    get("/") {
      status should equal (200)
      body should include ("Hello")
    }
  }

}
