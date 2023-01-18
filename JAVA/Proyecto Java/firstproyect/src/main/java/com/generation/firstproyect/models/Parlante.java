package com.generation.firstproyect.models;

public class Parlante {
    String marca;
    String modelo;
    String color;
    String entradaAudio;
    String salidaAudio;
    Float entradaCorriente;//voltaje que recibe
    String botonEncendido;
    Integer bocina;//cantidad de bocinas
    String botonApagado;
    String botonVolumenMas;
    String botonVolumenMenos;
    
    
    public Parlante() {
    }

    public Parlante(String marca, String modelo, String color, String entradaAudio, String salidaAudio,
            Float entradaCorriente, String botonEncendido, Integer bocina, String botonApagado, String botonVolumenMas,
            String botonVolumenMenos) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.entradaAudio = entradaAudio;
        this.salidaAudio = salidaAudio;
        this.entradaCorriente = entradaCorriente;
        this.botonEncendido = botonEncendido;
        this.bocina = bocina;
        this.botonApagado = botonApagado;
        this.botonVolumenMas = botonVolumenMas;
        this.botonVolumenMenos = botonVolumenMenos;
    }
    

    //getters and setters
    public String getEntradaAudio() {
        return entradaAudio;
    }

    public void setEntradaAudio(String entradaAudio) {
        this.entradaAudio = entradaAudio;
    }

    public String getSalidaAudio() {
        return salidaAudio;
    }

    public void setSalidaAudio(String salidaAudio) {
        this.salidaAudio = salidaAudio;
    }

    public Float getEntradaCorriente() {
        return entradaCorriente;
    }

    public void setEntradaCorriente(Float entradaCorriente) {
        this.entradaCorriente = entradaCorriente;
    }

    public Integer getBocina() {
        return bocina;
    }

    public void setBocina(Integer bocina) {
        this.bocina = bocina;
    }

    public String getBotonApagado() {
        return botonApagado;
    }

    public void setBotonApagado(String botonApagado) {
        this.botonApagado = botonApagado;
    }

    public String getBotonVolumenMas() {
        return botonVolumenMas;
    }

    public void setBotonVolumenMas(String botonVolumenMas) {
        this.botonVolumenMas = botonVolumenMas;
    }

    public String getBotonVolumenMenos() {
        return botonVolumenMenos;
    }

    public void setBotonVolumenMenos(String botonVolumenMenos) {
        this.botonVolumenMenos = botonVolumenMenos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBotonEncendido() {
        return botonEncendido;
    }

    public void setBotonEncendido(String botonEncendido) {
        this.botonEncendido = botonEncendido;
    }

    // funciones
    void encender(){
        System.out.println("encender");
    }

    void apagar(){
        System.out.println("apagar");
    }
    
    String controlarVolumen(String vol){
        if (vol == "subir"){
            return "sube el volumen";
        } else if (vol == "bajar"){
            return "baja el volumen";
        } else{
            return "no hace nada";
        }
    }

    String reproducir(String botonReproducir){
        if (botonReproducir == "apretar"){
            return "reproducir";
        } else {
            return "no hace nada";
        }
    }

    String pausar(String botonPausa){
        if (botonPausa == "apretar"){
            return "pausar";
        } else {
            return "no hace nada";
        }
    }

    @Override
    public String toString() {
        return "Parlante [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", entradaAudio=" + entradaAudio
                + ", salidaAudio=" + salidaAudio + ", entradaCorriente=" + entradaCorriente + ", botonEncendido="
                + botonEncendido + ", bocina=" + bocina + ", botonApagado=" + botonApagado + ", botonVolumenMas="
                + botonVolumenMas + ", botonVolumenMenos=" + botonVolumenMenos + "]";
    } 

    
}

