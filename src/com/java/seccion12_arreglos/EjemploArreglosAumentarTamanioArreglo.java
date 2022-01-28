package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosAumentarTamanioArreglo {
    public static void main(String[] args) {
        /*
         * Crear una arreglo de 10 posiciones
         * Pedir 10 numeros por consola
         * Pedir agregar un nuevo elemento y la posición donde se desea asignar
         * Agregar el elemento en la posición indicada
         * y desplazar los demás elementos una posición
         * Crear un nuevo arreglo y asignar los valores del arreglo anterior más el nuevo valor
         * */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; // creamos nuestro arreglo
        int elemento, posicion, ultimo;

        // pedimos en consola los valores del arreglo - el último que se reservara para el nuevo valor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero en la posición " + (i+1));
            numeros[i] = sc.nextInt();
        }

        // solicitamos el nuevo valor
        System.out.println(" Nuevo elemento ");
        elemento = sc.nextInt();

        // pedimos la posición donde se agregara el nuevo elemento
        System.out.println("Posicion donde desea agregar el elemento de 0 a 9");
        posicion = sc.nextInt();

        ultimo = numeros[numeros.length-1];

        // recorremos el arreglo al contrario asignando los valores y correros los demás de posición
        for (int i = numeros.length - 2; i >= posicion; i--) {
            numeros[i+1] = numeros[i];
        }

        // Creamos el nuevo arreglo y aumentamos su tamaño en 1
        int [] numeros2 = new int[numeros.length+1];
        System.arraycopy(numeros,0,numeros2,0,numeros.length);

        numeros2[posicion]= elemento; //asignamos el nuevo elemento a la posicion indicada por el usuario
        numeros2[numeros2.length-1] = ultimo; // asignamos el último elemento a, el nuevo arreglo

        // Imprimimos el arreglo
        System.out.println("El arreglo final es: ");
        for (int j : numeros2) {
            System.out.print(j + " ");
        }
    }

}
