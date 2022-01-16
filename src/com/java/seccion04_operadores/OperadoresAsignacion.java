package com.java.seccion04_operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        // Asignación operador =
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //operadores combinados +=, -=, *=, /=, %=

        //sumando operador +=
        i += 2; // i = i + 2
        System.out.println("i = " + i);
        i += 5; // i = i + 5
        System.out.println("i = " + i);

        // restando operador -=
        j -= 4; // j = j - 4
        System.out.println("j = " + j);

        // multiplicando operador *=
        j *= 3; // j = j * 3
        System.out.println("j = " + j);

        // dividiendo operador /=
        i /= 3; // j = j / 3
        System.out.println("i = " + i);

        // modulo operador %=
        i %= 3; // i = i % 4
        System.out.println("i = " + i);

        // concatenando operador +=
        String sqlString = "select * from clientes as c ";
        sqlString += "where c.nombre='Victor' ";
        sqlString += "and c.activo=1";
        System.out.println("sqlString = " + sqlString);

    }
}
