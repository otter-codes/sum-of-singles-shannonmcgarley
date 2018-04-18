object SumSingles extends App {

  def listAdder(listOfNums: List[Int]): Int = {
    listOfNums.distinct.sum
  }
listAdder(List(1,1,2,2,3,3,4,4,5,5))

}