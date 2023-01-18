package com.genspringboot.proyect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.proyect.model.CarSell;
import com.genspringboot.proyect.service.CarSellService;

@RestController
@CrossOrigin("*")
public class CarSellController {
    private CarSellService carSellService;
    private CarSellController(@Autowired CarSellService carSellService){
        this.carSellService = carSellService;
    }
    //save
    @PostMapping("/CarSell/save")
    public void guardarCarSell(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);
    }
    //update 
    @PostMapping("/CarSell/update")
    public void actualizarCarSell(@RequestBody CarSell carSell){
        carSellService.updateCarSell(carSell);
    }
    //findAll
    @GetMapping("CarSell/findAll")
    public Iterable<CarSell> todosLosCarSell(){
        return carSellService.findAll();
    }
    //find cantidad
    @GetMapping("CarSell/buscarCantidad")
    public List<CarSell> buscarCantidad(@RequestBody int cantidad){
        return carSellService.findAllCarSellCantidad(cantidad);
    }
    //delete
    @DeleteMapping("/eliminarCarSell/{id}")
    public void eliminarCarSell(@PathVariable Integer id){
        carSellService.deleteCarSell(id);
    }
}
