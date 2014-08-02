package sbt

import scala.collection.mutable.Stack

object ExpressionCalculator {
  def main(args: Array[String]): Unit =
    if (args.length != 1) {
      //ExpressionCalculator takes only one argument
      throw new IllegalArgumentException("Usage: ExpressionCalculator <expression>")
    } else {
      //split first argument based on space
      val expression = args(0)
      val tokens = expression.split(" ")
      //Mutable Stack to hold operand and operator
      val stack = new Stack[Int]
      for (token <- tokens) {
        //when operator is encoutered, pop first 2 elements from stack
        //and perform corresponding operation
        token match {
          case "+" => 
          val rhs = stack.pop()
          val lhs = stack.pop()
          stack.push(rhs+lhs)
          
          case "-" => 
          val rhs = stack.pop()
          val lhs = stack.pop()
          stack.push(lhs-rhs)
          
          case "*" => 
          val rhs = stack.pop()
          val lhs = stack.pop()
          stack.push(lhs*rhs)
          
          case "/" => 
          val rhs = stack.pop()
          val lhs = stack.pop()
          stack.push(lhs/rhs)
          
          case _ => try{
            //when operand is encountered push on to the stack
            stack.push(token.toInt)
          } catch {
            //Exception handling for illegal arguments
            case _: NumberFormatException => 
              throw new IllegalArgumentException("Exception: Illegal Arguments")
          }
        }
      }
      //Print the content of the stack after evaluating the expression
      println(stack.pop())
    }
}
