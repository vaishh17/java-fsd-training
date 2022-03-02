package com.ust.sba5.Service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.sba5.Entity.*;
import com.ust.sba5.Repository.*;
import com.ust.sba5.Service.*;


@Service
public class PatientsServiceImpl implements PatientsService {
	
	@Autowired
	private PatientsRepository patientsRepository;
	
	@Override
	public Patients savePatient(Patients patient) {
		
		return patientsRepository.save(patient);
	}

	@Override
	public List<Patients> getPatients() {
		
		return patientsRepository.findAll();
	}

	@Override
	public Patients updatePatient(Long id, Patients patient) {
		Optional<Patients> findById  = patientsRepository.findById(id);
		if(findById.isPresent())
		{
			Patients patientEntity = findById.get();
			if(patient.getName() != null && !patient.getName().isEmpty())
			{
				patientEntity.setName(patient.getName());
			}
			
			if(patient.getAge() != null)
			{
				patientEntity.setAge(patient.getAge());
			}
			patientsRepository.save(patientEntity);
		}
		return null;
	}

	@Override
	public void deletePatients(Long id) {
		patientsRepository.deleteById(id);
		
	}

}
