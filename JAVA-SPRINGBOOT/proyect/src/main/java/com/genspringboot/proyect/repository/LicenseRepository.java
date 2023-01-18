package com.genspringboot.proyect.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.genspringboot.proyect.model.License;

public interface LicenseRepository extends CrudRepository <License, Integer>{
    
    @Query(value = "SELECT * FROM license WHERE clase = ?1", nativeQuery = true)
    List<License> findAllLicenseClase(String clase);

    @Query(value = "select * from license where estado = ?1", nativeQuery = true)
    List<License> findAllLicenseEstado(String estado);

    @Query(value = "select * from license where fechaVencimiento = ?1", nativeQuery = true)
    List<License> findAllLicenseFechaVenc(Date fechaVencimiento);
}
