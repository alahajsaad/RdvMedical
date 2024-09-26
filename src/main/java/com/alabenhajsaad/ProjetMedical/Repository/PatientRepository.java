package com.alabenhajsaad.ProjetMedical.Repository;

import com.alabenhajsaad.ProjetMedical.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient , Integer> {
}
