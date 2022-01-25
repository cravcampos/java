package com.java.seccion12_arreglos;

public class ReutilizandoMetodoBurbuja {

    // Creamos un método para ordenar el arreglo
    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for (int i = 0; i < total; i++){
            for (int j = 0; j < total -1 -i; j++) {
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void sortBurbujaInverso(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for (int i = 0; i < total; i++){
            for (int j = 0; j < total -1 -i; j++) {
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void recorrer(Object[] arreglo){
        int total = arreglo.length;
        for (int i = 0; i < total; i++){
            System.out.println("arreglo [" +  i  + "]"  + " = " + arreglo[i]);
        }
    }

    public static void main(String[] args) {

        // Declaramos el arreglo de tipo objeto con integer
        Integer[] numeros = {10, 58, 25, 41, 35, 65, 87, 97, 14, 23, 32, 98, -10,  18, -500};
        String[] nombres = {"Victor", "Yohana", "Juan", "Maria", "Aquilino", "Isabel", "Tatiana", "Maicol", "Ana", "Paula", "Sofia"};
        int total = numeros.length;

        //Ordenamos el arreglo ded números de tipo Integer
        sortBurbuja(numeros);

        // Recorremos y mostramos el arreglo números
        recorrer(numeros);
        System.out.println("Arreglo original nombres");

        // Recorremos y mostramos el arreglo nombres
        recorrer(nombres);

        // Ordenamos el arreglo de nombres
        sortBurbuja(nombres);

        System.out.println("Arreglo nombres ordenado ascendentemente");
        // Recorremos y mostramos el arreglo nombres
        recorrer(nombres);

        // ordenamos el arreglo de forma inversa
        sortBurbujaInverso(nombres);
        System.out.println("Arreglo nombres ordenado descendentemente");
        // Recorremos y mostramos el arreglo nombres
        recorrer(nombres);
    }
}
