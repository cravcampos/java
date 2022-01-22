package com.java.seccion07_pasar_valor_vs_referencia;
class Persona {
    private String nombre;

    public void modificaNombre ( String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String leerNombre() {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        // al pasar por referencia mantiene el cambio realizado en el método test
        Persona persona = new Persona();
        persona.modificaNombre("Victor");

        System.out.println("Inicia el método main");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("Antes dde llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos de la persona modificados!");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el método test");
        persona.modificaNombre("Yohana");
        System.out.println("Finaliza el método test");
    }
}

