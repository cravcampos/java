package com.java.seccion13_matrices;

import java.util.Scanner;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creamos nuestra matriz con datos pre-quemados
        int[][] matrizEnteros = {
                {32, 33, 14, 35},
                {70, 62, 51, 258},
                {1988, 1989, 1951, 1959}
        };

        // creamos variable para guardar número a buscar
        int elementoBuscar;

        // Creamos variable para el número de filas
        int filas;

        // Creamos variable para las columnas
        int columnas = 0;

        // Creamos variable para saber si encontramos o no el número a buscar
        boolean encontrado = false;

        // Obtenemos el número a buscar
        System.out.println("Ingrese número que desa buscar en la matriz");
        elementoBuscar = sc.nextInt();

        // etiqueta buscar para salir de la iteración apenas encuentre el número
        buscar:
        for (filas = 0; filas < matrizEnteros.length; filas++) {
            for (columnas = 0; columnas < matrizEnteros[filas].length; columnas++) {
                if (matrizEnteros[filas][columnas] == elementoBuscar){// si el numero en la posición es igual al ingresado
                    encontrado = true;// encontrado es true
                    break buscar;// salimos del ciclo buscar
                }
            }
        }

        // imprimimos en consola si es true
        if (encontrado){
            System.out.println("Encontrado "+ elementoBuscar + " en las coordenadas "+ filas + "," + columnas);
        }else{
            System.out.println(elementoBuscar + " No se encontró en la matriz");
        }
    }
}
