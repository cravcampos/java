package com.java.seccion04_operadores;

import java.util.Scanner;

public class EjemploLoginOperadoresLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "victor";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";

        System.out.println("Ingrese el username");
        String u = sc.nextLine();

        System.out.println("Ingrese el password");
        String p = sc.nextLine();

        boolean esAutenticado = false;

        if (username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p)){
            esAutenticado = true;
        }else {
            System.out.println("Username o password incorrecta");
        }

        if (esAutenticado){
            System.out.println("Bienvenido ".concat(u).concat("!"));
        }else{
            System.out.println("Lo siento requiere autenticación ");
        }
    }
}
