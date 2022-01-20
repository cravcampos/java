package com.java.seccion05_sentencias_de_control;

public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;

        // uso de while evalúa la condición y luego ejecuta es pre prueba
        while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while(prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        // uso de do - while primero ejecuta y después evalúa la condición es post prueba
        i = 1;
        do{
            System.out.println("i = " + i);
            i++;
        }while (i <= 10);
    }
}
