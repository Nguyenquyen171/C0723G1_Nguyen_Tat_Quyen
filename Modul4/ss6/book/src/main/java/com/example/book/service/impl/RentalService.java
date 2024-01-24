package com.example.book.service.impl;


import com.example.book.exception.RentalException;
import com.example.book.model.Rental;
import com.example.book.repository.IRentalBookRepository;
import com.example.book.service.IRentalBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RentalService implements IRentalBookService {
    @Autowired
    private IRentalBookRepository rentalRepo;
    @Override
    public void creatRental(Rental rental) {
        rentalRepo.save(rental);
    }

    @Override
    public void updateRental(Rental rental) {
        rentalRepo.save(rental);
    }

    @Override
    public Rental findByCodeRental(Integer id) throws RentalException {
        if (rentalRepo.findByCodeRentalBook(id) == null) {
            throw new RentalException("Mã không tồn tại hoặc không chính xác");
        }
        return rentalRepo.findByCodeRentalBook(id);
    }
}