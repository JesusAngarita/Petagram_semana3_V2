package com.jesusangarita.petagram;

public class Perro {

    private int foto;
    private String nombre;
    private String cantLike;

    //Constructor
    public Perro(int foto, String nombre, String cantLike) {
        this.foto = foto;
        this.nombre = nombre;
        this.cantLike = cantLike;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantLike() {
        return cantLike;
    }

    public void setCantLike(String cantLike) {
        this.cantLike = cantLike;
    }

}