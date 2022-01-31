package com.java.seccion13_matrices;

public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sumaFila, sumaColumna;


        // For para sumar los valores de las filas y las columnas
        for (int i = 0; i < a.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < a[i].length; j++) {
               sumaFila += a[i][j];
               sumaColumna += a[j][i];
            }
            System.out.println("total fila " + i + ": " + sumaFila);
            System.out.println("total columna " + i + ": " + sumaColumna);
        }
    }
}
