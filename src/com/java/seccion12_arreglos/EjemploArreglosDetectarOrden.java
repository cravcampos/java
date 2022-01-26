package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio pedir 10 valores en un arreglo y al final imprimir si el arreglo está ordenado ascendentemente,
        // descendentemente, sus valores son iguales o está desordenado.

        // Creamos arreglo de enteros
        int[] numeros = new int[10];

        // creamos variable para obtener el resultado de ascendente
        boolean ascendente = false;
        // creamos variable para obtener el resultado de descendente
        boolean descendente = false;

        // Pedimos los datos al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese número en la posición " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        // recorremos el arreglo
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {// si número en la posición 0 es mayor a número en la posición 1
                descendente = true; // descendente es verdadero
            }

            if (numeros[i] < numeros[i + 1]) {// si número en la posición 0 es mayor a número en la posición 1
                ascendente = true;// ascendente es verdadero
            }
        }

        // si ascendente y descendente son verdaderos el arreglo está desordenado
        if (ascendente == true && descendente == true) {
            System.out.println("Arreglo desordenado");
        }

        // si ascendente y descendente son falsos los datos del arreglo son todos iguales
        if (ascendente == false && descendente == false) {
            System.out.println("Todos los datos del arreglo son iguales");
        }

        // si ascendente es verdadero y descendente falso el arreglo está ordenado ascendentemente
        if (ascendente == true && descendente == false) {
            System.out.println("Arreglo ordenado ascendentemente");
        }

        // si ascendente es falso y descendente verdadero el arreglo está ordenado descendentemente
        if (ascendente == false && descendente == true) {
            System.out.println("Arreglo ordenado descendentemente");
        }
    }
}
