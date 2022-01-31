package com.java.seccion13_matrices;

public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        // Creamos nuestra matriz
        String[][] nombres = new String[3][2];

        // Agregamos los elementos a la matriz de forma manual
        nombres[0][0] = "Jose";
        nombres[0][1] = "Maria";
        nombres[1][0] = "Juan";
        nombres[1][1] = "Yohana";
        nombres[2][0] = "Victor";
        nombres[2][1] = "Ana";

        // Recorremos la matriz utilizando un ciclo for
        System.out.println("Iterando con un for ");
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        // Recorremos la matriz utilizando un ciclo foreach
        System.out.println("Iterando con un foreach ");
        for (String[] fila: nombres) {
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
