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

