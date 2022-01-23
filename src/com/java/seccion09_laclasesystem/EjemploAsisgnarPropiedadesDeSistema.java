package com.java.seccion09_laclasesystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsisgnarPropiedadesDeSistema {
    public static void main(String[] args) {

        // debemos crear un archivo properties
        try {
            // Pasamos la ruta del archivo properties
            FileInputStream archivo = new FileInputStream("src/com/java/seccion09_laclasesystem/config.properties");
            Properties p = new Properties(System.getProperties());
            // cargamos nuestras properties personalizadas a el archivo properties
            p.load(archivo);
            // creamos otra propiedad personalizada sin necesida del archico properties
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            // Agregar las propiedades personalizadas a las del sistema
            System.setProperties(p);
            // obtener una propiedad personalizada
            System.out.println(System.getProperty("mi.propiedad.personalizada"));

            // obtener la lista de propiedades personalizadas y del sistema
            System.getProperties().list(System.out);

        } catch (Exception e) {
            System.out.println("no existe el archivo" + e);
        }
    }
}
