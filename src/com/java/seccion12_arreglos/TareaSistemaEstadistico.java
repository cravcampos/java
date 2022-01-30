package com.java.seccion12_arreglos;

import java.util.Scanner;

public class TareaSistemaEstadistico {
    public static void main(String[] args) {
        /*
        * Leer 7 números por teclado para llenar un arreglo y a continuación calcular:
        * el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.
        * */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int [7];
        int positivos, negativos, ceros, sumaPositivos, sumaNegativos;
        positivos = 0;
        negativos = 0;
        ceros=0;
        sumaNegativos = 0;
        sumaPositivos = 0;


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero en la posición " + (i+1) + " ");
            numeros[i]= sc.nextInt();
        }

        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
                positivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                negativos++;
            } else {
                ceros++;
            }
        }

        if (positivos == 0){
            System.out.println("No se ingresaron números positivos");
        }else{
            System.out.println("El promedio de números positivos es:  " + (double) sumaPositivos/positivos);
        }

        if (negativos == 0){
            System.out.println("No se ingresaron números negativos");
        }else{
            System.out.println("El promedio de números negativos es:  " + (double)sumaNegativos/negativos);
        }

        System.out.println("El total de ceros es: " + ceros);

    }
}
