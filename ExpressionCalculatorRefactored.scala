package sbt

import scala.collection.mutable.Stack

object ExpressionCalculator {

  /**
   * If the token is Operator pop 2 elements from the stack and perform the operation
   */
  def handleOperator(token: String, stack: Stack[Int]): Boolean = token match {
    case "+" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(rhs + lhs)
      true
    case "-" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs - rhs)
      true
    case "*" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs * rhs)
      true
    case "/" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs / rhs)
      true
    case _ => false
  }

  /**
   * if the token is a operand/ number push it onto the stack
   */
  def handleOperand(token: String, stack: Stack[Int]): Boolean = try {
    stack.push(token.toInt)
    true
  } catch {
    case _: NumberFormatException => false
  }

  def calculate(expression: String): Int = {
    val stack = new Stack[Int]
    for (token <- expression.split(" ")) {
      if (!handleOperand(token, stack) && !handleOperator(token, stack))
        throw new IllegalArgumentException("Illegal Argument for ExpressionCalculator")
    }
    stack.pop()
  }

  /**
   * Main method expects exactly one argument
   */
  def main(args: Array[String]): Unit =
    if (args.length != 1) {
      throw new IllegalArgumentException("Usage: ExpressionCalculator <expression>")
    } else {
      calculate(args(0))
    }
}
