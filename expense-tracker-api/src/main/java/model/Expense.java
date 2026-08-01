//package model;
package com.example.expense.tracker.api.model;
import java.time.LocalDate;

public class Expense {
    private Integer id;
    private String title;
    private double amount;
    private String category;
    private LocalDate date;

    public Expense() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", date=" + date +
                '}';
    }

    public Expense(LocalDate date, String category, double amount, String title, Integer id) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.title = title;
        this.id = id;
    }
}
