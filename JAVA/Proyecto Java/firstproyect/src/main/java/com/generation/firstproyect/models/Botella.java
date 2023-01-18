package com.generation.firstproyect.models;

public class Botella {
    // String tamanio; //pequeño, mediano, grande
    String liquido; //agua, bebida, porotos, etc.
    String marca;   //ccu, coca cola company
    Integer ml;     //cantidad de mililitros
    String material;//vidrio, plastico 
    
    // public String getTamanio() {
    //     return tamanio;
    // }
    // public void setTamanio(String tamanio) {
    //     this.tamanio = tamanio;
    // }
    public String getLiquido() {
        return liquido;
    }
    public void setLiquido(String liquido) {
        this.liquido = liquido;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Integer getMl() {
        return ml;
    }
    public void setMl(Integer ml) {
        this.ml = ml;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    
    public Botella() {
    }
    public Botella(String liquido, String marca, Integer ml, String material) {
        // this.tamanio = tamanio;
        this.liquido = liquido;
        this.marca = marca;
        this.ml = ml;
        this.material = material;
    }
    @Override
    public String toString() {
        return "Botella [liquido=" + liquido + ", marca=" + marca + ", ml=" + ml
                + ", material=" + material + "]";
    }
    
}
