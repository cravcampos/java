package com.java.seccion12_arreglos;

import java.util.Arrays;

public class IterandoArregloInversoMutable {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy A71";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook i7 32GB ram";
        productos[4] = "Macbook Air Pro";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Xiaomi MI 9T Pro";

        System.out.println("==========  ARREGLO ORIGINAL  ==========");

        for (int i = 0; i < total ; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        // Pasando el arreglo de forma inversa algoritmo
        for (int i = 0; i < total/2; i++) {
            String actual = productos[i];
            String inverso = productos[total -1 - i];
            productos[i] = inverso;
            productos[total -1 - i] = actual;
        }

        System.out.println("===========  ARREGLO MODIFICADO ==========");
        for (int i = 0; i < total ; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}
