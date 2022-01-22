package com.java.seccion08_clasesdateycalendar;

import java.util.Date;

public class EjemploGetTime {
    public static void main(String[] args) {
        Date fecha = new Date();


        long j = 0;
        for (int i = 0; i < 10000000 ; i++) {
            j += i;
        }

        Date fecha2 = new Date();
        System.out.println("j = " + j);

        // saber el tiempo en milisegundo que se demora en hacer 10000000
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for " + tiempoFinal + " milisegundos");
    }
}
