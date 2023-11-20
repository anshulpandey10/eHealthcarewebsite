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

import com.group1.eHealthCare.entity.Appointment;
import com.group1.eHealthCare.service.AppointmentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	private AppointmentService service;

	@PostMapping("/pmapt")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return service.createAppointment(appointment);
	}

	@GetMapping("/gmapt")
	public List<Appointment> getAllAppointments() {
		return service.getAllAppointments();
	}

	@GetMapping("/apptbid/{id}")
	public Appointment getAppointmentById(@PathVariable int id) {
		return service.getAppointmentById(id);
	}

	@PutMapping("/modapptbid/{id}")
	public Appointment modifyAppointment(@RequestBody Appointment appointment) {
		return service.modifyAppointment(appointment);
	}

	@DeleteMapping("/delapptbid/{id}")
	public String removeAppointment(@PathVariable int id) {
		return service.removeAppointment(id);
	}

}
