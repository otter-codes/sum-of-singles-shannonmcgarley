object SumSingles extends App {

  def listApply(listOfNums: List[Int]): Int = {
    val listAdder = listOfNums.sum
    val dupeRemover = listOfNums.distinct
    2*dupeRemover.sum-listAdder
  }
listApply(List(1,1,2,2,3,3,4,4,5,5))

}