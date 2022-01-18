package com.java.seccion04_operadores;

import java.util.Scanner;

public class EjemploNumeroMayorOperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;
        System.out.println("Ingrese un número");
        int num1 = sc.nextInt();

        System.out.println("Ingrese un segundo número");
        int num2 = sc.nextInt();

        System.out.println("Ingrese un tercer número");
        int num3 = sc.nextInt();

        System.out.println("Ingrese un cuarto número");
        int num4 = sc.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3 ) ? max : num3;
        max = (max > num4) ?  max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El número mayor es: " + max);
    }
}
