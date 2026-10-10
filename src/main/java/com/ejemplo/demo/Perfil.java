package com.ejemplo.demo;

public class Perfil {
    private String nombre;
    private String ciudad;
    private String lenguajeFavorito;

    public Perfil(String nombre, String ciudad, String lenguajeFavorito) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lenguajeFavorito = lenguajeFavorito;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getLenguajeFavorito() { return lenguajeFavorito; }
    public void setLenguajeFavorito(String lenguajeFavorito) { this.lenguajeFavorito = lenguajeFavorito; }
}