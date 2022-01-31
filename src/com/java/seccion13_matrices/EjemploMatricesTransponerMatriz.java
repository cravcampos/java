package com.java.seccion13_matrices;

public class EjemploMatricesTransponerMatriz {
    public static void main(String[] args) {

        // Creamos nuestras matrices
        int[][] a,b;
        a = new int[8][4];
        b = new int[4][8];

        // Llenamos la primera matriz
        System.out.println("Matriz original");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Llenamos la segunda matriz
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        // mostramos la segunda matriz
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
