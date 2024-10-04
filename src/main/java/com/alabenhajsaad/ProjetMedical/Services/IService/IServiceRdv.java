package com.alabenhajsaad.ProjetMedical.Services.IService;

import com.alabenhajsaad.ProjetMedical.Model.Rdv;

import java.time.LocalDate;
import java.util.List;

public interface IServiceRdv {
    public Object AddRdv(Rdv rdv) ;
    public List<Rdv> GetAllRDV();
    public List<Rdv> findAppointmentsByDate(LocalDate date) ;
}
