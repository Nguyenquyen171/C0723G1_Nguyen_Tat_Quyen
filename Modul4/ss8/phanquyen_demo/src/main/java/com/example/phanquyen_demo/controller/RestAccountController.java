package com.example.phanquyen_demo.controller;


import com.example.phanquyen_demo.model.Account;
import com.example.phanquyen_demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class RestAccountController {
    @Autowired
    private IAccountService iAccountService;
    @GetMapping("/account/detail/{accId}")
    public ResponseEntity<Account> getDetail(@PathVariable int accId){
        Account account = iAccountService.findById(accId);
        if (account == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(account,HttpStatus.OK);
    }
}