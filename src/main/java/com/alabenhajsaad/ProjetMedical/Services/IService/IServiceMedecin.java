package com.alabenhajsaad.ProjetMedical.Services.IService;

import com.alabenhajsaad.ProjetMedical.Model.Medecin;
import com.alabenhajsaad.ProjetMedical.Model.Patient;

import java.util.List;

public interface IServiceMedecin {
    public Medecin AddMedecin(Medecin M) ;
    public List<Medecin> GetAllMedecins () ;
    public void Delete(int id) ;
}
