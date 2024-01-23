package com.example.book.model;

import jakarta.persistence.*;

@Entity
public class RentalBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "book_id",referencedColumnName = "id")
    private Book book;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeRental;
    private boolean isReturn;

    public RentalBook() {
    }

    public RentalBook(int id, Book book, Integer codeRental, boolean isReturn) {
        this.id = id;
        this.book = book;
        this.codeRental = codeRental;
        this.isReturn = isReturn;
    }

    public int getId() {
        return id;
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

    public void setReturn(boolean aReturn) {
        isReturn = aReturn;
    }
}
