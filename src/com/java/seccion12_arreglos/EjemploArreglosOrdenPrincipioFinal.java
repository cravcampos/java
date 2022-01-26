package com.java.seccion12_arreglos;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        // Ejercicio mostrar los primeros 10 números enteros en un arreglo
        // Luego organizarlos de la forma primero último
        // Como los números son del 1 al 10 mostrar 1 10 2 9 3 8 4 7 5 6
        // Luego de mostrar el arreglo debe llenarse otro con las posiciones nuevas
        // Se debe mostrar el nuevo arreglo

        int[] numeros = new int[10];
        int[] numeros2 = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }

        // primera forma es dividiendo el tamaño del arreglo en dos
        for (int i = 0; i < numeros.length/2; i++) {
            System.out.println("números = " + numeros[i]);
            System.out.println("números = " + numeros[numeros.length -1 -i]);
        }

        // primera forma es restando i a cada iteración
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.print( numeros[i] + " " + numeros[numeros.length -1 -i] + "\n");
        }

        // llenando el nuevo arreglo
        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) {
            numeros2[aux++] = numeros[i];
            numeros2[aux++] = numeros[numeros.length -1 -i];
        }

        // Mostramos en nuevo arreglo
        for (int j : numeros2) {
            System.out.print(j + " ");

        }
    }
}
