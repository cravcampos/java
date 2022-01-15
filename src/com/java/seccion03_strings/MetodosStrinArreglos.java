package com.java.seccion03_strings;

public class MetodosStrinArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        //length() como método de la clase string
        System.out.println("trabalenguas.length() = " + trabalenguas.length());

        //Usando toCharArray()
        char[] arreglo = trabalenguas.toCharArray();
        //length como atributo de un arreglo no lleva paréntesis
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        //recorremos el arreglo creado con un ciclo for
        for (int i = 0; i < largo; i++) {
            System.out.println( "arreglo " + "[" + i + "] = " + arreglo[i]);
        }

        //método split(patron) sirve para convertir en un arreglo pasando una expresión regular
        // divide el string según un patron y el resultado se lleva a elementos de un arreglo
        //Retorna un arreglo de tipo string
        System.out.println("]==============  USANDO SPLIT()  ==================================");
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;
        for (int k = 0; k < l; k++) {
            System.out.println(archivoArr[k]);
        }

        //averiguar extension de un archivo
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
