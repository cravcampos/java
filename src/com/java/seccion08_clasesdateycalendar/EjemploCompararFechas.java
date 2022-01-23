package com.java.seccion08_clasesdateycalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploCompararFechas {
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

            Date fecha2 = new Date();
            System.out.println("fecha hoy = " + fecha2);

            // comparando con after , before y equals
            if (fecha.after(fecha2)) {
                System.out.println("La fecha ingresada es después que la fecha de hoy");
            } else if (fecha.before(fecha2)) {
                System.out.println("la fecha ingresada es anterior a la fecha de hoy");
            } else if (fecha.equals(fecha2)) {
                System.out.println("la fecha ingresada es igual a la fecha de hoy");
            }

            // comparando con compareTo
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("La fecha ingresada es después que la fecha de hoy");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("la fecha ingresada es anterior a la fecha de hoy");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("la fecha ingresada es igual a la fecha de hoy");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}