package com.alabenhajsaad.ProjetMedical.Services.IService;

import com.alabenhajsaad.ProjetMedical.Model.Patient;

import java.util.List;

public interface IServicePatient {
    public Patient AddPatient(Patient p) ;
    public List<Patient> GetAllPatients () ;
    public void Delete(int id) ;
}
