package com.java.seccion02_variables;

import javax.swing.*;

public class UsandoVentanas {
    public static void main(String[] args) {
        /* Pedir e imprimir los datos en una ventana JOptionPane*/

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroIngresado = 0;
        try{
            numeroIngresado = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe Ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String mensaje = "El numero binario de "  + numeroIngresado + " es " + Integer.toBinaryString(numeroIngresado);
        mensaje += "\nEl numero octal de " + numeroIngresado + " es " + Integer.toOctalString(numeroIngresado);
        mensaje += "\nEl numero hexadecimal de " + numeroIngresado + " es " + Integer.toHexString(numeroIngresado);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
