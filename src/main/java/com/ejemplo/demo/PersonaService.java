package com.ejemplo.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    // Simulamos una base de datos en memoria con una lista
    private List<Persona> listaPersonas = new ArrayList<>();

    public PersonaService() {
        // Agregamos algunos datos iniciales
        listaPersonas.add(new Persona("Sofia", 20));
        listaPersonas.add(new Persona("Carlos", 25));
        listaPersonas.add(new Persona("Laura", 22));
    }

    // Método para obtener todas las personas
    public List<Persona> obtenerTodas() {
        return listaPersonas;
    }

    // Método para agregar una nueva persona
    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }
}