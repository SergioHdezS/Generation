package com.genspringboot.proyect.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.proyect.model.License;
import com.genspringboot.proyect.repository.LicenseRepository;

@Service
@Transactional
public class LicenseService {
    private LicenseRepository licenseRepository;
    public LicenseService(LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    }
    public void saveLicense(License license){
        licenseRepository.save(license);
    }
    public void updateLicense(License license){
        licenseRepository.save(license);
    }
    public Iterable<License> findAll(){
        return licenseRepository.findAll();
    }
    public List<License> buscarPorClase (String clase){
        return licenseRepository.findAllLicenseClase(clase);
    }
    public List<License> buscarPorEstado (String estado){
        return licenseRepository.findAllLicenseEstado(estado);
    }
    public List<License> buscarPorFechaVenc (Date fechaVencimiento){
        return licenseRepository.findAllLicenseFechaVenc(fechaVencimiento);
    }
    public void deleteLicencia (Integer id){
        licenseRepository.deleteById(id);
    }
}
