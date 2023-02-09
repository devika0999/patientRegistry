package com.nestdigital.Registry.controller;

import com.nestdigital.Registry.model.Patient;
import com.nestdigital.Registry.repository.patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private patientRepository repo;

    @GetMapping("/viewPatients")
    public ResponseEntity<?> getAllPatients()
    {
        List<Patient> repos=repo.findAll();
        if(repos.size() > 0){
            return new ResponseEntity<List<Patient>>(repos, HttpStatus.OK);

        }else {
            return new ResponseEntity<>("no patients",HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> addPatients(@RequestBody Patient patient){
        try {
            repo.save(patient);
            return new ResponseEntity<Patient>(patient, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
