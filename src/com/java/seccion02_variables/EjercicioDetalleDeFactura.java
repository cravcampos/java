package com.java.seccion02_variables;

import java.util.Scanner;
/*
* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
* se requiere desarrollar un programa que reciba datos de la factura utilizando la clase
* Scanner de la siguiente manera:

* Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener
* el nombre de la factura con espacios.

* Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para
* obtener precios con decimales (,).

* Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

* Se pide mostrar en un solo String el nombre de la factura, el monto total bruto
* (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

Por ejemplo, el resultado podría ser algo así:

* La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de
* 25.6082 y el monto después de impuesto es de 160.3882

*/


public class EjercicioDetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la empresa");
        String empresa = sc.nextLine();

        System.out.println("Ingrese el precio del producto 1");
        Double producto1 = sc.nextDouble();

        System.out.println("Ingrese el precio del producto 2");
        Double producto2 = sc.nextDouble();

        double impuesto = 0.19;
        double sumaProductos = (producto1 + producto2);
        double totalImpuesto = (sumaProductos*impuesto);
        double totalPagar = sumaProductos + totalImpuesto;

        String mensaje = "La factura para la " + empresa + " tiene un total bruto de " + sumaProductos;
        mensaje += "\n" + " con un impuesto de " + totalImpuesto;
        mensaje += "\n" + " y el monto total a pagar es " + totalPagar;

        System.out.println(mensaje);
    }
}
