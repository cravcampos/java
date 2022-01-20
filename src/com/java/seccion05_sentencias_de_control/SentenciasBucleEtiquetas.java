package com.java.seccion05_sentencias_de_control;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++){
                if (i == 2){
                    continue bucle1;
                }
                System.out.print("[i = " + i + " j = " + j + "]");
            }

        }

        System.out.println();
        System.out.println("================ USANDO ETIQUETAS EN BREAK ===============");
        bucle2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++){
                if (i == 2){
                    break bucle2;
                }
                System.out.print("[i = " + i + " j = " + j + "]");
            }
        }

        System.out.println();
        System.out.println("================ EJEMPLO DE USO ===============");

        // Una persona trabaja 8 horas diarias de lunes a viernes
        //Elabore un programa que simule esos dias para los dias sábado y domingo debe de imprimir descanso
        //de fin de semana para los otros dias debe imprimir dia de trabajo, trabajando y las horas
        //ejemplo Dia 3, trabajando a las 6 horas.

        bucle3:
        for (int i = 1; i <= 7;i++){
            int j = 1;
            while(j <= 8){
                if (i == 6 || i == 7){
                    System.out.println("Dia " + i + ": Descanso de fin de semana!");
                    continue bucle3;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + " horas. ");
                j++;
            }

        }
    }
}
