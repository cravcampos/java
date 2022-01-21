package com.java.seccion05_sentencias_de_control;

import java.util.Scanner;

public class Tarea2NotasPromedio {
    public static void main(String[] args) {

        /*
         * Pedir 20 notas finales de alumnos en una escala de 1 a 5, manejar decimales en las notas (double).
         * Mostrar el promedio de las notas mayores a 4, promedio de notas inferiores a 4 y la cantidad de notas 1,
         * además mostrar el promedio total.
         *
         * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para
         * realizar los cálculos (contadores, sumas).
         *
         * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error
         * finalizando el programa.
         *
         * */
        Scanner sc = new Scanner(System.in);
        double nota;
        double cantidadUno = 0.0;
        int largoNotaCuatro = 0;
        int largoNotaMenorCuatro = 0;
        double notaMayorACuatro = 0.0;
        double notaMenorACuatro = 0.0;
        double promedioNotaCuatro = 0.0;
        double promedioNotaMenorCuatro = 0.0;
        double promedioTotal = 0.0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingrese la nota " + i);
            nota = sc.nextDouble();
            if (nota == 0) {
                System.out.println("Error no puedes digitar notas cero");
                System.exit(1);
            }

            if (nota == 1) {
                cantidadUno++;
            } else {
                if (nota < 4) {
                    largoNotaMenorCuatro++;
                    notaMenorACuatro += nota;
                } else if (nota > 4) {
                    largoNotaCuatro++;
                    notaMayorACuatro += nota;
                }
                promedioTotal += nota;
            }

        }

        System.out.println("El numero total de unos es " + cantidadUno);
        if (largoNotaCuatro == 0){
            System.out.println("No ha ingresado notas mayores a cuatro");
        }else{
            promedioNotaCuatro = notaMayorACuatro / largoNotaCuatro;
            System.out.println("El promedio de notas mayores a cuatro es " + promedioNotaCuatro);
        }

        if (largoNotaMenorCuatro == 0){
            System.out.println("No ha ingresado notas menores a cuatro");
        }else{
            promedioNotaMenorCuatro = notaMenorACuatro / largoNotaMenorCuatro;
            System.out.println("El promedio de notas menores a cuatro es " + promedioNotaMenorCuatro);
        }

        double promedio = promedioTotal / 20;
        System.out.println("el promedio total es " + promedio);
    }
}
