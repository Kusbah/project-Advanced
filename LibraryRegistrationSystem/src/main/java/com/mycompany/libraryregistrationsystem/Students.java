/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author A1
 */
public class Students {

    private int ID;
    private String Name;
    private String Address;
    private Date BirthDate;
    private String Major;
    List<Loan> loans;

    public Students() {
    }

    public Students(int ID, String Name, String Address, Date BirthDate, String Major) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.BirthDate = BirthDate;
        this.Major = Major;
        List<Loan> loans;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public boolean canLoan() {
        return loans.size() <= 3;
    }

    public void addLoan(Loan loan) {
        if (canLoan()) {
            loans.add(loan);
        } else {
            System.out.println("Student has reached the maximum number of allowed loans.");
        }
    }

    
}
