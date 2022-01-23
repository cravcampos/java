package com.java.seccion08_clasesdateycalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        // crea una instancia del calendario gregoriano depende de nuestra ubicación geográfica

        Calendar calendario = Calendar.getInstance();

        // podemos colocar los datos implicitos en el set
        calendario.set(2022,5,2, 14,30,25);

        // podemos colocar los datos como constantes en el set o una variacion de ambos
        calendario.set(Calendar.YEAR,Calendar.JUNE,2);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        // asignar parte por parte las fechas los meses y dias se manejan como los arreglos iniciando desde cero
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.JUNE);
        calendario.set(Calendar.DAY_OF_MONTH, 9);
        calendario.set(Calendar.HOUR, 20);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 00);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha2 = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha2);

        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
        String fechaFormato = formato.format(fecha2);
        System.out.println("Fecha con formato = " + fechaFormato);


    }
}
