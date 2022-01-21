package com.java.seccion05_sentencias_de_control;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Tarea4MenuOpciones {
    public static void main(String[] args) {
        /*
        * Para la tarea se requiere un menú para administrar los productos con las opciones: actualizar,
        * eliminar, crear, listar y salir.
        *
        * Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación,
        * puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un número.
        *
        * O bien!, otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces gráficas
        * de la siguiente forma:
        *
        * int opciónIndice = 0;
        *
        * los Map (o mapas) los veremos más adelante en el curso en profundidad, pero son como un arreglo
        * asociativo, asocia un nombre (o indice) a un valor también se les conoce como diccionarios para
        * almacenar datos en, base a un nombre.
        *
        * Map<String, Integer> opciones = new HashMap();
        * opciones.put("Actualizar", 1);
        * opciones.put("Eliminar", 2);
        * opciones.put("Agregar", 3);
        * opciones.put("Listar", 4);
        * opciones.put("Salir", 5);
        *
        * Object[] opArreglo = opciones.keySet().toArray();
        *
        * Object opción = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                     "Mantenedor de Productos",
                     JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        * if (opción == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
          } else {
            opciónIndice = opciones.get(opción.toString());
          }

        * Según el numero ingresado usar un if o switch para implementar cada una de las 4 operaciones
        * y 5 para salir.
        *
        * Dentro de cada sentencia o switch imprimir un texto relacionado, a la opción,
        * por ejemplo para actualizar:
        *   JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
        * o mediante System.out.println en consola:
        *   System.out.println("Usuario actualizado correctamente");
        * Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.

        * Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación
        * distinta a salir, al finalizar con dicha operación debe volver al menú para continuar con otra,
        * al finalizar con la opción salir (5) se debe mostrar el mensaje "Ház salido con éxito!",
        * y finalizar el programa.
        * */

        int opcionIndice = 0;

        do {

            Map<String, Integer> opciones = new HashMap();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario Actualizado Correctamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario Eliminado Correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario Agregado Correctamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usuario Listado Correctamente");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Ház salido con éxito!!");
                        System.exit(1);

                }
            }
        }while(opcionIndice != 5);

    }
}
