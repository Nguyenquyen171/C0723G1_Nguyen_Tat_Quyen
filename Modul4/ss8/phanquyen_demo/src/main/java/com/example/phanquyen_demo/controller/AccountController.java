package com.example.phanquyen_demo.controller;



import com.example.phanquyen_demo.dto.AccountDTO;
import com.example.phanquyen_demo.model.Account;
import com.example.phanquyen_demo.service.IAccountService;
import com.example.phanquyen_demo.service.IRoleService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.Authenticator;
import java.time.LocalDateTime;
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;
    @Autowired
    private IRoleService roleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("")
    public String getAllAccount(Model model,
                                @RequestParam(value = "page", defaultValue = "0") Integer page,
                                @RequestParam(value = "size", defaultValue = "6") Integer size,
                                @RequestParam(value = "account_name", defaultValue = "", required = false) String account_name,
                                @RequestParam(value = "role_id", defaultValue = "-1", required = false) Integer role_id,
                                @RequestParam(value = "sortBy", required = false, defaultValue = "id") String sortBy,
                                @RequestParam(value = "sortDirection", required = false, defaultValue = "ASC") String sortDirection) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.valueOf(sortDirection), sortBy);
        Page<Account> accounts = this.accountService.getAllAccountPage(pageable, account_name, role_id);
        System.out.println(role_id);
        model.addAttribute("roles", roleService.getList());
        model.addAttribute("account_name", account_name);
        model.addAttribute("role_id", role_id);
        model.addAttribute("accounts", accounts);
        return "/managementAccount";
    }

    @GetMapping("sign-in")
    private String showFormLogin() {
        return "/sign-in";
    }

    @GetMapping("sign-up")
    private String showFormRegister(Model model) {
        AccountDTO accountDto = new AccountDTO();
        model.addAttribute("accountDto", accountDto);
        return "/sign-up";
    }

    @PostMapping("sign-up")
    public String register(@Valid @ModelAttribute("accountDto") AccountDTO accountDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        Boolean flag = false;
        if (accountService.checkUserAccount(accountDto.getUsername()) != null) {
            model.addAttribute("isExits", 1);
            flag = true;
        }
        if (accountService.checkPhoneAccount(accountDto.getPhone()) != null) {
            model.addAttribute("isExits2", 1);
            flag = true;
        }
        if (accountService.checkEmailAccount(accountDto.getEmail()) != null) {
            model.addAttribute("isExits3", 1);
            flag = true;

        }
        if (flag == true) {
            return "/sign-up";
        }
        if (bindingResult.hasFieldErrors() || accountDto == null) {
            return "/sign-up";
        } else {
            String encodedPassword = passwordEncoder.encode(accountDto.getPassword());
            Account account = new Account();
            BeanUtils.copyProperties(accountDto, account);
            account.setRole(roleService.findById(2));
            account.setPassword(encodedPassword);
            accountService.save(account);
            LocalDateTime localDateTime = LocalDateTime.now();
            model.addAttribute("timeNow", localDateTime);
            redirectAttributes.addFlashAttribute("msg", 1);
            return "redirect:/account/sign-in";
        }
    }
}
