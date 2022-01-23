package com.java.seccion09_laclasesystem;

import java.util.Properties;

public class EjemploPropiedadesSistema {
    public static void main(String[] args) {

        // información de las claves en:
        // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

        // Saber el nombre de usuario de nuestro sistema
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // Saber el directorio de inicio del usuario
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        // saber el directorio de trabajo del usuario
        String directorio = System.getProperty("user.dir");
        System.out.println("directorio = " + directorio);
        
        // Saber el caracter separador de trazado utilizado en java.class.path
        String caracter = System.getProperty("path.separator");
        System.out.println("caracter = " + caracter);
        
        //saber la versión del sistema operativo
        String versionSO = System.getProperty("os.version");
        System.out.println("versionSO = " + versionSO);

        // Saber el nombre del sistema operativo
        String nombreSO = System.getProperty("os.name");
        System.out.println("nombreSO = " + nombreSO);
        
        // Saber la arquitectura del sistema operativo
        String arquitecturaSO = System.getProperty("os.arch");
        System.out.println("arquitecturaSO = " + arquitecturaSO);

        // saber la secuencia utilizada por el sistema operativo para separar líneas en archivos de texto da un salto de linea
        String secuenciaSO = System.getProperty("line.separator");
        System.out.println("secuenciaSO = " + secuenciaSO + "una linea nueva....");
        
        // Saber la versión de JRE
        String versionJRE = System.getProperty("java.version");
        System.out.println("versionJRE = " + versionJRE);

        // Saber URL del proveedor JRE
        String urlJRE = System.getProperty("java.vendor.url");
        System.out.println("urlJRE = " + urlJRE);

        // Saber nombre del proveedor jre
        String proveedorJRE = System.getProperty("java.vendor");
        System.out.println("proveedorJRE = " + proveedorJRE);

        // Saber directorio de instalación para Java Runtime Environment (JRE)
        String instalacion = System.getProperty("java.home");
        System.out.println("instalación = " + instalacion);

        // Saber Ruta utilizada para buscar directorios y archivos JAR que contienen archivos de clase.
        // Los elementos de la ruta de clase están separados por un carácter específico de la plataforma especificado
        // en la propiedad.path.separator
        String ruta = System.getProperty("java.class.path");
        System.out.println("ruta = " + ruta);

        // Saber Carácter que separa los componentes de una ruta de archivo. Esto es "" en UNIX y "" en Windows./\
        String separador = System.getProperty("file.separator");
        System.out.println("separador = " + separador);

        // imprimir todas las configuraciones del sistema
        Properties p = System.getProperties();
        p.list(System.out);
        
    }
}
