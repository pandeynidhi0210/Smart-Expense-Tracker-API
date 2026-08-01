

package com.example.expense.tracker.api.services;
import java.util.List;
import com.example.expense.tracker.api.model.Expense;
public interface ExpenseService {


    Expense addExpense(Expense expense);

    List<Expense> getExpense();
    Expense getExpenseById(int id);
    List<Expense> getExpenseByCategory(String category);
    double getTotalExpense();

    double getTotalExpenseByCategory(String category);
    void deleteExpense(int id);
}
