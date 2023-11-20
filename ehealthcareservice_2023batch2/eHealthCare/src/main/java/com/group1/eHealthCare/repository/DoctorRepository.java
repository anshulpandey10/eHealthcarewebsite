package com.group1.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group1.eHealthCare.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}

