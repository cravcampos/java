package com.java.seccion13_matrices;

import java.util.Scanner;

public class Tarea02_ImprimirSilla {
    public static void main(String[] args) {
        /*
        * Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula)
        * construida a base simbolo * y utilizar un espacio como espacio.
        *
        * El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a imprimir en una matriz de n x n.
        *
        * Por ejemplo para n=5 se obtiene:
        * *
        * *
        * *****
        * *   *
        * *   *
        *
        * Por ejemplo para n=6 se obtiene:
        * *
        * *
        * *
        * ******
        * *    *
        * *    *
        *
        * Por ejemplo para n=10 se obtiene:
        * *
        * *
        * *
        * *
        * *
        * **********
        * *        *
        * *        *
        * *        *
        * *        *
        *
        * Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
        * */

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la matriz");
        n = sc.nextInt();

        if (n == 0){
            System.out.println("ERROR");
            System.exit(1);
        }

        String[][] matriz = new String[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0
                    || (j == n -1 && i >= n/2)
                    || (i == n / 2 && j != 0 && j != n)){
                    matriz[i][j] = "*";
                }else{
                    matriz[i][j] = " " ;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
