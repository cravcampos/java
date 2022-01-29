package com.java.seccion12_arreglos;

import java.util.Scanner;

public class TareaMostrarArreglo {
    public static void main(String[] args) {

        /*
        * Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
        * Luego debemos mostrarlos en el siguiente orden:
        * el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero,
        * y así sucesivamente.
        * */
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // Solicitamos los datos al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese número en la posición " + (i+1) + " ");
            numeros[i] = sc.nextInt();}

        // recorremos la mitad del arreglo imprimiendo el último más el primero y luego le restamos i, para ir disminuyendo su posición también
        for (int i = 0; i < numeros.length/2; i++) {
            System.out.print( numeros[numeros.length - 1 -i] + " " +  numeros[i]  + " ");
        }
    }
}
