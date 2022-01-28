package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        /*
        * Crear un arreglo de 10 posiciones
        * Llenar el arreglo con datos por consola
        * Solicitar posición a eliminar.
        * Eliminar el valor en la posición indicada
        * Copiar el arreglo en un nuevo arreglo
        * Imprimir el nuevo arreglo
        * */

        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];
        int posicion;

        // Llenamos los datos del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número en la posición " + (i+1) + " ") ;
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        // Solicitamos posición a eliminar
        System.out.println("Ingrese posicion para eliminar entre 0 y 9");
        posicion = sc.nextInt();

        // recorremos el arreglo y desplazamos hacia arriba los elementos después de eliminar la posicion indicada
        for (int i = posicion; i < numeros.length-1;i++){
            numeros[i] = numeros[i+1];
        }

        // Creamos el nuevo arreglo
        int[] numeros2 = new int[numeros.length-1];

        // Copiamos el arreglo anterior en el nuevo menos la última posición que se repite
        System.arraycopy(numeros,0,numeros2,0,numeros2.length);

        // Imprimimos en consola el nuevo arreglo
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("indice " + i + " => " + numeros2[i]);
        }
    }
}
