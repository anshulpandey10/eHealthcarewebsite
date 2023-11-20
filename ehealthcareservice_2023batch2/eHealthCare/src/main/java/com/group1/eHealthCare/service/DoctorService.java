package com.group1.eHealthCare.service;

import java.util.List
;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group1.eHealthCare.entity.Doctor;
import com.group1.eHealthCare.repository.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;

	public Doctor save(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	public void deleteDoctor(int id) {
		doctorRepository.deleteById(id);
	}

	public Doctor getDoctorById(int id) {
		return doctorRepository.findById(id).orElse(null);
	}

	public Doctor updateDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

}
