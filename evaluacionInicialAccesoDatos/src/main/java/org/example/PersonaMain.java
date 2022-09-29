package org.example;

import java.util.Random;
import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas personas aleatorias quieres generar?");
        int opcion = sc.nextInt();

        for (int i = 0; i < opcion; i++) {
            String nombre = devolverAleatorio(DatosPersonas.listaNombre);
            String apellidos = devolverAleatorio(DatosPersonas.listaApellidos);
            String dni = obtenerDni();
            String email = obtenerEmail(nombre, apellidos, dni);
            String direccion = devolverAleatorio(DatosPersonas.listaDirecciones);

            Persona persona = new Persona(
                    nombre, apellidos, dni, email, direccion
            );
            System.out.println("Persona " + (i + 1));
            System.out.println(persona);
        }
    }

    public static String devolverAleatorio(String[] array) {
        return array[(int)(Math.random() * array.length)];
    }

    public static String obtenerEmail(String nombre, String apellidos, String dni) {
        StringBuilder sbEmail = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            sbEmail.append(nombre.charAt(i));
        }
        for (int i = 0; i < 2; i++) {
            sbEmail.append(apellidos.charAt(i));
        }
        for (int i = 0; i < 2; i++) {
            sbEmail.append(dni.charAt(i));
        }
        sbEmail.append("@gmail.com");
        return sbEmail.toString();
    }

    public static String obtenerDni() {
        StringBuilder sbNumeroDni = new StringBuilder();
        StringBuilder sbDniCompleto = new StringBuilder();
        char[] caracteresDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        for (int i = 0; i < 8; i++) {
            sbNumeroDni.append((int)(Math.random() * 9));
        }

        char letraDNI = caracteresDni[Integer.parseInt(sbNumeroDni.toString()) % 23];
        sbDniCompleto.append(sbNumeroDni.toString());
        sbDniCompleto.append(letraDNI);

        return sbDniCompleto.toString();
    }
}
