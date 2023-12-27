/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;

/**
 *
 * @author A1
 */
public class Books implements Display{
    private static int counter = 0;
    private String  Title;
    private Author author;
    private int No;
    private String Genre;
    private String version;
    private Date date;

    public Books() {
    }

    public Books(String Title) {
        this.Title = Title;
    }
    

    public Books(String Title, Author author, String Genre, String version,Date date) {
        this.Title = Title;
        this.author = author;
        this.No = counter ++;
        this.Genre = Genre;
        this.version = version;
        this.date = date;
    }
    
    

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public boolean inLoan(){
        return false;
    }
    @Override
    public String getInfo(){
        return "Title : " + Title 
                +"\n Author : " + author.getInfo() + 
                "\n Number : " + No+"\n Genre : "+ Genre+ 
                "\n version : "+version+"\n date : " + date
                + "\n -------------------";
    }
}
