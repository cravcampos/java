package com.java.seccion02_variables;

public class PrimitivosBooleanos {
    public static void main(String[] args) {
        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;//98.76543
        float f = 1.2345e2f;//123.45

        datoLogico = f > d;
        System.out.println("datoLogico = " + datoLogico);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        boolean esIgual = (3 - 3 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
