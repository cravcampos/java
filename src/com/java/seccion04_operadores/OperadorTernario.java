package com.java.seccion04_operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // operador ternario es una forma abreviada del if/else
        // variable = condición ? si es verdadero : si es falso;

        String variable = 7 == 5 ? "Es verdadero" : "es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese la nota de matemáticas entre 0.0 - 5.0");
        matematicas = sc.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 0.0 - 5.0");
        ciencias = sc.nextDouble();

        System.out.println("Ingrese la nota de historia entre 0.0 - 5.0");
        historia = sc.nextDouble();

        promedio = (matematicas + ciencias +historia) / 3;

        System.out.println("promedio = " + promedio);

        estado = promedio >= 3.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        // esto sería lo mismo que está en el operador ternario
        /*
        if (promedio >= 5.49){
            estado = "Aprobado";
        }else{
            estado = "Rechazado";
        }
        */


    }
}
