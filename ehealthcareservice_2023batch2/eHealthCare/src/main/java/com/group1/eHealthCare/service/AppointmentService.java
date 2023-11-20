package com.group1.eHealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group1.eHealthCare.entity.Appointment;
import com.group1.eHealthCare.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository repository;

	public Appointment createAppointment(Appointment appointment) {
		return repository.save(appointment);
	}

	public List<Appointment> createAppointments(List<Appointment> appointments) {
		return repository.saveAll(appointments);
	}

	public List<Appointment> getAllAppointments() {
		return repository.findAll();
	}

	public Appointment getAppointmentById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Appointment modifyAppointment(Appointment appointment) {
		return repository.save(appointment);
	}

	public String removeAppointment(int id) {
		repository.deleteById(id);
		return "product removed !! " + id;
	}

}