package com.java.seccion05_sentencias_de_control;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 1.2f;
        if(promedio >= 6.5){
            System.out.println("Felicitaciones Excelente promedio!");
        }else if(promedio >= 6.0 ){
            System.out.println("Muy buen promedio!");
        }else if(promedio >= 5.5){
            System.out.println("Buen promedio!");
        }else if(promedio >= 5.0){
            System.out.println("Regular, necesitas esforzarte un poco más!");
        }else if(promedio >= 4.0){
            System.out.println("Insuficiente, necesitar estudiar más!");
        }else{
            System.out.println("Reprobado");
        }

        System.out.println("Tu promedio es " + promedio);
    }
}
