package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        /*
        *  Crear un arreglo de 10 posiciones de tipo int
        *  Pedir los datos en consola y rellenar el arreglo
        *  Pedir en consola el número a buscar.
        *  Buscar un elemento del arreglo y mostrar su índice
        * */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // for para solicitar los datos al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número en la posición " + i + " : ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese número a buscar");
        int num = sc.nextInt();
        int i = 0;

        // Mientras el iterador sea menor que el tamaño del arreglo y el valor en la posición i, del arreglo sea diferente
        // del número a buscar aumente a i
        while(i < numeros.length && numeros[i] != num){
            i++;
        }

        // si i == al tamaño del arreglo no se encontró el número
        if (i == numeros.length){
            System.out.println("Número no encontrado");
        }else if(numeros[i] == num) // si el valor de número coincide con el de la posición del arreglo mostramos su índice
            System.out.println("la posición del número buscado es = " + i);
    }
}
