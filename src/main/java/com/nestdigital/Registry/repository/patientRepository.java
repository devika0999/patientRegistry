package com.nestdigital.Registry.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.nestdigital.Registry.model.Patient;
@Repository
public interface patientRepository extends MongoRepository<Patient, Integer> {

}
