import org.scalatest._

class SumSinglesSpec extends WordSpec with MustMatchers {

  "Hello" must {

    "Take a list(1,2,3,4,5) and return 15" in {
      SumSingles.listApply(List(1,2,3,4,5)) mustEqual 15

    }

    "Take a list(1,1,2,3,4,5) and return 14" in {
      SumSingles.listApply(List(1,1,2,3,4,5)) mustEqual 14
    }

    "Take a list(2,2) and return 0" in {
      SumSingles.listApply(List(2,2)) mustEqual 0
    }
    "Take a list(5,6,6,7) and return 12" in{
      SumSingles.listApply(List(5,6,6,7)) mustEqual 12
    }
    "take a list(4,5,7,5,4,8) and return 15" in{
      SumSingles.listApply(List(4,5,7,5,4,8)) mustEqual 15
    }
    "Take a list(1,1,2,2,3,3,4,5) and return 9" in{
      SumSingles.listApply(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }

  }

}
