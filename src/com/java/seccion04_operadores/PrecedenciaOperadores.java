package com.java.seccion04_operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        // La precedencia de los operadores habla sobre la importancia o el nivel de jerarquía que tiene
        // cada operador a la hora de realizar operaciones o simplemente comparar
        
        int i = 14;
        int j = 8;
        int k = 20;
        
        // En este caso se realiza primero la división seria como decir i + j + (k / 3)
        // En este caso le da prioridad a la división
        double promedio = i + j + k / 3d;
        System.out.println("promedio = " + promedio);
        
        // Para solucionar este error y que nos da el promedio como es, debemos colocar la suma entre paréntesis
        //  para que la realice de primeras
        // En este caso le da prioridad a los ()
        double promedio1 = (i + j + k) / 3d;
        System.out.println("promedio1 = " + promedio1);

        // En este ejemplo realizará la operación que encuentre primero según el orden de izquierda a derecha
        double promedio2 = i + j + k / 3d * 10;
        System.out.println("promedio2 = " + promedio2);
        
        // Si cambiamos de posición los paréntesis en la expresión nos cambiara el resultado
        double promedio3 = i + j + k / (3d * 10);
        System.out.println("promedio3 = " + promedio3);
        double promedio4 = (i + j + k) / 3d * 10;
        System.out.println("promedio4 = " + promedio4);
        double promedio5 = ((i + j +k) / 3d) * 10;
        System.out.println("promedio5 = " + promedio5);
        
        //Usando post y pre incremento siempre van a tener una prioridad mayor
        // en este caso se soluciona de la siguiente manera incrementa a i en 1 a jota la deja igual a k le resta 1
        // luego divide k entre 3 luego multiplica ese resultado por 10 y luego se suma al resultado de i + j + k
        double promedio6 = ++i + j-- + --k / 3d * 10;
        System.out.println("promedio6 = " + promedio6);
        System.out.println("i = " + i);
        System.out.println("j = " + j);//este es el resultado de j después de usar el decremwnto
        System.out.println("k = " + k);
    }
}
