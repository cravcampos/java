package com.java.seccion04_operadores;

public class OperadorInstaceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String... que tal!";

        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        boolean b2 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b2);

        boolean b3 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b3);

        boolean b4 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b4);

        boolean b5 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b4);
    }
}
