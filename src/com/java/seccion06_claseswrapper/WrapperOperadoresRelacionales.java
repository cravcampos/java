package com.java.seccion06_claseswrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto " + (num1 == num2));

        num2 = 1000;
       //Cuando usamos == en una clase wrapper compara por la instancia
        // a diferencia de los primitivos que comparan por valor
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // comparando por instancia sirve cuando los numeros son de 127 y en el ==
        System.out.println("Son el mismo objeto " + (num1 == num2));

        //comparando por valor
        System.out.println("Tienen el mismo valor " + (num1.equals(num2)));
        System.out.println("Tienen el mismo valor " + (num1.intValue() == num2.intValue()));

        // cuando usamos otro operador relacional automaticamnte el compilador hace unboxing de los valores
        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
