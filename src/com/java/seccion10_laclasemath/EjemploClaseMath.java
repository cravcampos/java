package com.java.seccion10_laclasemath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        // calcular el valor absoluto de un número no importa si es negativo o positivo solo entrega el valor absoluto
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        // saber el max entre dos números
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
        
        // Saber el mínimo de dos números
        double min = Math.min(1.2, 0.5);
        System.out.println("min = " + min);

        // redondear a un valor máximo decimal
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // redondear hacia abajo un número
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        // Redondear de forma automática
        long entero = Math.round(3.2);
        System.out.println("entero = " + entero);
        
        // Número Pi
        double pi = Math.PI;
        System.out.println("pi = " + pi);
        

        


    }
}
