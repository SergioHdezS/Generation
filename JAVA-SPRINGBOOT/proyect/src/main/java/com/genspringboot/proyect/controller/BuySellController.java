package com.genspringboot.proyect.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.proyect.model.BuySell;
import com.genspringboot.proyect.service.BuySellService;

@RestController
@CrossOrigin("*")
public class BuySellController {

    private BuySellService buySellService;
    private BuySellController(@Autowired BuySellService buySellService){
        this.buySellService = buySellService;
    }

    //save
    @PostMapping("/BuySell/save")
    public void guardarBuySell(@RequestBody BuySell buySell){
        buySellService.saveBuySell(buySell);
    }
    //update
    @PutMapping("/BuySell/update")
    public void actualizarBuySell(@RequestBody BuySell buySell){
        buySellService.updateBuySell(buySell);
    }
    ///findall
    @GetMapping("/BuySell/findAll")
    public Iterable<BuySell> todosLosBuySell(){
        return buySellService.findAll();
    }
    // find monto 
    @GetMapping("/BuySell/buscarMonto")
    public List<BuySell> buscarMonto(@RequestBody int monto){
        return buySellService.findAllBuySellMonto(monto);
    }
    // find fecha compra
    @GetMapping("/BuySell/buscarFechaCompra")
    public List<BuySell> buscarFechaCompra(@RequestBody Date fechaCompra){
        return buySellService.findAllBuySellFechaCompra(fechaCompra);
    }
    //delete
    @DeleteMapping("/BuySell/deleteBuySell/{id}")
    public void eliminarBuySell(@PathVariable Integer id){
        buySellService.deleteBuySell(id);
    }
}
