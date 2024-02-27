package com.example.phanquyen_demo.service;

import com.example.phanquyen_demo.model.Account;
import com.example.phanquyen_demo.model.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IRoleService {
    List<Role> getList();

    Role findById(int id);
}