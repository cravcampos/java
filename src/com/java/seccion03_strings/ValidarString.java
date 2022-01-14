package com.java.seccion03_strings;

public class ValidarString {
    public static void main(String[] args) {
        String curso = null;
        String curso1 = "";

        //Validar si es nulo
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        // Validar si es vacío con el método .length()
        boolean esVacio = curso1.length() == 0;
        System.out.println("esVacio = " + esVacio);
        if(!esVacio){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso de ".concat(curso));
        }

        //Validar si es vacio con isEmpty() verificamos si está vacío, ya que el espacio diría que tiene un caracter
        String curso2 = " ";
        boolean esVacio2 = curso2.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        if(!esVacio2){
            System.out.println(curso1.toUpperCase());
            System.out.println("Bienvenido al curso de ".concat(curso2));
        }

        //Validar si está en blanco isBlank() implementado desde la version 11 es más estricto de todos
        boolean esBlanco = curso1.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if (!esBlanco){
            System.out.println(curso1.toUpperCase());
            System.out.println("Bienvenido al curso de ".concat(curso1));
        }
    }
}
