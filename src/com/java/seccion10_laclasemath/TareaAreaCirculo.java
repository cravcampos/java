package com.java.seccion10_laclasemath;

import java.util.Scanner;

public class TareaAreaCirculo {
    public static void main(String[] args) {

        /*
        * Pedir el radio de un círculo y calcular su área.
        * Utilizar la formula:
        *
        * area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
        *
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo");
        double radio = sc.nextDouble();
        double pi = Math.PI;
        double area;

        area = pi * (Math.pow(radio,2));
        System.out.println("El area de una circunferencia con radio de " + radio + " es " + area);

    }
}
