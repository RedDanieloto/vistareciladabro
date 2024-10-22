package com.example.recycleview.models;

public class Dinosaurio {
    private String nombre;
    private String tipo;
    private String descripcion;
    private String color;
    private int imagen;

    public Dinosaurio(String nombre, String tipo, String descripcion, String color, int imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.color = color;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getColor() {
        return color;
    }

    public int getImagen() {
        return imagen;
    }
}
