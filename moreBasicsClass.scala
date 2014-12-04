//Abstract Classes
scala> abstract class Shape{
     | def getArea()
     | : Int
     | }
defined class Shape


scala> class Circlr(r: Int) extends Shape{
     | def getArea():Int = { r * r * 3}
     | }
defined class Circlr

//Abstract classes cannot be instantiated
scala> val s = new Shape()
<console>:12: error: class Shape is abstract; cannot be instantiated
       val s = new Shape()
       
scala> val c = new Circlr(5)
c: Circlr = $iwC$$iwC$$iwC$$iwC$Circlr@69945924

scala> c
res0: Circlr = $iwC$$iwC$$iwC$$iwC$Circlr@69945924

//Trait
scala> trait Car{
     | val brand : String
     | }
defined trait Car

scala> trait Model{
     | val speed : Int
     | }
defined trait Model

scala> class BMW extends Car{
     | val brand = "3 Series"
     | }
defined class BMW

//A Class can inherit multiple traits using "with"
scala> class BMW5 extends Car with Model{
     | val brand = "5Series"
     | val speed = 170
     | }
defined class BMW5

//Apply
scala> class Foo {}
defined class Foo

scala> object FooMaker {
     | def apply() = new Foo
     | }
defined module FooMaker

scala> val foomaker = FooMaker()
foomaker: Foo = $iwC$$iwC$$iwC$$iwC$Foo@7662f526

//Object holds single instance of a class, used as factories
//Aka Companion Objects

scala> object Timer {
     | var count =0
     | def getcounter(): Long = {
     | count += 1
     | count
     | }
     | }
defined module Timer

scala> Timer.getcounter()
res0: Long = 1

//Object-Functional Programming
//Function is a set of traits
scala> object addOne extends Function1[Int, Int] {
     | def apply(m: Int) = m+1
     | }
defined module addOne

scala> addOne(5)
res1: Int = 6

scala> class AddOne extends Function1[Int, Int] {
     | def apply(m: Int) : Int = m + 1
     | }
defined class AddOne

scala> val plusOne = new AddOne()
plusOne: AddOne = <function1>

scala> plusOne(10)
res0: Int = 11


