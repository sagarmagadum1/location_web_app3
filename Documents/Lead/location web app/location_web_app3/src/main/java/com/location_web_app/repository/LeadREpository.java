package com.location_web_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location_web_app.entity.Lead;

public interface LeadREpository extends JpaRepository<Lead, Long> {

}
