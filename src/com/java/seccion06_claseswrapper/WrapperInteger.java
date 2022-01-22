package com.java.seccion06_claseswrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        //las clases wrapper permiten darle una mayor funcionalidad a los tipos de datos primitivos

        // forma de crear un objeto de tipo Integer
        Integer intObjeto = Integer.valueOf(32768);

        // Otra forma de crear un objeto de tipo Integer
        Integer intObjeto2 = 32768;

        // forma de convertir un primitivo en wrapper
        int intPrimitivo = 610;
        Integer intObjeto3 = Integer.valueOf(intPrimitivo);
        Integer intObjeto4 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        //Convertir un objeto a un primitivo
        // forma implicita
        int num = intPrimitivo;
        System.out.println("num = " + num);
        // forma explicita
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        //Convertir de un String a un valor entero
        String valorTvLcd = "1525000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        // si pasamos de un tipo de dato diferente debemos tener cuidado con los valores que este
        // contiene ya que puede haber perdida de informacioon como en este caso.
        Short shortObjeto = intObjeto2.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);


    }
}
