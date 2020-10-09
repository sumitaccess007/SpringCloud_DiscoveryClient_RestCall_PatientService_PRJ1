package com.sumitaccess007.controllers;

import com.sumitaccess007.entities.Patient;
import com.sumitaccess007.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping(value = "/fetch", produces = MediaType.APPLICATION_JSON_VALUE)
    public Patient fetchPatientDetailsByID(@RequestParam("patientID") int patientID){
        return patientService.getPatientDetailsByID(patientID);
    }
}
