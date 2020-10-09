package com.sumitaccess007.repositories;

import com.sumitaccess007.entities.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Integer> {
    Patient findById(int id);

}
