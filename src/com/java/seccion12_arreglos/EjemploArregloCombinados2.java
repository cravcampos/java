package com.java.seccion12_arreglos;

import jdk.swing.interop.SwingInterOpUtils;

public class EjemploArregloCombinados2 {

    public static void main(String[] args) {

        //Ejercicio crear tres arreglos de tipo entero
        // los dos primeros van a contener numeros enteros de 1 a 10 el primero y el segundo de 5 a 50
        // el tercero se llenará de la siguiente manera:
        // Los dos primeros elementos en la posición 0 y 1 del arreglo 1, luego en la posición 2 y 3 los dos primeros elementos del arreglo b.
        // Luego los elementos 3 y 4 del arreglo a en la posición 4 y 5 del nuevo arreglo,
        // y luego los elementos 3 y 4 del arreglo b en la posición 6 y 7 del nuevo arreglo
        // y asi sucesivamente
        // implementarlo también para que pase de a 4 elementos

        int[] a, b,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        // Imprimimos el arreglo a
        System.out.println("Arreglo a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Imprimimos el arreglo b
        System.out.println();
        System.out.println("Arreglo b:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

        // llenar el arreglo de 2 en dos
        int aux = 0;
        for (int i = 0; i < a.length; i+=2) {// i pso 2 de i = i + 2 o i+=2
            for (int j = 0; j < 2; j++) { // for para recorrer el arreglo a las dos primeras posiciones
                c[aux++] = a[i + j ]; // asignamos su valor a las dos primeras posiciones del arreglo c
            }

            for (int j = 0; j < 2; j++) { // for para recorrer el arreglo b, las dos primeras posiciones
                c[aux++] = b[i + j ];// asignamos su valor a las dos siguientes posiciones del arreglo c
            }
        }

        // Imprimimos el arreglo c, en un foreach
        System.out.println();
        System.out.println("Arreglo c:");
        for (int d:c) {
            System.out.print(d + " ");
        }

        System.out.println();
        System.out.println("========== IMPLEMENTANDO DE A 4 ==========");

        a = new int[16];
        b = new int[16];
        c = new int[32];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        System.out.println("Arreglo a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Arreglo b:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

        int aux1 = 0;
        for (int i = 0; i < a.length; i+=4) {
            for (int j = 0; j < 4; j++) {
                c[aux1++] = a[i + j ];
            }

            for (int j = 0; j < 4; j++) {
                c[aux1++] = b[i + j ];
            }
        }

        System.out.println();
        System.out.println("Arreglo c:");
        for (int d:c) {
            System.out.print(d + " ");
        }

    }
}
