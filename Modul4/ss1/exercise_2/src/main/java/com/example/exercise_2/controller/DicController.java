package com.example.exercise_2.controller;

import com.example.exercise_2.service.IDicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class DicController {
    @Autowired
    private IDicService dicService;

    @GetMapping
    public ModelAndView showHomePage(){
        return new ModelAndView("index");
    }

    @GetMapping("/convert")
    public ModelAndView displayResultDic(Model model, String eng){
        model.addAttribute("eng",eng);
        model.addAttribute("vi",dicService.displayResultDic(eng));
        return new ModelAndView("index");
    }
}
