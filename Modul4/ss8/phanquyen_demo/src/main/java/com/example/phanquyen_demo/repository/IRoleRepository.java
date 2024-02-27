package com.example.phanquyen_demo.repository;

import com.example.phanquyen_demo.model.Account;
import com.example.phanquyen_demo.model.Role;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
@Repository
public interface IRoleRepository extends JpaRepository<Role,Integer> {
}
