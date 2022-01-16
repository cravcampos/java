package com.java.seccion04_operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        System.out.println("=============== Pre Incremento=================");
        // pre incremento
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        System.out.println("=============== Post Incremento=================");
        i =2;
        System.out.println("i = " + i);// valor inicial de i
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // pre Decremento
        System.out.println("=============== Pre Decremento=================");
        i = 3;
        j = --i;// i = i-1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("=============== Post Decremento=================");
        i = 4;
        System.out.println("i = " + i);//valor inicial de i
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));// incrementamos a j en 1 y queda valiendo 5
        System.out.println("j = " + (j++)); // imprime j y luego le suma 1
        System.out.println("j = " + j);// valor final de j = 6
    }
}
