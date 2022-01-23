package com.java.seccion09_laclasesystem;

import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class OtrasFuncionesClaseSystem {
    public static void main(String[] args) {

        // usando el System.err.println, System.exit
        try {
            FileInputStream archivo = new FileInputStream("src/com/java/seccion09_laclasesystem/config2.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            System.setProperties(p);
            System.out.println(System.getProperty("mi.propiedad.personalizada"));
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.err.println("no existe el archivo" + e);
            //System.exit(1);
        }

        // ejemplo 2 System.err.println
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ingrese una fecha en el formato dd/MM/yyyy");
        String fechaIngresada = sc.next();

        try {
            Date fecha = format.parse(fechaIngresada);
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
        } catch (ParseException e) {
            System.err.println("la fecha tiene un formato incorrecto " + e.getMessage());
            System.err.println("El formato debe ser 'dd/MM/yyyy'");
            main(args); // volvemos a invocar el main
        }

        // uso de Garbage Collector
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb;
        sb = new StringBuilder(a);

        System.out.println("=========================  USANDO MÉTODO CONCAT() ================");
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 5; i++){
            sb.append(a).append(b).append("\n");
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}

