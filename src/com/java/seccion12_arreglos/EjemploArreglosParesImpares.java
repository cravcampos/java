package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        /*Ejercicio
         * Obtenga 10 números enteros por teclado y guarde sus valores en un arreglo llamado numeros
         * Calcule cuantos son pares y cuantos son impares
         * Cree dos arreglos llamados pares e impares y asignar su tamaño según cantidad de pares e impares
         * Llene cada uno de los arreglos según corresponda n+umeros pares en arreglo pares y números impares en arreglo impares
         * Muestre arreglo ariginal. pares e impares
        */

        Scanner sc = new Scanner(System.in);

        int[] numeros, pares, impares; // creamos los tres arreglos
        int contadorPares = 0; // creamos un contador de pares
        int contadorImpares = 0; // creamos un contador de impares
        int auxPares = 0; // variable auxiliar de pares
        int auxImpares = 0; // variable auxiliar de impares
        numeros = new int[10]; // asignamos el tamaño del arreglo números

        // Solicitamos al usuario los datos del arreglo números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese en número en la posición " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        // Recorremos el arreglo números
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){ // preguntamos si el número en la posición i tiene resto 0
                contadorPares++; // aumentamos el contador de pares
            }else{
                contadorImpares++; //aumentamos el contador de impares
            }
        }

        pares = new int[contadorPares];// asignamos el tamaño al arreglo pares según el contador
        impares = new int[contadorImpares];// asignamos el tamaño al arreglo impares según el contador

        // for para llenar los arreglos
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){// preguntamos si el número en la posición i tiene resto 0
                pares[auxPares] = numeros[i]; //Asignamos el valor de número en la posición i a pares en posición o
                auxPares++;// aumentamos el valor del auxiliar en 1
            }
            if (numeros[i] % 2 != 0){
                impares[auxImpares] = numeros[i];//Asignamos el valor de número en la posición i a impares en posición o
                auxImpares++;//aumentamos el valor del auxiliar en 1
            }
        }

        // Mostramos en pantalla arreglo original
        System.out.print("Arreglo original");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }

        // Mostramos en pantalla arreglo pares
        System.out.println();
        System.out.print("Arreglo de pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(" " + pares[i]);
        }

        // Mostramos en pantalla arreglo impares
        System.out.println();
        System.out.print("Arreglo de impares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(" " + impares[i]);
        }

    }
}
