package com.example.book.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String image;
    private String author;
    private Integer count;
    @OneToMany(mappedBy = "id")
    private Set<Rental> rentalBooks;
    public Book() {
    }

    public Book(Integer id, String name, String image, String author, Integer count, Set<Rental> rentalBooks) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.author = author;
        this.count = count;
        this.rentalBooks = rentalBooks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Set<Rental> getRentalBooks() {
        return rentalBooks;
    }

    public void setRentalBooks(Set<Rental> rentalBooks) {
        this.rentalBooks = rentalBooks;
    }
}
