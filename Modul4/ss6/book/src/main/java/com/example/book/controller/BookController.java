package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.model.BookDTO;
import com.example.book.service.IBookService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public ModelAndView showHome() {
        return new ModelAndView("index", "books", bookService.getAllBook());
    }

    @GetMapping("/add")
    public ModelAndView showFormAdd() {
        return new ModelAndView("add", "bookDTO", new BookDTO());
    }

    @PostMapping("/add")
    public ModelAndView createBook(@Valid @ModelAttribute BookDTO bookDTO, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("add", "bookDTO", bookDTO);
        } else {
            Book book = new Book();
            BeanUtils.copyProperties(bookDTO, book);
            bookService.create(book);
            return showHome();
        }

    }
}
