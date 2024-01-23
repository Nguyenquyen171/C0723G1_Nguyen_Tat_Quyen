package com.example.book.service;

import com.example.book.exception.RentalBookException;
import com.example.book.model.RentalBook;

public interface IRentalBookService {
    void createRentalBook(RentalBook rentalBook);
    void updateRentalBook(RentalBook rentalBook);
    RentalBook findByCodeRental(Integer id) throws RentalBookException;
}
