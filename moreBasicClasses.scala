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
