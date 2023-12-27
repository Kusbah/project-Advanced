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
public class Magazines extends Books implements Display{
    private int issueNo;
    private Date releaseDate;

    public Magazines() {
    }

    

    public Magazines(int issueNo, String Title, Author author, String Genre, String version, Date date) {
        super(Title, author, Genre, version, date);
        this.issueNo = issueNo;
        this.releaseDate = date;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    @Override
    public boolean inLoan(){
        return false;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"\n issueNo"+ issueNo+"\n releaseDate"+releaseDate;
    }
}
