package com.java.seccion04_operadores;

import java.util.Scanner;

public class EjemploLoginOperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = {"victor","admin","yohana"};
        String[] passwords = {"123", "1234", "12345"};

        System.out.println("Ingrese el username");
        String u = sc.nextLine();

        System.out.println("Ingrese el password");
        String p = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
        }

        String mensaje = esAutenticado ? "Bienvenido ".concat(u).concat("!") :
                "Username o password incorrecta \nLo sentimos requiere autenticación ";
        System.out.println(mensaje);
    }
}
