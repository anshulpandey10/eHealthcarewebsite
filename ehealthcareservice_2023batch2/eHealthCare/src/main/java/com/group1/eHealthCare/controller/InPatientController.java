package com.group1.eHealthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.eHealthCare.entity.InPatient;
import com.group1.eHealthCare.service.InPatientService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/inpatient")
public class InPatientController {

	@Autowired
	private InPatientService service;

	@PostMapping("/addpatient")
	public InPatient addPatient(@RequestBody InPatient patient) {
		return service.saveInPatient(patient);
	}

	@GetMapping("/patients")
	public List<InPatient> findAllPatients() {
		return service.getPatients();
	}

	@GetMapping("/patientById/{id}")
	public InPatient findPatientById(@PathVariable int id) {
		return service.getPatientById(id);
	}

	@PutMapping("/updateproduct/{id}")
	public InPatient updatePatient(@RequestBody InPatient patient) {
		return service.updatePatient(patient);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePatient(@PathVariable int id) {
		return service.deletePatient(id);
	}

}
