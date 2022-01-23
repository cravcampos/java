package com.java.seccion08_clasesdateycalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // formato o patron que se va a usar para recibir los datos
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ingrese una fecha en el formato dd/MM/yyyy");
        String fechaIngresada = sc.next();

        try {
            // fecha que ingresa el usuario
            Date fecha = format.parse(fechaIngresada);
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
