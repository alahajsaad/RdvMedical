package com.alabenhajsaad.ProjetMedical.Controller;

import com.alabenhajsaad.ProjetMedical.Model.Medecin;
import com.alabenhajsaad.ProjetMedical.Services.IService.IServiceMedecin;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/medecin")
public class MedecinController{
    private final IServiceMedecin iServiceMedecin ;

    @PostMapping("add")
    public Medecin AddMedecin(@RequestBody Medecin M) {
        return iServiceMedecin.AddMedecin(M);
    }

    @GetMapping("all")
    public List<Medecin> GetAllMedecins() {
        return iServiceMedecin.GetAllMedecins();
    }

    @DeleteMapping("{id}")
    public void Delete(@PathVariable int id) {
              iServiceMedecin.Delete(id);
    }
}
