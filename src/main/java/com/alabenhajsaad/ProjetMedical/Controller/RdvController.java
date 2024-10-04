package com.alabenhajsaad.ProjetMedical.Controller;

import com.alabenhajsaad.ProjetMedical.Model.Rdv;
import com.alabenhajsaad.ProjetMedical.Services.IService.IServiceRdv;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rdv")
public class RdvController {
    private final IServiceRdv iServiceRdv ;
    @PostMapping("add")
    public Object add(@RequestBody Rdv rdv) {
        return iServiceRdv.AddRdv(rdv) ;
    }
    @GetMapping("all")
    public List<Rdv> allRdv() {
        return iServiceRdv.GetAllRDV() ;
    }

    @GetMapping("AppointmentsByDate")
    public List<Rdv> findAppointmentsOnDate(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return iServiceRdv.findAppointmentsByDate(date);
    }

}
