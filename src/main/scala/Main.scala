import dataModel._
import service._
import repository._

object Main extends App {

  val repo = new ExpenseRepository
  val service = new ExpenseService

  val expenses = repo.load()

  println(s"All expenses: $expenses")
  println(s"Total amount: ${service.total(expenses)}")
  println(s"Most expensive: ${service.mostExpensive(expenses).getOrElse("None")}")
  println(s"Food expenses: ${service.byCategory(expenses, Food)}")
  println(f"Average expense: ${service.average(expenses)}%.2f")

  // Adding a new expense
  repo.add(Expense(5, "Book", 40, Other))
  println(s"Updated expenses: ${repo.load()}")
}
