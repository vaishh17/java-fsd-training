package com.ust.sba5.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ust.sba5.Entity.Patients;



public interface PatientsRepository extends MongoRepository<Patients, Long> {

}

