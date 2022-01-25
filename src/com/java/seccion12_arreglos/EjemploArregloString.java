package com.java.seccion12_arreglos;

import java.util.Arrays;

public class EjemploArregloString {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy A71";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook i7 32GB ram";
        productos[4] = "Macbook Air Pro";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Xiaomi MI 9T Pro";

        // ordenar el arreglo de forma automática por abecedario
        //Este método también funciona para cualquier tipo de dato
        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

    }
}
