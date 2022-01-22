package com.java.seccion07_pasar_valor_vs_referencia;

public class PasarPorValor {
    public static void main(String[] args) {

        // Toda variable primitiva se pasa por valor y no por referencia, ya que no es un objeto
        // Esto se debe a que son inmutables crea una instancia nueva
        int i = 10;

        System.out.println("iniciamos en  main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i = " + i + " (se mantiene igual)");
    }

    public static void test(int i){
        System.out.println("iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("El nuevo valor de i = " + i);
    }
}
