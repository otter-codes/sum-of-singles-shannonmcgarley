import org.scalatest._

class SumSinglesSpec extends WordSpec with MustMatchers {

  "Hello" must {

    "Take a list(1,2,3,4,5) and return 15" in {
      SumSingles.listAdder(List(1,2,3,4,5)) mustEqual 15

    }

  }

}
