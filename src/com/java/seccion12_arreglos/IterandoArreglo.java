package com.java.seccion12_arreglos;

import java.util.Arrays;

public class IterandoArreglo {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length; // tamaño del arreglo

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy A71";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook i7 32GB ram";
        productos[4] = "Macbook Air Pro";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Xiaomi MI 9T Pro";

        Arrays.sort(productos); // ordenamos el arreglo

        // Recorremos el arreglo con un ciclo for es la forma más recomendada, ya que es más eficiente
        System.out.println("===============  USANDO FOR  ===============");
        for (int i = 0; i < total ; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        // iterando el arreglo con un foreach
        System.out.println("===============  USANDO FOREACH  ===============");
        for (String producto: productos) {
            System.out.println("Producto = " + producto);
        }


        // iterando el arreglo con un while
        System.out.println("===============  USANDO WHILE  ===============");
        int i = 0;
        while (i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("===============  USANDO DO WHILE  ===============");
        int j = 0;
        do{
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }while (j < total);


        // llenar un arreglo de números usando un for
        int[] numeros = new int[10];
        int tam = numeros.length;

        // for para llenar el arreglo en este caso con los números de cinco en cinco
        for (int k = 0; k < tam; k++) {
            numeros[k] = k * 5;
        }

        // for para mostrar los valores del arreglo
        for (int numero : numeros) {
            System.out.println("números = " + numero);
        }

    }
}
