package com.genspringboot.proyect.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.genspringboot.proyect.model.BuySell;


public interface BuySellRepository extends CrudRepository <BuySell, Integer>{
    //monto
    @Query(value = "select * from BuySell where monto = ?1", nativeQuery = true)
    List<BuySell> findAllBuySellMonto(int monto);
    //fechacompra
    @Query(value = "select * from BuySell where fechaCompra = ?1", nativeQuery = true)
    List<BuySell> findAllBuySellFechaCompra(Date fechaCompra);
}
