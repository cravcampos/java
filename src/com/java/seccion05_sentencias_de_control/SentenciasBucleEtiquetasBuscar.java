package com.java.seccion05_sentencias_de_control;

import java.util.Scanner;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ejemplo de como buscar una letra en una frase
        String frase = "tres tristes tigres tragan trigo en un trigal";
        int maxFrase = frase.length();
        int cantidad = 0;
        System.out.println("Digite la letra que desea buscar");
        char letra = sc.next().charAt(0) ;
        for (int i = 0; i < maxFrase; i++) {

            if (frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado " + cantidad + " veces el caracter '" + letra +"' en la frase");

        System.out.println();
        System.out.println("=========== BUSCANDO PALABRA ======================");
        //Ejemplo de como buscar una palabra en una frase
        System.out.println("Ingrese la palabra que desa buscar en la frase: ");
        System.out.println(frase);
        String palabra = sc.next();
        int maxPalabra = palabra.length();
        int cantidadPalabra = 0;
        maxFrase = frase.length() - maxPalabra;

        buscar:
        for (int i = 0; i <= maxFrase;) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                i++;
                if (frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            cantidadPalabra++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado " + cantidadPalabra + " veces la palabra '" + palabra + "' en la frase ");

    }
}
