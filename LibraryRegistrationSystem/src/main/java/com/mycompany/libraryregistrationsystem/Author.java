/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;

import java.util.Date;

/**
 *
 * @author A1
 */
public class Author  implements Display {

    private int Id;
    private String Name;
    private String Address;
    private String BirthDate;

    public Author() {
    }

    public Author(int Id, String Name, String Address, String BirthDate) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.BirthDate = BirthDate;
    }

    Author(int i, String author1, String address1, Date date, int i0, String genre1, String version1, Date date0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Author(int i, String author1, String address1, int i0, String genre1, String version1, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    @Override
    public boolean inLoan() {
        return false;
    }

    @Override
    public String getInfo() {
        return "Id : " + Id + "\n Name : " + Name + "\n Address : " + Address + "\n BirthDate: " + BirthDate;
    }
}
