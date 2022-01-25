package com.java.seccion12_arreglos;

import java.util.Arrays;

public class IterandoArregloInverso {
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

        Arrays.sort(productos);

        System.out.println("===============  USANDO FOR  ===============");
        for (int i = 0; i < total ; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        // Primera forma de invertir el for es modificando la forma de imprimirlo
        System.out.println();
        System.out.println("===============  USANDO FOR INVERSO  ===============");

        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + (total - 1 - i) + " valor " + productos[total - 1 - i]);
        }

        // Segunda forma de invertir el for es cambiando su condición en el for
        System.out.println();
        System.out.println("===============  USANDO FOR INVERSO DOS  ===============");

        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para indice " + i + " valor " + productos[i]);
        }

    }
}
