package com.java.seccion03_strings;

public class StringInmutable {
    public static void main(String[] args) {

        // la inmutabilidad se refiere a que después de declarada la variable no puede ser modificada simplemente se crea
        // una nueva instancia del objeto.
        String curso = "Programación Java";
        String alumno = "Victor Campos";

        String resultado = curso.concat(" ".concat(alumno));
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        //concatenando con una función flecha
        String resultado2 = curso.transform(c -> {
            return c + " tomado por " + alumno;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
