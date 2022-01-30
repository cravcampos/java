package com.java.seccion12_arreglos;

import java.util.Random;

public class TareaNumeroAlto {
    public static void main(String[] args) {
        /*
        * Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
        * (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
        * */

        int[] numeros = new int [7];
        Random numerosRandom = new Random();
        int mayor=0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numerosRandom.nextInt(11,100);
            if (numeros[i]> mayor){
                mayor = numeros[i];
            }
        }

        System.out.println("numeros generados automáticamente del 11 al 99");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] +" ");
        }
        System.out.println();
        System.out.println("El numero mayor del arreglo es: " + mayor);
    }
}
