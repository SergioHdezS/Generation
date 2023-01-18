package com.genspringboot.proyect.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
// le vamos a poner el nombre a nuestra tabla en la bd
@Entity (name = "User")
public class User {
    // le especificamos a la base quie el siguiente atributo sera el id de la tabla
    @Id
    //generamos la llave primaria
    @GeneratedValue
    // definimos el atributo id
    private int id;
    private String name;
    @Column(name="last_name") //cambia el nombre de la columna en la base de datos
    private String lastName;
    @Column(name="email", unique = true)
    private String correo;

    //relacion one to one
    ///@JsonBackReference //estas dos lineas siempre debn ir en relaciones uno a uno
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private License license;
    
    //relacion one to many
    //@JsonBackReference 
    // en las relaciones one to many el fetch siempre se hace con eager
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuySell> buySell;

    public User() {
    }

    public User(int id, String name, String lastName, String correo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public List<BuySell> getBuySell() {
        return buySell;
    }

    public void setBuySell(List<BuySell> buySell) {
        this.buySell = buySell;
    }
}
