package com.java.seccion12_arreglos;

import java.util.Scanner;

public class TareaMayorOcurrencia {
    public static void main(String[] args) {
        /*
        * Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
        * Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo
        * y también imprimir la cantidad de veces que aparece en el arreglo.
        *
        * Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        * Como resultado debería imprimir lo siguiente:
        * La mayor ocurrencias es: 3
        * El elemento que más se repite es: 5
        *
        * En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
        * */
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero de 1 a 9: ");
            numeros[i] = scanner.nextInt();
        }

        int[] valores = new int[10];


        for (int i = 0; i < numeros.length; i++) {
            int cantidad = 0;
            for (int numero : numeros) {
                if (numeros[i] == numero) {
                    cantidad++;
                }
            }
            valores[i] = cantidad;
        }

        int indice = 0;
        int maximo = 0;
        for (int i = 0; i < 10; i++) {
            if (maximo < valores[i]) {
                maximo = valores[i];
                indice = i;
            }
        }

        System.out.println("La mayor ocurrencia es: " + maximo);
        System.out.println("El número que mas se repite es: " + numeros[indice]);
        System.out.println("el número " + numeros[indice] + " esta repetido " + maximo + " veces!");
    }
}