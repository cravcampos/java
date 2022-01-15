package com.java.seccion03_strings;

/*
* La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

* Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como
* argumentos de línea de comandos.

* Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter,
* pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
*  Por ejemplo para Andres debe quedar como N.es

* Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

 Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

 N.es_A.ia_E.pe
* */

import java.util.Scanner;

public class TareaProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el primer nombre");
        String nom1 = sc.nextLine();
        System.out.println("Ingrese el primer nombre");
        String nom2 = sc.nextLine();
        System.out.println("Ingrese el primer nombre");
        String nom3 = sc.nextLine();

        String mayus1 = nom1.toUpperCase();
        String mayus2 = nom2.toUpperCase();
        String mayus3 = nom3.toUpperCase();

        String mensaje = mayus1.charAt(1) + "." + nom1.charAt(nom1.length()-2) + nom1.charAt(nom1.length()-1) + "_";
        mensaje += mayus2.charAt(1) + "." + nom2.charAt(nom2.length()-2) + nom2.charAt(nom2.length()-1) + "_";
        mensaje += mayus3.charAt(1) + "." + nom3.charAt(nom3.length()-2) + nom3.charAt(nom3.length()-1);

        System.out.println(mensaje);

    }
}
