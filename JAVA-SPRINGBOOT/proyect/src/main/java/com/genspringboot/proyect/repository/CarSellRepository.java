package com.genspringboot.proyect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.genspringboot.proyect.model.CarSell;

public interface CarSellRepository extends CrudRepository <CarSell, Integer>{
    @Query(value = "select * from CarSell where cantidad = ?1", nativeQuery = true)
    List<CarSell> findAllCarSellCantidad(int cantidad);
}

