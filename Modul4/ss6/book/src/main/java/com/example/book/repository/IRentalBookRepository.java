package com.example.book.repository;

import com.example.book.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentalBookRepository extends JpaRepository<Rental,Integer> {
    Rental findByCodeRentalBook(Integer id);
}
