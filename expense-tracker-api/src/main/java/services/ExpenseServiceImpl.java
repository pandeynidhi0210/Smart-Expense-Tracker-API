//package services;
package com.example.expense.tracker.api.services;
import com.example.expense.tracker.api.model.Expense;
import org.springframework.stereotype.Service;
// import model.Expense;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private List<Expense> expenses = new ArrayList<>();

    private int nextId = 1;

    @Override
    public Expense addExpense(Expense expense) {

        expense.setId(nextId++);
        expenses.add(expense);

        return expense;
    }

    @Override
    public List<Expense> getExpense() {
        return expenses;
    }
    @Override
    public Expense getExpenseById(int id) {

        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                return expense;
            }
        }

        return null;
    }


    @Override
    public List<Expense> getExpenseByCategory(String category) {

        List<Expense> filteredExpenses = new ArrayList<>();

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                filteredExpenses.add(expense);
            }
        }

        return filteredExpenses;
    }

    @Override
    public double getTotalExpense() {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    @Override
    public double getTotalExpenseByCategory(String category) {

        double total = 0;

        for (Expense expense : expenses) {

            if (expense.getCategory().equalsIgnoreCase(category)) {
                total += expense.getAmount();
            }

        }

        return total;
    }

    @Override
    public void deleteExpense(int id) {

        Expense expenseToDelete = null;

        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expenseToDelete = expense;
                break;
            }
        }

        if (expenseToDelete != null) {
            expenses.remove(expenseToDelete);
        }
    }
}