package com.alabenhajsaad.ProjetMedical.Services;

import com.alabenhajsaad.ProjetMedical.Model.Rdv;
import com.alabenhajsaad.ProjetMedical.Repository.RdvRepository;
import com.alabenhajsaad.ProjetMedical.Services.IService.IServiceRdv;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceRdv implements IServiceRdv {
    private final RdvRepository repository ;

    @Override
    public Rdv AddRdv(Rdv rdv) {
        LocalDateTime date = rdv.getDateRdv() ;
        List<Rdv> patientRdv = repository.findByPatientIdAndDateRdv(rdv.getId(), rdv.getDateRdv()) ;
        List<Rdv> medecinRdv = repository.findByPatientIdAndDateRdv(rdv.getId(), rdv.getDateRdv()) ;

        return repository.save(rdv);
    }

    @Override
    public List<Rdv> GetAllRDV() {
        return repository.findAll();
    }
}
