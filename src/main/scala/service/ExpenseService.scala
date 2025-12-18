package service

import dataModel.{Expense, Category}

class ExpenseService {

  def total(expenses: List[Expense]): Double =
    expenses.map(_.amount).sum

  def byCategory(expenses: List[Expense], category: Category): List[Expense] =
    expenses.filter(_.category == category)

  def mostExpensive(expenses: List[Expense]): Option[Expense] =
    if (expenses.isEmpty) None
    else Some(expenses.maxBy(_.amount))

  def average(expenses: List[Expense]): Double =
    if (expenses.isEmpty) 0.0
    else total(expenses) / expenses.size
}
