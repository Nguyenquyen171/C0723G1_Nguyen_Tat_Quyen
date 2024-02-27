package com.example.phanquyen_demo.service;

import com.example.phanquyen_demo.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAccountService {
    void save(Account account);

    Account findById(int id);

    List<Account> getList();

    void delete(Account account);
    Account checkUserAccount(String nameAccount);
    Account checkPhoneAccount(String phone);
    Account checkEmailAccount(String email);
    Page<Account> getAllAccountPage(Pageable pageable, @Param("account_name") String account_name, @Param("role_id") Integer role_id);
    Account findByUserName(String userName);
}
