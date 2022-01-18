package com.java.seccion04_operadores;

import java.util.Scanner;

public class Tarea1Operadores {
    public static void main(String[] args) {
        /*
        * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
        * Podría ser utilizando operador ternario.
        */

        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String mayor = "";

        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();

        System.out.println("Ingrese otro numero");
        num2 = sc.nextInt();

        mayor = (num1 > num2) ? num1  + " y " + num2 : num2 + " y " + num1;
        System.out.println("el orden de mayor a menos es " + mayor);

    }
}
