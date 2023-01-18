package com.genspringboot.proyect.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.proyect.model.License;
import com.genspringboot.proyect.service.LicenseService;



@RestController
@CrossOrigin("*")
public class LicenseController {
    private LicenseService licenseService;
    public LicenseController(@Autowired LicenseService licenseService){
        this.licenseService = licenseService;
    }
    @PostMapping("/License/save")
    public void guardarLicencia(@RequestBody License license){
        licenseService.saveLicense(license);
    }
    @PutMapping("/License/Update")
    public void actualizarLicencia(@RequestBody License license){
        licenseService.updateLicense(license);
    }
    @GetMapping("/License/findAll")
    public Iterable<License> todasLasLicencias(){
        return licenseService.findAll();
    }
    @GetMapping("/License/buscarClase")
    public List<License> claseLicencia(@RequestBody String clase){
        return licenseService.buscarPorClase(clase);
    }
    @GetMapping("/License/buscarEstado")
    public List<License> estadoLicencia(@RequestBody String estado){
        return licenseService.buscarPorEstado(estado);
    }
    @GetMapping("/License/buscarFechaVenc")
    public List<License> FechaVencLicencia(@RequestBody Date fechaVencimiento){
        return licenseService.buscarPorFechaVenc(fechaVencimiento);
    }
    @DeleteMapping("/License/eliminarLicencia/{id}")
    public void eliminarLicencia(@PathVariable Integer id){
        licenseService.deleteLicencia(id);
    }
}
