package com.java.seccion06_claseswrapper;

public class AutoboxingYUnboxing {

    public static void main(String[] args) {

        // Ejemplo de Autoboxing en este no utilizamos ningun metoso asociado a la clase wrapper
        Integer [] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //Ejemplo de Unboxing en este debemos utilizar los metodos asociados a la clase wrapper
        Integer [] enteros2 = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int suma = 0;
        int suma2 = 0;

        // ejemplo suma de forma unboxing
        for (Integer i: enteros) {
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }

        }
        System.out.println("suma = " + suma);

        // ejemplo suma de forma autoboxing
        for (Integer i: enteros) {
            if(i % 2 == 0){
                suma2 += i;
            }
        }
        System.out.println("suma2 = " + suma2);
    }
}
