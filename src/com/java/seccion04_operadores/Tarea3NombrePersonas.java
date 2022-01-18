package com.java.seccion04_operadores;

import javax.swing.*;

public class Tarea3NombrePersonas {
    public static void main(String[] args) {
        /*
        * Obtener el nombre más largo de tres personas, según los siguientes requerimientos:

        * Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia
        * o amigos usando la clase JOptionPane y método showInputDialog().

        * Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
        * (Imprimir solo uno de los tres, el de más caracteres en el nombre.)

        * Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
        * y con el índice cero accedemos al nombre de la persona.

        * Restricción no usar loops en el desarrollo de la tarea.

        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
        */

        String nom1 = JOptionPane.showInputDialog(null,"Ingrese su nombre completo");
        String nom2 = JOptionPane.showInputDialog(null,"Ingrese su nombre completo");
        String nom3 = JOptionPane.showInputDialog(null,"Ingrese su nombre completo");
        String nomLargo = (nom1.split(" ")[0].length() > nom2.split(" ")[0].length()) ? nom1 : nom2;
        nomLargo = (nomLargo.split(" ")[0].length() > nom3.split(" ")[0].length()) ? nomLargo : nom3;

        System.out.println("El nombre mas largo ingresado es = " + nomLargo);
    }
}
