/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;

import java.time.LocalDate;

class Loan  {
    private Students student;
    private Books book;
    private LocalDate dueDate;
    private boolean isReturned = false; 

    public Loan(Students student, Books book, LocalDate dueDate) {
        this.student = student;
        this.book = book;
        this.dueDate = dueDate;
    }

    

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isIsReturned() {
        return isReturned;
    }

    public void setIsReturned(boolean isReturned) {
        this.isReturned = isReturned;
    }

    @Override
    public String toString() {
        return "Loan{" + "student=" + student + ", book=" + book + ", dueDate=" + dueDate + ", isReturned=" + isReturned + '}';
    }

    
}