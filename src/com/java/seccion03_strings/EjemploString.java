package com.java.seccion03_strings;

public class EjemploString {
    public static void main(String[] args) {
        
        //creando un string de forma literal es decir sin la palabra new
        String curso = "Programación Java";
        
        //creando un string como objeto
        String curso2 = new String("programación Java");

        // comparando por referencia del objeto es decir se comparan las instancias
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        //Comparando por valor del string es decir su contenido compara que sean iguales
        //incluyendo mayúsculas, minúsculas y acentos.
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        //Nos permite compara los strings independientemente de sus mayúsculas, minúsculas y acentos
        boolean esIgual1 = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual1);

        //al tenner este ejemplo no crea una nueva instancia si no hace referencia la objeto curso para no crear nuevas
        // instancias
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
