package com.generation.firstproyect.models;

public class Tablet {
    String marca;
    String modelo;
    String color;
    Boolean camara;
    Float tamanoPantalla;
    Boolean microfono;
    Float bateria;

    String sacarfoto(String foto){
        if(foto == "apretar el boton"){
            return "toma la foto";
        }
        return "no toma la foto";
    }
    String grabar(Boolean botonGrabar){
        if(botonGrabar == true){
            return "detener grabacion";
        } return" presione para grabar";
    }
}
