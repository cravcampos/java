package com.java.seccion03_strings;

public class ConcatenandoStrings {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String alumno = "Victor Campos ";

        // concatenando con el operador de suma
        String detalle = curso + " curso tomado por " + alumno;
        System.out.println(detalle);

        // en caso de que tengamos un string y números siempre los va a unir asume que siempre empieza de izquierda
        // a derecha

        int numeroA = 6;
        int numeroB = 10;

        System.out.println(detalle + numeroA + numeroB);

        // al utilizar los paréntesis suma los números, ya que para java los paréntesis se deben solucionar primero.
        System.out.println(detalle + (numeroA + numeroB));

        // si realizamos al contrario la impresión sumara los números sin necesidad de meterlos a entre paréntesis
        // y los unirá con el string.
        System.out.println(numeroA +numeroB + detalle);

        // concatenando con el método concat()
        String  detalle2 = curso.concat(alumno);
        System.out.println(detalle2);

        // concatenando con el método concat() anidado
        String detalle3 = curso.concat(" curso tomado por ".concat(alumno));
        System.out.println(detalle3);

    }
}
