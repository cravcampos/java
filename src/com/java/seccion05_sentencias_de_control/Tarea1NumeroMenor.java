package com.java.seccion05_sentencias_de_control;

import java.util.Scanner;

public class Tarea1NumeroMenor {
    public static void main(String[] args) {
        /*
        * Crear una clase con el método main donde el desafío es buscar el número menor
        * de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de
        * números a comparar, luego utilizando una sentencia for iterar el número de veces
        * (ingresado) para pedir el número entero, entonces se requiere:
        *
        * Calcular el menor número e imprimir el valor.
        * Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
        * si no, imprimir " el número menor es igual o mayor que 10!".
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea comparar");
        int cantidad = sc.nextInt();

        if (cantidad < 10 ){
            System.out.println("Debe comparar como mínimo 10 valores");
        }else{
            int numMenor = Integer.MAX_VALUE;
            int ingresado;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el número en la posición " + (i+1));
                ingresado = sc.nextInt();
                numMenor = (ingresado < numMenor) ? ingresado : numMenor;
            }
            System.out.println("El numero menor es: " + numMenor);
            if (numMenor < 10){
                System.out.println("El número " + numMenor + " es menor que 10");
            }else{
                System.out.println("El número " + numMenor + " es mayor o igual a 10");
            }
        }
    }
}
