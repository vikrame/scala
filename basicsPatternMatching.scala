//Matching On Values

scala> val num = 1
num: Int = 1

scala> num match {
     | case 1 => "One"
     | case 2 => "Two"
     | case _ => "No Match"
     | }
res1: String = One

scala> val num = 10
num: Int = 10

scala> num match {
     | case 1 => "One"
     | case 2 => "Two"
     | case _ => "No Match"
     | }
res2: String = No Match

//Matching with guard

scala> val num = 3
num: Int = 3

scala> num match {
     | case i if i == 1 => "One"
     | case i if i == 2 => "Two"
     | case _ => "Some thing else"
     | }
res4: String = Some thing else

//Matching on Type

scala> def bigger(o: Any) : Any = {
     | o match {
     | case i: Int if i < 0 => i - 1
     | case i: Int => i + 1
     | case d: Double if d < 0.0 => d - 0.1
     | case d: Double => d + 1.0
     | case s: String => s + " Rocks"
     | }
     | }
bigger: (o: Any)Any

scala> bigger("Vikram")
res5: Any = Vikram Rocks

scala> bigger(1)
res6: Any = 2

scala> bigger(-1)
res8: Any = -2

scala> bigger(-1.0)
res9: Any = -1.1

scala> bigger(1.0)
res10: Any = 2.0

// Case Classes

scala> case class caseCal(brand:
     | String, size: String)
defined class caseCal

scala> val hp20 = new caseCal("HP", "20GB")
hp20: caseCal = caseCal(HP,20GB)

scala> val hp20GB = new caseCal("HP", "20GB")
hp20GB: caseCal = caseCal(HP,20GB)

scala> hp20 == hp20GB
res11: Boolean = true

// Case Class With pattern Matching

scala> val hp20b = caseCal("hp", "20B")
hp20b: caseCal = caseCal(hp,20B)

scala> val hp30b = caseCal("hp", "30B")
hp30b: caseCal = caseCal(hp,30B)

scala> def calType(cal : caseCal) = cal match {
     | case caseCal("hp", "20B") => "Home"
     | case caseCal("hp", "20B") => "Pro"
     | case caseCal(_,_) => "Something Else"
     | }
<console>:14: warning: unreachable code
       case caseCal("hp", "20B") => "Pro"
                                    ^
calType: (cal: caseCal)String

scala>  calType(hp20b)
<console>:17: error: type mismatch;
 found   : caseCal
 required: caseCal
               calType(hp20b)
                       ^


//Need to Explore more on this section
