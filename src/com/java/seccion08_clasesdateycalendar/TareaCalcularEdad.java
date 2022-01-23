package com.java.seccion08_clasesdateycalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularEdad {
    public static void main(String[] args) {
        /*
        * Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo 
        * java util Date y calcular la edad de la persona de acuerdo a la fecha actual.
        * 
        * Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos más adelante, también se pueden
        *  apoyar de google que hay varios ejemplos.
        * */
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese su fecha de nacimiento en el formato yyyy-MM-dd");
        String fechaIngresada = sc.next();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = formato.parse(fechaIngresada);
            Date fechaActual = new Date();
            formato = new SimpleDateFormat("yyyyMMdd");

            int desde = Integer.parseInt(formato.format(fechaNacimiento));
            int hasta = Integer.parseInt(formato.format(fechaActual));
            int edad = (hasta - desde) / 10000;
            System.out.println(" su edad es = " + edad + " años.");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
