package com.java.seccion06_claseswrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primitivoBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primitivoBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        // a diferencia de las clases wrapper numericas en las clases wrapper booleanas
        // podemos comparar con == y con equals()
        System.out.println("Comparando dos objetos boolean " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparando dos objetos boolean " + (objetoBoolean.equals(objetoBoolean2) ));
        System.out.println("Comparando dos objetos boolean " + (objetoBoolean == objetoBoolean3));
        System.out.println("Comparando dos objetos boolean " + (objetoBoolean3.equals(objetoBoolean) ));

        // convertir de tipo primitivo a clase wrapper
        boolean primitivoBollean2 = objetoBoolean2.booleanValue();
        System.out.println("primitivoBollean2 forma explicita = " + primitivoBollean2);

    }
}
