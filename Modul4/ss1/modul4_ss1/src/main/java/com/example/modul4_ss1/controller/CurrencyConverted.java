package com.example.modul4_ss1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class CurrencyConverted {

    @GetMapping()
    public ModelAndView showForm () {
        return new ModelAndView("index");
    }

    @GetMapping("/convert")
    public ModelAndView convert (@RequestParam double usd) {
        double vnd = usd*23000;
        return new ModelAndView("index","vnd",vnd);
    }
}