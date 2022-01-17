package com.java.seccion04_operadores;

import java.util.Scanner;

public class EjemploLoginArreglos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "victor";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "yohana";
        passwords[2] = "juanito";

        System.out.println("Ingrese el username");
        String u = sc.nextLine();

        System.out.println("Ingrese el password");
        String p = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado){
            System.out.println("Bienvenido ".concat(u).concat("!"));
        }else{
            System.out.println("Username o password incorrecta");
            System.out.println("Lo siento requiere autenticación ");
        }
    }
}
