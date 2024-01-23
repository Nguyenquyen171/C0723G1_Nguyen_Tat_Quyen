package com.example.book.repository;

import com.example.book.model.RentalBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentalBookRepository extends JpaRepository<RentalBook,Integer> {
    RentalBook findByCodeRentalBook(Integer id);
}
