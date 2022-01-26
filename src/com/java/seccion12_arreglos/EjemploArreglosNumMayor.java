package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio Pedir 5 números por consola y mostrar al final el mayor ingresado

        // creamos el arreglo
        int[] numeros = new int[5];

        // variable auxiliar para guardar el mayor
        int max = 0;

        // for para pedir los datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese número entero en la posición " + (i+1));
            numeros[i] = sc.nextInt();
        }

        // for para recorrer el arreglo y obtener el mayor
        for (int i = 1; i < numeros.length; i++) {
            // operador ternario si numeros[0] es mayor numeros[i]
            // entonces retorna max si no retorna i
            max = (numeros[max] > numeros[i] ? max : i);
        }
        System.out.println("El número mayor es: " + numeros[max]);
    }
}
