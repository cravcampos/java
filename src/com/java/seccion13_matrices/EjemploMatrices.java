package com.java.seccion13_matrices;

public class EjemploMatrices {
    public static void main(String[] args) {

        // crear una matriz
        int[][] numeros = new int [2][4];

        // llenar datos de la matriz manualmente
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;
        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        // saber el número de filas de la matriz
        System.out.println("Número de filas = " + numeros.length);

        // saber el número de columnas de la matriz
        System.out.println("Número de columnas = " + numeros[0].length);

        // Obtener el primer elemento de la matriz
        System.out.println("Primer elemento de la matriz = " + numeros[0][0]);

        // Obtener el último elemento de la matriz
        System.out.println("Ultimo elemento de la matriz = " + numeros[numeros.length-1][numeros[1].length-1]);

        // Asignar los elementos de la matriz a varibales del mismo tipo de la matriz
        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        // Imprimir los elementos de la matriz a través de sus variables
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
    }
}
