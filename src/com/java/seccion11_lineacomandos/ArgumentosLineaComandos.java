package com.java.seccion11_lineacomandos;

public class ArgumentosLineaComandos {
    public static void main(String[] args) {


        // Buscamos el terminal en el ide
        // cd nombre carpeta para abrir la carpeta
        // cd.. Salir de la carpeta
        // dir listar las carpetas
        // javac nombre del archivo a compilar con extension
        // java nombre del archivo sin extensiones para compilar
        // para pasar argumentos string con ""
        // pasar varios parametros separados por ,
        // exit para salir

        if (args.length == 0){
            System.out.println("Debe ingresar argumentos");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos n° " + i + " : " + args[i] );
        }
    }
}
