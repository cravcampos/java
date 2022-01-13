package com.java.seccion02_variables;

public class PrimitivosDecimales {
    public static void main(String[] args) {
        /*PRIMITIVOS
         * DOBLES O FLOTANTES
         * */
        //float
        float realFloat = 2021f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Otra forma de declarar un float es mediante notación científica");
        float realFloat1 = 2.12e3f;
        System.out.println("realFloat1 = " + realFloat1);
        System.out.println("Cuando el valor es negativo lo comprime y nos muestra el valor en notación científica");
        float realFloat2 = 0.0000000000212f;
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES );
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float " + Float.MIN_VALUE);
        System.out.println("==================================================================");

        //double
        double realDouble = 1030557360.0;
        System.out.println("numeroDouble = " + realDouble);
        System.out.println("Otra forma de declarar un double es mediante notación científica");
        double realDouble1 = 2.12e35f;
        System.out.println("realDouble1 = " + realDouble1);
        System.out.println("Cuando el valor es negativo lo comprime y nos muestra el valor en notación científica");
        double realDouble2 = 0.0000000000212;
        System.out.println("realDouble2 = " + realDouble2);
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES );
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double " + Double.MIN_VALUE);
    }
}
