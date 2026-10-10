package com.ejemplo.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    // Inyectamos el servicio
    @Autowired
    private PersonaService personaService;

    @GetMapping("/hola")
    public String saludar() {
        return "¡Hola desde Spring Boot!";
    }

    @GetMapping("/saludo")
    public String saludarConNombre(@RequestParam(defaultValue = "Usuario") String nombre) {
        return "¡Hola, " + nombre + "! Bienvenido a la API.";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludarConPath(@PathVariable String nombre) {
        return "¡Hola " + nombre + ", este es un parámetro de ruta!";
    }

    @GetMapping("/persona")
    public Persona obtenerPersona() {
        return new Persona("Sofia", 20);
    }

    @GetMapping("/personas")
    public List<Persona> obtenerPersonas() {
        return personaService.obtenerTodas();
    }

    @PostMapping("/persona")
    public String crearPersona(@RequestBody Persona persona) {
        personaService.agregarPersona(persona);
        return "Persona creada y guardada con éxito: " + persona.getNombre() + ", edad: " + persona.getEdad();
    }

    // --- EJERCICIO 1: Despedida ---
    @GetMapping("/despedida/{nombre}")
    public String despedirConPath(@PathVariable String nombre) {
        return "Hasta luego, " + nombre;
    }
    // Ejercicio 2: Perfil en formato JSON
@GetMapping("/perfil")
public Perfil obtenerPerfil() {
    return new Perfil("Sofia", "Bogotá", "Java");
}

    // --- EJERCICIO 3 (RETO): Suma de dos números ---
    @GetMapping("/suma/{a}/{b}")
    public String sumar(@PathVariable int a, @PathVariable int b) {
        int resultado = a + b;
        return "El resultado de sumar " + a + " + " + b + " es: " + resultado;
    }
}