package com.java.seccion05_sentencias_de_control;

public class SentenciaFor {
    public static void main(String[] args) {

        //este ciclo for hace iteraciones hasta que sea igual a 5
        for(int i = 0;i <= 5; i++){
            System.out.println("i = " + i);
        }

        // este for hace iteraciones hasta que sea menor a 5
        for(int i = 0;i < 5; i++){
            System.out.println("i = " + i);
        }

        // imprimir los números del 10 al 1 sin incluir el cero
        for (int i = 10; i > 0; i--){
            System.out.println("i = " + i);
        }

        // imprimir los números del 10 al 0
        for (int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        // incluir dos condiciones en un for
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i  + " - " + j);
        }
        
        //imprimir números impares
        for (int i = 0; i <= 10 ; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }
        
        // imprimir numeros pares
        for (int i = 0; i <= 10 ; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
