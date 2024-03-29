package com.example.book.config;

import com.example.book.exception.RentalException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class BookException {
    @ExceptionHandler(RentalException.class)
    public ModelAndView showErrorPage(Exception e){
        return new ModelAndView("error","error",e.getMessage());
    }
}