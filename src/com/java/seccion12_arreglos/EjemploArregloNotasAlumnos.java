package com.java.seccion12_arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        /* Ejercicio Notas Alumnos
        * crear tres arreglos de 10 posiciones con el nombre de tres materias
        * Pedir los datos y llenar el arreglo en cada posición segun la materia
        * Sacar el promedio por materia
        * Sacar el promedio total del curso
        * Pedir por consola el número de estudiante y calcular su promedio en las tres materias
        * */

        Scanner sc = new Scanner(System.in);

        // creamos los tres arreglos
        double [] claseMatematicas , claseHistoria, claseLenguaje;
        claseMatematicas = new double[10];
        claseHistoria = new double[10];
        claseLenguaje = new double[10];
        // Creamos tres variables para guardar la suma total de las notas ingresadas
        double sumaMatematicas = 0, sumaHistoria = 0,sumaLenguaje = 0;
        // Creamos 4 variables que nos permitan almacenar los promedios de cada materia y el promedio total
        double promedioMatematicas = 0, promedioHistoria = 0, promedioLenguaje = 0, promedioTotal = 0;

        // Solicitamos las notas de los estudiantes para la clase de matemáticas
        for (int i = 0; i < claseMatematicas.length; i++) {
            System.out.println("Ingrese nota de estudiante " + (i+1) + " para asignatura matemáticas");
            claseMatematicas[i] = sc.nextDouble();
        }

        // Solicitamos las notas de los estudiantes para la clase de historia
        for (int i = 0; i < claseHistoria.length; i++) {
            System.out.println("Ingrese nota de estudiante " + (i+1) + " para asignatura historia");
            claseHistoria[i] = sc.nextDouble();
        }

        // Solicitamos las notas de los estudiantes para la clase de lenguaje
        for (int i = 0; i < claseLenguaje.length; i++) {
            System.out.println("Ingrese nota de estudiante " + (i+1) + " para asignatura lenguaje");
            claseLenguaje[i] = sc.nextDouble();
        }

        // recorremos cada arreglo y guardamos la suma total en cada variable
        for (int i = 0; i < 10; i++) {
            sumaMatematicas += claseMatematicas[i];
            sumaHistoria += claseHistoria[i];
            sumaLenguaje += claseLenguaje[i];
        }

        // Sacamos el promedio de cada materia y el promedio total
        promedioMatematicas = sumaMatematicas/claseMatematicas.length;
        promedioHistoria = sumaHistoria/claseHistoria.length;
        promedioLenguaje = sumaLenguaje/claseLenguaje.length;
        promedioTotal = (promedioMatematicas + promedioHistoria + promedioLenguaje)/3;

        // Imprimimos en consola el promedio de cada materia y el total
        System.out.println("Promedio clase Matemáticas = " + promedioMatematicas);
        System.out.println("Promedio clase Historia = " + promedioHistoria);
        System.out.println("Promedio clase Lenguaje = " + promedioLenguaje);
        System.out.println("Promedio total del curso = " + promedioTotal);

        // Pedimos por consola la posición del alumno
        System.out.println("Ingrese la posición del alumno de (0 a 9).");
        int id = sc.nextInt();
        // calculamos el promedio del alumno según su posición
        double promedioAlumno = ((claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id])/3);

        // Mostramos en consola el promedio del alumno
        System.out.println("El promedio del alumno N° " + id + " es " + promedioAlumno);

    }
}
