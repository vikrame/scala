scala> 1 +1
res0: Int = 2

scala> val two = 1+1
two: Int = 2

/**
Muttable Variables
*/
scala> var name = "String"
name: String = String

scala> var name = "Vikram"
name: String = Vikram

/**
String needs to be in double quotes
*/
scala> name = Elango
<console>:12: error: not found: value Elango
       name = Elango
              ^

scala> name = "Elango"
name: String = Elango

/**
Function Definition
*/
scala> def addOne(m: Int): Int = m + 1
addOne: (m: Int)Int

/**
Function call
*/
scala> val three = addOne(2)
three: Int = 3

/**
Function with no arguments
*/
scala> def three() = 1 + 2
three: ()Int

/**
Function Call
*/
scala> three()
res1: Int = 3

scala> three
res2: Int = 3

/**
Difference in val and var variables
*/
scala> val a = "London"
a: String = London

/**
Immutable
*/
scala> a = "New York"
<console>:12: error: reassignment to val
       a = "New York"
         ^

scala> var b = "SFO"
b: String = SFO
/**
Muttable
*/
scala> b = "Charlotte"
b: String = Charlotte

/**
Wild card matching pattern _
*/
scala> def adder(m: Int, n: Int) = m + n
adder: (m: Int, n: Int)Int

scala>  val add2 = adder(2, _:Int)
add2: Int => Int = <function1>

scala> add2(4)
res3: Int = 6

/**
Another Wild card matching pattern _
*/
scala> val add2 = adder(_: Int , _:Int)
add2: (Int, Int) => Int = <function2>

scala> add2(4,8)
res4: Int = 12

/**
Curried Functions
*/
scala> def multiply(m: Int)(n: Int): Int = m * n
multiply: (m: Int)(n: Int)Int

scala> multiply(2)(3)
res5: Int = 6

scala> val timesTwo = multiply(2) _
timesTwo: Int => Int = <function1>

scala> timesTwo(3)
res6: Int = 6

scala> val curriedAdd = (adder _).curried
curriedAdd: Int => (Int => Int) = <function1>

scala> val addTwo = curriedAdd(2)
addTwo: Int => Int = <function1>

scala> addTwo(4)
res7: Int = 6

/**
Functions with Variable Arugument length
*/
scala> def capitalizeAll(args: String*) = {
     |   args.map { arg =>
     |     arg.capitalize
     |   }
     | }
capitalizeAll: (args: String*)Seq[String]

scala> capitalizeAll("rarity", "applejack")
res8: Seq[String] = ArrayBuffer(Rarity, Applejack)

scala> capitalizeAll("vikram","elango")
res9: Seq[String] = ArrayBuffer(Vikram, Elango)
