package com.group1.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group1.eHealthCare.entity.OutPatient;

@Repository
public interface OutPatientRepository extends JpaRepository<OutPatient, Integer> {
}

