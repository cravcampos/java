package com.java.seccion08_clasesdateycalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        // información de la clase date en
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
        Date fecha = new Date();

        // Imprimir la fecha
        System.out.println("fecha = " + fecha);

        // Imprimir fecha formateada
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy");
        String FechaStr = dateFormat.format(fecha);
        System.out.println("FechaStr = " + FechaStr);


        // imprimir la hora con segundos y milisegundo
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("'hora:' hh:mm s S ");
        String HoraStr = dateFormat1.format(fecha);
        System.out.println("HoraStr = " + HoraStr);
    }
}
