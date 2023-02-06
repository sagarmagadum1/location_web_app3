package com.rest.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.test.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Long> {

}
