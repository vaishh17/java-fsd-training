package com.ust.sba5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.sba5.Entity.Patients;
import com.ust.sba5.Service.PatientsService;



@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientsService patientsService;
	
	@PostMapping("/save")
	public Patients savePatient(@RequestBody Patients patient)
	{
		return patientsService.savePatient(patient);
	}
	
	@GetMapping("/list")
	public List<Patients> getPatients(@RequestBody Patients patient)
	{
		return patientsService.getPatients();
	}
	
	@PutMapping("/update/{patient_id}")
	public Patients updatePatient(@RequestBody Patients patient, @PathVariable("patient_id") Long id)
	{
		return patientsService.updatePatient(id, patient);
	}
	
	@PutMapping("/delete/{patient_id}")
	public String deletePatient(@PathVariable("patient_id") Long id)
	{
		 patientsService.deletePatients(id);
		 return "deleted successfully";
	}
	
}

