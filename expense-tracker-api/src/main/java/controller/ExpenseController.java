//package controller;
package com.example.expense.tracker.api.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//import services.ExpenseService;
import java.util.List;
//import model.Expense;
import com.example.expense.tracker.api.model.Expense;
import com.example.expense.tracker.api.services.ExpenseService;
@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/postexpense")
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseService.addExpense(expense);
    }
    @GetMapping("/getexpense")
    public List<Expense> getExpense() {
        return expenseService.getExpense();
    }

    @GetMapping("/getexpense/{id}")
    public Expense getExpenseById(@PathVariable int id) {
        return expenseService.getExpenseById(id);
    }

    @GetMapping("/getexpense/category")
    public List<Expense> getExpenseByCategory(@RequestParam String category) {
        return expenseService.getExpenseByCategory(category);
    }

    @GetMapping("/totalexpense")
    public double getTotalExpense() {
        return expenseService.getTotalExpense();
    }

    @GetMapping("/totalexpense/category")
    public double getTotalExpenseByCategory(@RequestParam String category) {

        return expenseService.getTotalExpenseByCategory(category);

    }

    @DeleteMapping("/deleteexpense/{id}")
    public void deleteExpense(@PathVariable int id) {
        expenseService.deleteExpense(id);
    }
}
