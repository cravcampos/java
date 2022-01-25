package com.java.seccion12_arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {

        // crear arreglo
        int[] numeros = new int [4];

        // asignar valores a el arreglo según su índice
        numeros[0] = 10;
        numeros[1] = 9;
        numeros[2] = 8;
        numeros[3] = 7;

        //asignar valores del arreglo a una variable según su índice
        int num1 = numeros[0];
        int num2 = numeros[1];
        int num3 = numeros[2];
        int num4 = numeros[3];

        // Mostrar los datos del arreglo según su variable asignada
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // Mostar los datos del arreglo según su índice
        System.out.println("números[0] = " + numeros[0]);
        System.out.println("números[1] = " + numeros[1]);
        System.out.println("números[2] = " + numeros[2]);
        System.out.println("números[3] = " + numeros[3]);
        
        // obtener el ultimo elemento de un arrglo
        int ultimo = numeros[numeros.length -1];
        System.out.println("ultimo = " + ultimo);
    }
}
