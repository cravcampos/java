package com.java.seccion10_laclasemath;

import java.util.Random;

public class EjemploJavaUtilRandom {
    public static void main(String[] args) {
        
        Random randomObj = new Random();

        // la clase random de java util nos permite crear números random en cualquiera de los tipos de datos primitivos numericos
        // a diferencia de Math.random que solo permite crear double


        // Crear un número random entre las capacidades de un int positivo o negativo
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt generado normalmente = " + randomInt);

        // Crear un número random hasta el número indicado iniciando en 0 
        randomInt = randomObj.nextInt(10);
        System.out.println("randomInt generado hasta = " + randomInt);
        
        // Crear un número random desde valor1 hasta valor2 (valor1, valor2) sin incluir el último número indicado
        randomInt = randomObj.nextInt(15,25);
        System.out.println("randomInt generado desde hasta = " + randomInt);

        //Ejemplo con un arreglo
        String[] colores = {"amarillo", "azul", "rojo", "negro", "blanco", "verde", "morado", "rosado", "naranja"};
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt generado para seleccionar el color = " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);
    }
}
