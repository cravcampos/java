package com.java.seccion10_laclasemath;

public class EjemploClaseMath2 {
    public static void main(String[] args) {

        // Saber el e(x)
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        // Saber el logaritmo natural
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        // Saber la potencia de un número
        double potencia = Math.pow(12, 3);
        System.out.println("potencia = " + potencia);
        
        // Saber la raíz cuadrada de un número
        double raiz = Math.sqrt(9);
        System.out.println("raíz cuadrada = " + raiz);

        // pasar un ángulo de radianes a grados
        double grados = Math.toDegrees(1.58);
        System.out.println("Convertir de radianes a grados = " + grados);

        // pasar de grados a radianes
        double radianes = Math.toRadians(90);
        System.out.println("Convertir de grados a radianes =" + radianes);

        // Saber el seno de un número
        double seno = Math.sin(radianes);
        System.out.println("seno de 90 = " + seno);

        // Saber el cosceno de un número
        double coseno = Math.cos(radianes);
        System.out.println("coseno = " + coseno);

        double tangente = Math.tan(radianes);
        System.out.println("tangente = " + tangente);

        // Saber el arcoseno de un número
        double arcoseno = Math.asin(0.87);
        System.out.println("arcoseno = " + arcoseno);

        // Saber el cosceno de un número
        double arcocoseno = Math.acos(0.50);
        System.out.println("arcocoseno = " + arcocoseno);

        double arcotangente = Math.atan(1.73);
        System.out.println("arcotangente = " + arcotangente);

    }
}
