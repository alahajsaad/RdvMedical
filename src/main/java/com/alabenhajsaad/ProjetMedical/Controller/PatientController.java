package com.alabenhajsaad.ProjetMedical.Controller;

import com.alabenhajsaad.ProjetMedical.Model.Patient;
import com.alabenhajsaad.ProjetMedical.Services.IService.IServicePatient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/patient")
public class PatientController {
    private final IServicePatient iServicePatient ;
    @PostMapping("add")
    public Patient AddPatient(@RequestBody Patient p) {
        return iServicePatient.AddPatient(p);
    }

    @GetMapping("all")
    public List<Patient> GetAllPatients() {
        return iServicePatient.GetAllPatients();
    }

    @DeleteMapping("{id}")
    public void Delete(@PathVariable int id) {
            iServicePatient.Delete(id);
    }
}
