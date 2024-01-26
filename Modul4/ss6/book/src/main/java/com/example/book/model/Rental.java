package com.example.book.model;

import jakarta.persistence.*;

@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "book_id",referencedColumnName = "id")
    private Book book;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeRental;
    private boolean isReturn;

    public Rental(Book book, Integer codeRental, boolean b) {
    }

    public Rental(int id, Book book, Integer codeRental, boolean isReturn) {
        this.id = id;
        this.book = book;
        this.codeRental = codeRental;
        this.isReturn = isReturn;
    }

    public Rental() {

    }


    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getCodeRental() {
        return codeRental;
    }

    public void setCodeRental(Integer codeRental) {
        this.codeRental = codeRental;
    }

    public boolean isReturn() {
        return isReturn;
    }

    public boolean setReturn(boolean aReturn) {
        isReturn = aReturn;
        return aReturn;
    }
}
