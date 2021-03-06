import org.scalatest._

import org.scalacheck._
import org.scalacheck.Prop._

class TestMain extends FunSuite {
  test("one should equal one") {
    assert(1 === 1)
  }
}

object CheckMain extends Properties("Main") {
  property("ints are sane") = forAll {
    a: Int => {
      a > 0 || a < 0 || a == 0
    }
  }
}
