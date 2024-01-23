package com.example.form_sign.controller;

import com.example.form_sign.model.User;
import com.example.form_sign.model.UserDTO;
import com.example.form_sign.service.IUserService;
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
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping
    public ModelAndView showFormCreate(){
        return new ModelAndView("index", "userDTO",new UserDTO());
    }
    @PostMapping
    public ModelAndView saveUser(@Valid @ModelAttribute UserDTO userDTO,
                                 BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("index","userDTO", userDTO);
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDTO,user);
            userService.signUser(user);
            return new ModelAndView("result","user",user);
        }
    }
}
