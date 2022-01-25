package com.java.seccion12_arreglos;

public class OrdenamientoBurbujaOptimizado {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;
        int totalIteraciones = 0;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy A71";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook i7 32GB ram";
        productos[4] = "Macbook Air Pro";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Xiaomi MI 9T Pro";

        System.out.println("====== ARREGLO ORIGINAL ======");
        for (int i = 0; i < total; i++) {
            System.out.println("Producto " + (i+1) + " = " + productos[i]);
        }

        // Método de ordenamiento burbuja algoritmo
        for (int i = 0; i < total -1; i++) {
            for (int j = 0; j < total -1 -i; j++){
                if (productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[i] = productos[j+1];
                    productos[j+1] = auxiliar;
                }

                totalIteraciones++;
            }
        }
        System.out.println();
        System.out.println("Arreglo Ordenado");
        System.out.println("totalIteraciones = " + totalIteraciones);

        System.out.println();
        System.out.println("====== ARREGLO ORDENADO ======");
        for (int i = 0; i < total; i++) {
            System.out.println("Producto " + (i+1) + " = " + productos[i]);
        }
    }
}
