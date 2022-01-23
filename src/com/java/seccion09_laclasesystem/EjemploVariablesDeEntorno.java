package com.java.seccion09_laclasesystem;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        // Obtener variables de ambiente del sistema operativo
        Map<String, String> varEnv = System.getenv();
        System.out.println(" Variable de ambiente del sistema " + varEnv);

        // Obtener una sola variable de ambiente del sistema operativo
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        // otra forma de obtener una variable de ambiente se debe tener cuidado en este método,
        // ya que se debe pasar en el get la variable como aparece en el map obtenido al inicio.
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        // recorrer con un for e imprimir las variables del sistema
        System.out.println("----------- Listando variables del sistema ----------");
        for (String key: varEnv.keySet()) {
            System.out.println(key + " => "  + varEnv.get(key));
        }
    }
}
