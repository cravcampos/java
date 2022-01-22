package com.java.seccion07_pasar_valor_vs_referencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        // al pasar por referencia mantiene el cambio realizado en el método test
        int[] edad = {10, 11, 12};

        System.out.println("Inicia el método main");
        for (int i = 0; i < edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes dde llamar al método test");
        test(edad);
        System.out.println("Después de llamar al método test");
        for (int i = 0; i < edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el método main con los datos del arreglo modificados!");
    }

    public static void test(int[] edadArray){
        System.out.println("iniciamos el método test");
        for (int i = 0; i < edadArray.length;i++){
            edadArray[i] += 20;
        }
        System.out.println("Finaliza el método test");
    }
}
