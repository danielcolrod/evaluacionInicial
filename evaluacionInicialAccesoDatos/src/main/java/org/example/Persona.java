package org.example;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String ciudadCP;

    public Persona(String nombre, String apellidos, String dni, String email, String ciudadCP) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.ciudadCP = ciudadCP;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", ciudadCP='" + ciudadCP + '\'' +
                '}';
    }
}