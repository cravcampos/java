package com.java.seccion04_operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String... que tal!";

        Number num = 7;

        // Otra forma de crear un generico es
        //Cuando lo hacemos de forma literal como en la primera forma lo que hace el compilador de java es
        // Integer.valueOf(7) para poder asignar el valor.
        Number num1 = Integer.valueOf(7);

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        boolean b2 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b2);

        boolean b3 = texto instanceof Integer;
        System.out.println("Texto es de tipo Integer = " + b3);

        boolean b4 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b4);

        boolean b5 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b5);

        boolean b6 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b6);

        boolean b7 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b7);

        boolean b8 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b7);
    }
}
