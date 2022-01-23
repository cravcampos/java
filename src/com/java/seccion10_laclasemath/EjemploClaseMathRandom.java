package com.java.seccion10_laclasemath;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        // crea números aleatorios entre 0 y 1 sin llegar a 1
        double random = Math.random();
        System.out.println("random = " + random );
        
        // si queremos crear números aleatorios entre 0 y 10 debemos multiplicar por el número al que queremos llegar,
        // pero este no estará incluido
        
        random *= 10;
        System.out.println("random = " + random);
        
        // si queremos que el numero sea un entero exacto debemos redondearlo de forma automática, o hacia arriba o hacia abajo
        double arriba = Math.ceil(random);
        double abajo = Math.floor(random);
        double automatico = Math.round(random);
        System.out.println("arriba = " + arriba);
        System.out.println("abajo = " + abajo);
        System.out.println("automático = " + automatico);

        // ejemplo con un arreglo de nombres
        String[] nombres = {"victor", "yohana", "juan", "maria", "aquilino", "isabel", "ana", "paula"};
        double random2 = Math.random();
        random2 *= nombres.length;
        random2 = Math.round(random2);
        System.out.println("El nombre elegido es " + nombres[(int)random2]);
        
    }
}
