package com.genspringboot.proyect.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.proyect.model.CarSell;
import com.genspringboot.proyect.repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {

    private CarSellRepository carSellRepository;
    
    public CarSellService(CarSellRepository carSellRepository){
        this.carSellRepository = carSellRepository;
    }

    public void saveCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }
    public void updateCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }
    public Iterable<CarSell> findAll(){
        return carSellRepository.findAll();
    }
    public List<CarSell> findAllCarSellCantidad(int cantidad){
        return carSellRepository.findAllCarSellCantidad(cantidad);
    }
    public void deleteCarSell(Integer id){
        carSellRepository.deleteById(id);
    }

}
