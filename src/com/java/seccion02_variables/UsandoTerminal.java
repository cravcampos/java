package com.java.seccion02_variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsandoTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        String numeroStr = sc.nextLine();
        int numeroIngresado = 0;
        try{
            numeroIngresado = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            System.out.println("Debe Ingresar un numero entero!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroIngresado = " + numeroIngresado);

        String resultadoBinario = "Numero binario de " + numeroIngresado + " = " + Integer.toBinaryString(numeroIngresado);

        String resultadoOctal = "Numero octal de " + numeroIngresado + " = " + Integer.toOctalString(numeroIngresado);

        String resultadoHexadecimal = "Numero hexadecimal de " + numeroIngresado + " = " + Integer.toHexString(numeroIngresado);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println(mensaje);
        System.out.println("======================================================");
        //También permite solicitar números enteros, flotantes y diferentes tipos de datos solo debemos colocar el
        // nextInt(), nextFloat() esto depende del tipo de dato que deseemos pedir.

        System.out.println("Ingrese un numero entero");
        int numeroIngresa = 0;

        try{
            numeroIngresa = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Debe Ingresar un numero entero!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroIngresa = " + numeroIngresa);

        String resultBinary = "Numero binario de " + numeroIngresa + " = " + Integer.toBinaryString(numeroIngresa);

        String resultOctal = "Numero octal de " + numeroIngresa + " = " + Integer.toOctalString(numeroIngresa);

        String resultHex = "Numero hexadecimal de " + numeroIngresa + " = " + Integer.toHexString(numeroIngresa);

        String mensaje1 = resultBinary;
        mensaje1 += "\n" + resultOctal;
        mensaje1 += "\n" + resultHex;

        System.out.println(mensaje1);
    }
}
