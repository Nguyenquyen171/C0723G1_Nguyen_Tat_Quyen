package com.example.book.service;

import com.example.book.exception.RentalException;
import com.example.book.model.Rental;

public interface IRentalBookService {
    void creatRental(Rental rental);
    void updateRental(Rental rental);
    Rental findByCodeRental(Integer id) throws RentalException;
}
