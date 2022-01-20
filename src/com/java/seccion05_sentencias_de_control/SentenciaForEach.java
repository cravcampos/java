package com.java.seccion05_sentencias_de_control;

public class SentenciaForEach {
    public static void main(String[] args) {
        //Se utiliza en arreglos o el api de colección de java
        int [] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        for (int num: numeros) {
            System.out.println("num = " + num);
        }

        String[] nombres = {"victor", "aquilino", "maria", "juan", "yohana", "paula", "marcela", "milena"};

        for(String nom : nombres){
            System.out.println("nom = " + nom);
        }
    }
}
