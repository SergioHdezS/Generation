package com.genspringboot.proyect.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.proyect.model.BuySell;
import com.genspringboot.proyect.repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {
    
    private BuySellRepository buySellRepository;
    
    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }

    public void saveBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }
    public void updateBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }
    public Iterable<BuySell> findAll(){
        return buySellRepository.findAll();
    }
    public List<BuySell> findAllBuySellMonto(int monto){
        return buySellRepository.findAllBuySellMonto(monto);
    }
    public List<BuySell> findAllBuySellFechaCompra(Date fechaCompra){
        return buySellRepository.findAllBuySellFechaCompra(fechaCompra);
    }
    public void deleteBuySell(Integer id){
        buySellRepository.deleteById(id);
    }
}
