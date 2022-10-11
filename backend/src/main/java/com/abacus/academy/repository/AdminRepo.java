package com.abacus.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abacus.academy.model.AdminModel;


@Repository
public interface AdminRepo extends JpaRepository<AdminModel,String>{

}
