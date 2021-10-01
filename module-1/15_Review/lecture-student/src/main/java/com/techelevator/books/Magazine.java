package com.techelevator.books;

import java.time.LocalDate;

public class Magazine extends Media {

    private LocalDate issueDate;
    private int issueNumber;
    private String issn;

    public Magazine() {
        super("", "Magazine");
    }

    public Magazine(String title) {
        super(title, "Magazine");
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }
}
