package com.company;

public abstract class Verdura{
    private int precio;
    private String nombre;

    public Verdura(int precio,String nombre){
        this.nombre = nombre;
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}