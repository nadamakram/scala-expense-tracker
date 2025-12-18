package repository

import dataModel._
import scala.collection.mutable.ListBuffer

class ExpenseRepository {

  private val expenses = ListBuffer[Expense](
    Expense(1, "Lunch", 50, Food),
    Expense(2, "Taxi", 30, Transport),
    Expense(3, "Movie", 100, Entertainment),
    Expense(4, "Coffee", 20, Food)
  )

  def load(): List[Expense] = expenses.toList

  def add(expense: Expense): Unit = expenses += expense
}
