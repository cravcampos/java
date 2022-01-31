package com.java.seccion13_matrices;

public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {

        // Creamos la matriz si en número de columnas
        int [][] matriz = new int[3][];

        // Asignamos un numero de columnas variable a nuestra matiz
        matriz[0] = new int [2];
        matriz[1] = new int [3];
        matriz[2] = new int [4];

        // Averiguamos el número de filas de la matriz
        System.out.println("Matriz tamaño filas: " + matriz.length);

        // Averiguamos el número de columnas de la fila 0
        System.out.println("Fila 0 cantidad columnas: " + matriz[0].length);

        // Averiguamos el número de columnas de la fila 1
        System.out.println("Fila 1 cantidad columnas: " + matriz[1].length);

        // Averiguamos el número de columnas de la fila 2
        System.out.println("Fila 2 cantidad columnas: " + matriz[2].length);

        // Llenamos nuestra matriz de forma automática
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
            }
        }

        // Mostramos nuestra matriz en consola
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
