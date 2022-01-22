package com.java.seccion06_claseswrapper;

import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {
        String texto = "Victor Campos";

        // getClass sirve para obtener los metadatos de una clase
        Class strClass = texto.getClass();

        // obtener el nombre de la clase y sus paquetes
        System.out.println("strClass.getName() = " + strClass.getName());

        // obtener el nombre de la clase utilizada
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());

        // obtener el paquete de donde pertence la clase usasda
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        // imprimir las clase con paquetes usados
        System.out.println("strClass = " + strClass);
        
        // listar los metodos de la clase String
        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
        Integer num = 34;

        // getClass sirve para obtener los metadatos de una clase
        Class intClass = num.getClass();

        // obtener el nombre de la clase y sus paquetes
        System.out.println("intClass.getName() = " + intClass.getName());

        // obtener el nombre de la clase utilizada
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());

        // obtener el paquete de donde pertence la clase usasda
        System.out.println("intClass.getPackageName() = " + intClass.getPackageName());

        // imprimir las clase con paquetes usados
        System.out.println("intClass = " + intClass);

        // listar los metodos de la clase Integer
        for(Method metodo1: intClass.getMethods()){
            System.out.println("metodo1.getName() = " + metodo1.getName());
        }
        
        // Saber la superclase
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());
        
        // Saber los metodos de la clase object
        Class objetoClass = intClass.getSuperclass().getSuperclass();
        for (Method i: objetoClass.getMethods()) {
            System.out.println("Los métodos del objeto son: " + i.getName());
        }

    }
}
