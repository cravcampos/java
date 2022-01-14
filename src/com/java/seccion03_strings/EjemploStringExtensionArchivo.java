package com.java.seccion03_strings;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo =  "alguna_imagen.jpeg";
        System.out.println("archivo.length() = " + archivo.length());
        int i = archivo.lastIndexOf(".");
        System.out.println("i = " + i);
        System.out.println("i = " + archivo.substring(i+1));
    }
}
