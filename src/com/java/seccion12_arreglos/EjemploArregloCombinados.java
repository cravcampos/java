package com.java.seccion12_arreglos;

public class EjemploArregloCombinados {

    public static void main(String[] args) {

        //Ejercicio crear tres arreglos de tipo entero
        // los dos primeros van a contener numeros enteros de 1 a 10 el primero y el segundo de 5 a 50
        // el tercero se llenará de la siguiente manera:
        // El primer elemento del primer arreglo en la posición 0 y luego en la posición 1 el primero del segundo arreglo
        // El segundo elemento del primer arreglo en la posición 2 y luego en la posición 3 el segundo del segundo arreglo
        // y asi sucesivamente

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

        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        // Imprimimos el arreglo c en un foreach
        System.out.println();
        System.out.println("Arreglo c:");
        for (int d:c) {
            System.out.print(d + " ");
        }

    }
}
