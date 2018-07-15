import org.scalatest.{FunSpec, Matchers}

class HelloWorldSpec extends FunSpec with Matchers {
  describe("Hello World spec") {
    it("spec hello world") {
      "Hello World" should be("Hello World")
    }
  }
}
