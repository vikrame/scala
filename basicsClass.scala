/**
Class with variable and functions
*/
scala> class Calc{
     | val brand: String = "HP"
     | def addOne(m: Int, n:Int): Int = m+n
     | }
defined class Calc

scala> val calc = new Calc
calc: Calc = $iwC$$iwC$$iwC$$iwC$Calc@6f59f6b0

scala> calc.addOne(3,7)
res0: Int = 10

scala> calc.brand
res1: String = HP

/**
Class With Constructor
Expression Oriented Architecture
*/
scala> class Calc(brand: String){
     | //constructor
     | val color: String = if(brand == "HP"){
     | "blue"
     | } else if (brand == "Dell") {
     | "Red"
     | } else {
     | "Yellow"
     | }
     |
     | def addOne(m: Int, n:Int): Int = m+n
     | }
defined class Calc

scala> val calc1 = new Calc("Lenovo")
calc1: Calc = $iwC$$iwC$$iwC$$iwC$Calc@3d89453e

scala> calc1.color
res2: String = Yellow

/**
Method Vs Functions
*/
scala> class C {
     | var acc = 0
     | def minc = { acc += 1 }
     | val finc = { () => acc += 1 }
     | }
defined class C

scala> val c = new C
c: C = $iwC$$iwC$$iwC$$iwC$C@ba66251

scala> c.minc

scala> c.finc
res6: () => Unit = <function0>

/**
Inheritence
*/
scala> class sciCalc(brand: String) extends Calc(brand) {
     | def log(m: Int, b: Double) = math.log(m)/math.log(b)}
defined class sciCalc

