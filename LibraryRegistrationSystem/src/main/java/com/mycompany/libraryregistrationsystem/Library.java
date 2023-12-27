/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;

import java.util.ArrayList;
import java.util.List;

public class Library extends Books {
    private List<Books> books;
    private List<Students> students;
    private List<Loan> loans;
    
    Author a = new Author();

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }
    
    public List<Books> searchByTitle(String title) {
        List<Books> foundBooks = new ArrayList<>();
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public Books searchByNumber(int number) {
        for (Books book : books) {
            if (book.getNo() == number) { 
                return book;
            }
        }
        return null;
    }

    public List<Books> searchByAuthorName(String authorName) {
        List<Books> foundBooks = new ArrayList<>();
        for (Books book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public Students getStudentById(int id) {
        for (Students student : students) {
            if (student.getID() == id) { 
                return student;
            }
        }
        return null;
    }

    public boolean isBookAvailable(Books book) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.isOverdue()) { 
                return false;
            }
        }
        return true;
    }

    public List<Loan> getLoansByStudent(Students student) {
        List<Loan> studentLoans = new ArrayList<>();
        for (Loan loan : loans) {
            if (loan.getStudent().equals(student)) {
                studentLoans.add(loan);
            }
        }
        return studentLoans;
    }
    
    public Author searchAuthor(String authorName) {
        for(Books book : books) {
            if (authorName.equals(book.getAuthor().getName()))
                return book.getAuthor();
        }
        return null;
    }

    

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public Author getA() {
        return a;
    }

    public void setA(Author a) {
        this.a = a;
    }
    
}