package com.genspringboot.proyect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.genspringboot.proyect.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer>{

    @Query(value = "SELECT * FROM car WHERE marca = ?1", nativeQuery = true)
    List<Car> findAllAutoMarca(String marca);

    @Query(value = "select * from car where color = ?1", nativeQuery = true)
    List<Car> findAllAutoColor(String color);

    @Query(value = "select * from car where color = ?1 and marca = ?2", nativeQuery = true)
    List<Car> findAllAutoColorMarca(String color, String marca);

    @Query(value = "select * from car c join c.carsell cs", nativeQuery = true)
    List<Car> buscarAutosVendidos();
}
