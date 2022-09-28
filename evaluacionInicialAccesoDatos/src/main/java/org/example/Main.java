package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo quieres llamar al fichero?");
        String fileName = sc.nextLine() + ".txt";

        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Fichero creado correctamente");
            } else {
                System.out.println("El fichero ya existe");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Escribe para el fichero.");
            writer.write(sc.nextLine());
            writer.close();
            System.out.println("Fichero escrito correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }

    }
}