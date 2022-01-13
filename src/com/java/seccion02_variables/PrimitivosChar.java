package com.java.seccion02_variables;

public class PrimitivosChar {
    public static void main(String[] args) {

        //Se puede asignar directamente una letra o número
        char caracter = 'A';
        System.out.println("caracter = " + caracter);

        //Se puede asignar a través de un codÍgo UNICODE
        char unicode = '\u00A9';
        System.out.println("simbolo = " + unicode);

        //Se puede asignar directamente desde un número
        char decimal = 64;
        System.out.println("decimal = " + decimal);

        //Se puede asignar desde un simbolo directamente
        char simbolo = '®';
        System.out.println("simbolo = " + simbolo);

        System.out.println("========================================================");
        System.out.println("Tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("Valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char " + Character.MIN_VALUE);

        /*CARACTERES ESPECIALES*/

        char espacio = ' ';
        System.out.println("Forma de imprimir un espacio mediante un char");
        System.out.println("Espa" + espacio + "cio" );

        char espacioUnicode = '\u0020';
        System.out.println("Forma de imprimir un espacio mediante un char");
        System.out.println("Ejem" + espacioUnicode + "plo");

        char retroceso ='\b';
        System.out.println("Forma de imprimir un retroceso mediante un char");
        System.out.println("retroceso" + retroceso );

        char tabulador = '\t';
        System.out.println(tabulador + "Tabulador");

        char nuevaLinea = '\n';
        System.out.println("Imprimir" + nuevaLinea + "con una nueva linea");

        char retornoCarro = '\r';
        System.out.println("Imprimir" + retornoCarro + "con retorno carro");

        char diagonalInvertida = '\\';
        System.out.println("Permite imprimir una diagonal invertida " + diagonalInvertida);

        char comillas = '\"';
        System.out.println(comillas + "imprimir unas comillas" + comillas);

        char comillaSimple = '\'';
        System.out.println(comillaSimple + "Imprimir en comillas simples" + comillaSimple);
    }
}
