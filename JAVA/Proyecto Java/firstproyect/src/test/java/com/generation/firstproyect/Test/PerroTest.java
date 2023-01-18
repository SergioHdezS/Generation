package com.generation.firstproyect.Test;
import static org.junit.jupiter.api.Assertions.*; //importacion

import org.junit.jupiter.api.Test; //importacion

import com.generation.firstproyect.models.Perro;


class PerroTest {   //test no puede ser publica
    @Test
    void testAdopcion(){
        Perro perro = new Perro();
        assertEquals(false, perro.adopcion());


    }
    
    @Test
    void testTruco(){
        Perro perro = new Perro();
        assertEquals("doy la pata", perro.truco("da la pata"));
    }
    @Test
    void testTrucoFail (){
        Perro perro = new Perro();
        assertEquals("doy la pata", perro.truco("Hazte el muerto"));
    }
    
}
