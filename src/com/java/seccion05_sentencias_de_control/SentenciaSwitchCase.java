package com.java.seccion05_sentencias_de_control;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int num = 3;
        switch(num){
            case 0:
                System.out.println("El número es cero");
                break;
            case 1:
                System.out.println("El número es uno");
                break;
            case 2:
                System.out.println("el número es dos");
                break;
            case 3:
                System.out.println("El número es tres");
                break;
            default:
                System.out.println("Número desconocido");
        }

        String nombre = "victor";

        switch (nombre){
            case "admin":
                System.out.println("Hola " + nombre + " bienvenido!");
                break;
            case "victor":
                System.out.println("Hola " + nombre + " bienvenido!");
                break;
            case "yohana":
                System.out.println("Hola " + nombre + " bienvenido!");
                break;
            default:
                System.out.println("Nombre desconocido");
        }
    }
}
