package com.java.seccion05_sentencias_de_control;

import java.util.Scanner;

public class Tarea3Multiplicar {
    public static void main(String[] args) {
        /*
         * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
         * pero sin usar el símbolo de multiplicación (*).
         *
         * Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios,
         * donde menos por menos es positivo.
         *
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el número por el que desea multiplicar");
        int num2 = sc.nextInt();
        double resultado = 0.0;
        boolean cambio = false;
        if (num1 < 0 && num2 < 0) {
            num2 = -num2;
            num1 = -num1;
        }
        if (num2 < 0){
            cambio = true;
            num2 = -num2;
        }
        for (int i = 0; i < num2; i++) {
                resultado += num1;
        }
        if (cambio){
            System.out.println("resultado = " + -(resultado));
        }else{
            System.out.println("resultado = " + (resultado));
        }
    }
}
