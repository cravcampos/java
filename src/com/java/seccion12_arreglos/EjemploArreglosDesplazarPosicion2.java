package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        /*
        * Crear una arreglo de 10 posiciones
        * Pedir 10 numeros por consola
        * Pedir agregar un nuevo elemento y la posición donde se desea agregar
        * Agregar el elemento en la posción indicada
        * y desplazar los demás elementos una posición
        * ejemplo de entrada 1 2 3 4 5 6 7 8 9
        * Ejemplo de resultado 1 2 3 4 5 10  6 7 8 9
        * */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; // creamos nuestro arreglo
        int elemento, posicion;

        // pedimos en consola los valores del arreglo - el último que se reservara para el nuevo valor
        for (int i = 0; i < numeros.length-1; i++) {
            System.out.println("Ingrese el numero en la posición " + (i+1));
            numeros[i] = sc.nextInt();
        }

        // solicitamos el nuevo valor
        System.out.println(" Nuevo elemento ");
        elemento = sc.nextInt();

        // pedimos la posición donde se agregara el nuevo elemento
        System.out.println("Posicion donde desea agregar el elemento de 0 a 9");
        posicion = sc.nextInt();

        // recorremos el arreglo al contrario asignando los valores y correros los demás de posición
        for (int i = numeros.length - 2; i >= posicion; i--) {
            numeros[i+1] = numeros[i];
        }
        numeros[posicion]= elemento; //asignamos el nuevo elemento a la posicion indicada por el usuario

        // Imprimimos el arreglo
        System.out.println("El arreglo final es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
