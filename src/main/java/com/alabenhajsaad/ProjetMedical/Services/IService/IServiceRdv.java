package com.alabenhajsaad.ProjetMedical.Services.IService;

import com.alabenhajsaad.ProjetMedical.Model.Rdv;

import java.util.List;

public interface IServiceRdv {
    public Rdv AddRdv(Rdv rdv) ;
    public List<Rdv> GetAllRDV();
}
