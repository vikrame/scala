//List
scala> val numList = List(1,2,3,4);
numList: List[Int] = List(1, 2, 3, 4)

//Duplicate values cna be present in list
scala> val numList = List(1,2,3,4,1,2,3,4);
numList: List[Int] = List(1, 2, 3, 4, 1, 2, 3, 4)

//Set
scala> val numSet = Set(1,2,3,4);
numSet: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

//Set cannot contain duplicates. Does not throw error scala ignores duplicates
scala> val numSet = Set(1,2,3,4,1,2,3,4);
numSet: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

//Tuple
scala> val empDetails =
     | ("Vikram", 28);
empDetails: (String, Int) = (Vikram,28)

scala> empDetails._1
res0: String = Vikram

scala> empDetails._2
res1: Int = 28



