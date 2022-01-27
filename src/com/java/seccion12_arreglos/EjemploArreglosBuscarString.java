package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        /*
        *  Crear un arreglo de 10 posiciones de tipo String
        *  Pedir los datos en consola y rellenar el arreglo
        *  Pedir en consola el nombre a buscar.
        *  Buscar un elemento del arreglo y mostrar su índice
        * */

        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[10];

        // for para solicitar los datos al usuario
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre en la posición " + i + " : ");
            nombres[i] = sc.next();
        }

        System.out.println();
        System.out.println("Ingrese nombre a buscar");
        String nombre = sc.next();
        int i = 0;

        // Mientras el iterador sea menor que el tamaño del arreglo y el valor en la posición i, del arreglo sea diferente
        // del nombre a buscar aumente a i
        while(i < nombres.length && !nombres[i].equalsIgnoreCase(nombre)){
            i++;
        }

        // si i == al tamaño del arreglo no se encontró el nombre
        if (i == nombres.length){
            System.out.println("Número no encontrado");
        }else if(nombres[i].equalsIgnoreCase(nombre)) // si el valor de nombre coincide con el de la posición del arreglo mostramos su índice
            System.out.println("la posición del nombre buscado es = " + i);
    }
}
