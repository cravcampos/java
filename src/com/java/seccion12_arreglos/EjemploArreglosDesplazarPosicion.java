package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        /*
        * Pedir 10 numeros por consola
        * Imprimir los numeros de la siguiente forma
        * el índice cero es el último agregado
        * el índice 1 es el segundo agregado
        * el índice 2 es el terce numero agregado y asi sucesivamente
        * ejemplo de entrada 1 2 3 4 5 6 7 8 9 10
        * Ejemplo de resultado 10 1 2 3 4 5 6 7 8 9
        * */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; // creamos nuestro arreglo
        int ultimo; // creamos una variable para guardar el ultimo ingresado

        // pedimos en consola los valores del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero en la posición " + (i+1));
            numeros[i] = sc.nextInt();
        }

        // ultimo es igual a el tamaño del arreglo - 1 para llenar al contrario el arreglo
        ultimo = numeros[numeros.length-1];

        // recorremos el arreglo al contrario asignando los valores
        for (int i = numeros.length - 2; i >= 0; i--) {
            numeros[i+1] = numeros[i];
        }
        numeros[0]= ultimo; // decimos q el ultimo en entrar va a ser el primero en salir

        // Imprimimos el arreglo
        System.out.println("El arreglo final es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
