package com.java.seccion05_sentencias_de_control;

import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"victor", "aquilino", "maria", "juan", "yohana", "paula", "marcela", "milena"};
        int tam = nombres.length;

        // recorrer el arreglo normalmente
        for (int i = 0; i < tam;i++){
            System.out.println(i + " " + nombres[i]);
        }

        //recorrer el arreglo omitiendo nombres
        for (int i = 0; i < tam; i++) {
            if(nombres[i].equalsIgnoreCase("juan") ||
                nombres[i].equalsIgnoreCase("yohana")){
                continue;
            }
            System.out.println(i + "  " + nombres[i]);
        }

        // Buscar un nombre en el arreglo e imprimir los que están antes de ese nombre
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre a buscar");

        boolean encontrado = false;
        for(int i = 0; i < tam ; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null,buscar + " no existe en el sistema!");
        }
    }
}
