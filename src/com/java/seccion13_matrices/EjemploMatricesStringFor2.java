package com.java.seccion13_matrices;

public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        // Creamos nuestra matriz conociendo los datos de la misma y las filas y columnas
        String[][] nombres = {{"Jose", "Maria"}, {"Juan", "Yohana"}, {"Victor", "Ana"}};

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
