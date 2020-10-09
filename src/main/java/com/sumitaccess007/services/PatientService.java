package com.sumitaccess007.services;

import com.sumitaccess007.entities.Patient;
import com.sumitaccess007.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Patient getPatientDetailsByID(int patientID) {
        return patientRepository.findById(patientID);
    }
}
