package com.example.phanquyen_demo.service;

import com.example.phanquyen_demo.model.Role;
import com.example.phanquyen_demo.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService{
    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public List<Role> getList() {
        return roleRepository.findAll();
    }

    @Override    public Role findById(int id) {
        return roleRepository.findById(id).get();
    }

}