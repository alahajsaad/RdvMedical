package com.alabenhajsaad.ProjetMedical.Services;

import com.alabenhajsaad.ProjetMedical.Model.Medecin;
import com.alabenhajsaad.ProjetMedical.Model.Patient;
import com.alabenhajsaad.ProjetMedical.Repository.MedecinRepository;
import com.alabenhajsaad.ProjetMedical.Services.IService.IServiceMedecin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceMedecin implements IServiceMedecin {
    private final MedecinRepository repository ;

    @Override
    public Medecin AddMedecin(Medecin M) {
        return repository.save(M);
    }

    @Override
    public List<Medecin> GetAllMedecins() {
        return repository.findAll();
    }

    @Override
    public void Delete(int id) {
        Medecin M  = repository.findById(id).get() ;
        repository.delete(M);
    }
}
