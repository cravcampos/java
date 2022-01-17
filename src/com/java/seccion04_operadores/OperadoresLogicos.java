package com.java.seccion04_operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // operador and && todas tienen que ser true para que la expresión sea verdadera
        boolean b1 = i == j && k > l ;
        System.out.println("b1 = " + b1);
        
        // operador or || cualquiera debe ser true para que la expresión sea verdadera
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);

        // si lo colocamos entre () va a darle prioridad a los () y nos retornara false
        // porque hará primero la operación dentro de los ()

        boolean b4 = i == j && (k > l || m == false);
        System.out.println("b4 = " + b4);


    }
}
