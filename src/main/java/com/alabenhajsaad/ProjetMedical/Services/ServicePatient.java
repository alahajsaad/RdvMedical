package com.alabenhajsaad.ProjetMedical.Services;

import com.alabenhajsaad.ProjetMedical.Model.Patient;
import com.alabenhajsaad.ProjetMedical.Repository.PatientRepository;
import com.alabenhajsaad.ProjetMedical.Services.IService.IServicePatient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicePatient implements IServicePatient {
    private final PatientRepository repository ;

    @Override
    public Patient AddPatient(Patient p) {
        return repository.save(p);
    }

    @Override
    public List<Patient> GetAllPatients() {
        return repository.findAll();
    }

    @Override
    public void Delete(int id) {
            Patient p  = repository.findById(id).get() ;
            repository.delete(p);
    }
}
