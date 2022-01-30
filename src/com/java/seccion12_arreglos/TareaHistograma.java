package com.java.seccion12_arreglos;

import java.util.Scanner;

public class TareaHistograma {
    public static void main(String[] args) {
        /*
        * Escribir un programa que recorra un arreglo y genere un histograma con base a los valores de este.
        *
        * El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
        *
        * Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un
        * conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
        * incluso si no están presente en el arreglo.
        *
        * Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
        *
        * 1: ***
        * 2:
        * 3: *
        * 4: *****
        * 5: *
        * 6: **
        *
        * Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
        * */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero de 1 a 6: ");
            numeros[i] = sc.nextInt();
        }

        String[] histograma = new String[6];

        for (int i = 0; i < histograma.length; i++) {
            int cantidad = i + 1;
            StringBuilder histo = new StringBuilder(cantidad + ": ");
            for (int numero : numeros) {
                if (cantidad == numero) {
                    histo.append("*");
                }
            }
            histograma[i] = histo.toString();
        }

        for (String s : histograma) {
            System.out.println(s);
        }
    }
}
