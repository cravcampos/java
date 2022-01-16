package com.java.seccion04_operadores;

import javax.swing.*;

public class OperadoresAritmrticos {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        //Suma operador +
        int suma = i + j ;
        System.out.println("suma = " + suma);

        // ahi que tener cuidado, ya que si sumamos y concatenamos un string nos concatenara lo que encuentre
        // y darnos un resultado diferente
        System.out.println("i + j = " + i + j);

        // si lo colocamos al contrario sumara y luego concatenara lo que encuentre después
        System.out.println(i + j + " i + j");

        // para solucionar la primera forma debemos colocarlos entre paréntesis
        System.out.println("i + j = " + (i + j));
        
        // resta operador -
        int resta = i - j ;
        System.out.println("resta = " + resta);
        
        // multiplicación operador *
        int multi = i * j;
        System.out.println("multi = " + multi);
        
        // division operador /
        int division = i / j;
        float division2 = (float)i / j;// realizamos casting a alguno de las variables es decir pasamos de int a float el número
        System.out.println("division = " + division);
        System.out.println("division2 = " + division2);
        
        //modulo o resto operador %
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }

        
    }
}
