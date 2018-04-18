val List1 = List(1,2,3,3,4,5)
List1.intersect(List(1,2,3))
List1.union(List(1,2,3))
List1.diff(List(1,2,3))
List1.mkString(" ")

val List1Added = List1.sum

val List1Removed = List1.distinct

2*List1Removed.sum-List1Added
