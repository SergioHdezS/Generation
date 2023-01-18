package com.generation.proyectoweb.model;

public class User {
    private int id;
    private String name;
    private String lastName;
    
    
    public User() {
    }

    public User(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
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

/*     @Override
    public boolean equals(Object obj) {
        if(obj instanceof User) {
            return ((User)obj).getId()==(this.getId()) &&
                    ((User)obj).getName().equals(this.getName()) &&
                    ((User)obj).getLastName().equals(this.getLastName());
        }
        return false;
    } */
}
