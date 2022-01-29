package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionOrdenado {
    public static void main(String[] args) {

        /*
         * Crear una arreglo de 10 posiciones
         * Pedir 10 numeros por consola
         * Pedir agregar un nuevo elemento
         * ejemplo de entrada 1 2 3 4 5 7 8 9 10 en el arreglo
         * nuevo elemento 6
         * Ejemplo de resultado 1 2 3 4 5 6 7 8 9 10
         * debe quedar ordenado según su valor
         * y desplazar los demás elementos una posición si es necesario
         * */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; // creamos nuestro arreglo
        int numero, posicion, ultimo;
        // pedimos en consola los valores del arreglo - el último que se reservara para el nuevo valor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero en la posición: " + (i+1) + " ");
            numeros[i] = sc.nextInt();
        }

        // solicitamos el nuevo valor
        System.out.println(" Nuevo numero a insertar  ");
        numero = sc.nextInt();

        ultimo = numeros[numeros.length-1]; // respaldamos el último elemento en una variable
        posicion = 0;

        // mientras posición sea menor a 9 y número sea mayor a, el que está en la posición del arreglo aumentamos posición
        // Esto para saber en qué posición lo debemos ubicar
        while(posicion < 9 && numero > numeros[posicion]){
            posicion++;
        }

        // recorremos el arreglo al contrario asignando los valores y correros los demás de posición
        for (int i = numeros.length - 2; i >= posicion; i--) {
            numeros[i+1] = numeros[i];
        }

        // Creamos un nuevo arreglo del tamaño del primer arreglo más 1
        int[] numeros2 = new int [numeros.length+1];

        // copiamos el arreglo anterior al nuevo arreglo
        System.arraycopy(numeros,0,numeros2,0,numeros.length);

        // si el número ingresado es mayor que el último del arreglo
        if (numero > ultimo){
            numeros2[numeros2.length-1] = numero; // Asignamos el número nuevo al final
        }else{
            numeros2[numeros2.length-1] = ultimo; // Asignamos el último a la ultima posicion del nuevo arreglo
            numeros2[posicion]= numero; //asignamos el nuevo elemento a la posicion indicada por el usuario

        }
        // Imprimimos el arreglo
        System.out.println("El arreglo final es: ");
        for (int j : numeros2) {
            System.out.print(j + " ");
        }
    }
}
