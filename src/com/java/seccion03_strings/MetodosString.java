package com.java.seccion03_strings;

public class MetodosString {
    public static void main(String[] args) {
        String nombre = "Victor";

        //Saber el tamaño de un string
        // .length()
        System.out.println("nombre.length() = " + nombre.length());
        
        //Pasar a mayúsculas
        // .toUpperCase()
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        
        //Pasar a minúsculas
        // .toLowerCase()
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        
        //comparar a nivel de valor no de instancia
        // .equals(String b)
        System.out.println("nombre.equals(\"Victor\") = " + nombre.equals("Victor"));

        //si coloco una en minúscula ya no es igual lo mismo pasa con los acentos
        // .equals(String b)
        System.out.println("nombre.equals(\"victor\") = " + nombre.equals("victor"));

        //comparar sin importar mayúsculas, minúsculas y acentos,
        // .equalsIgnoreCase(String b)
        System.out.println("nombre.equalsIgnoreCase(\"victor\") = " + nombre.equalsIgnoreCase("victor"));

        //Comparar caracteres a nivel lexicográfico es decir compara según la posición de cada palabra con el
        // abecedario Unicode si el valor retornado es 0 cero son idénticas si retorna 1 son diferentes
        // .compareTo(String b)
        System.out.println("nombre.compareTo(\"Victor\") = " + nombre.compareTo("Victor"));
        System.out.println("nombre.compareTo(\"Alfonso\") = " + nombre.compareTo("Alfonso"));
        
        //Obtener un caracter
        // .charAt(int posición)
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        
        //Obtener el último caracter
        // .charAt(string.length()-1)
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        
        //Obtener un fragmento del string
        // .substring(int posición)
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        
        //Obtener un fragmento del string desde hasta el último no se incluye
        // substring(inicio, fin)
        System.out.println("nombre.substring(2,5) = " + nombre.substring(2,5));

        //Remplazar un caracter por otro el primer caracter es el que queremos remplazar y el segundo
        // es el que se colocara en su lugar
        // replace(caracter que está en la palabra, caracter por el cual se va a cambiar)
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));

        //Buscar algún caracter dentro del String y retorna la posición donde encuentra la primera coincidencia
        // puede buscarse un char o un string
        // .indexOf(caracter o palabra a buscar)
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));

        //Buscar algún caracter del String y retorna la última posición donde se encuentra la coincidencia
        // puede buscarse un char o un string
        //.lastIndexOf(caracter o palabra a buscar)
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        
        //Si no se encuentra el caracter buscado retorna un número negativo puede buscarse un char o un string
        System.out.println("trabalenguas.indexOf('c') = " + trabalenguas.indexOf('c'));

        //Buscar una cadena de caracteres y retornar si se encuentra con true o false no sirve para char
        //.contains(string a buscar)
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));

        //Saber si un String inicia con una palabra o caracter especifico
        //.startsWith(palabra a buscar)
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        
        //Saber si una palabra termina con una palabra o caracter especifico
        //trabalenguas.endsWith(palabra a buscar)
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"tr\") = " + trabalenguas.endsWith("tr"));

        //Quitar los espacios en un string
        // .trim()
        System.out.println("     trabalenguas     ");
        System.out.println("     trabalenguas     ".trim());

    }
}
