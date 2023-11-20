package com.group1.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.group1.eHealthCare.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	Appointment findByAid(@Param("aid") int aid);

}