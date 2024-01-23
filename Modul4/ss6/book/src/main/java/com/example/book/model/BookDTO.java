package com.example.book.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.internal.metadata.facets.Validatable;
import org.springframework.validation.annotation.Validated;

import java.lang.annotation.Annotation;

public class BookDTO implements Validated {
    @Size(max = 100,message = "Không được dài quá 100 Kí tự")
    @Pattern(regexp ="^[a-zA-Z0-9]$",message = "Không được phép nhập kí tự đặc biệt ")
    private String name;
    @URL(message = "Nhập sai đường dẫn rồi kìa thằng stupid")
    private String message;
    @Override
    public Class<?>[] value() {
        return new Class[0];
    }
    @Size(max = 100, message = "Tên tác giả không được quá 100 kí tự")
    @Pattern(regexp = "^[a-zA-Z0-9]$",message = "Không được phép nhập kí tự đặc biệt")
    private String author;

    @Min(value = 0,message = "Số sách hiện không đủ phải lớn hơn hoặc bằng 0")
    @Positive(message = "Phải là số nguyên")
    private Integer count;

    public BookDTO(String name, String message, String author, Integer count) {
        this.name = name;
        this.message = message;
        this.author = author;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public BookDTO() {
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

}
