package com.ust.sba5.Service;

import java.util.List;

import com.ust.sba5.Entity.Patients;


public interface PatientsService {
	
public Patients savePatient(Patients patient);
	
	public List<Patients> getPatients();
	
	public Patients updatePatient(Long id, Patients patient);
	
	public void deletePatients(Long id); 

}
