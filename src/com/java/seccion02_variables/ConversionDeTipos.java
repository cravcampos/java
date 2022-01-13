package com.java.seccion02_variables;

public class ConversionDeTipos {
    public static void main(String[] args) {

        //CONVERSION DE CADENAS A PRIMITIVOS
        String numeroStr = "125";

        System.out.println("=============== STRING A INT ==================================");
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("=============== STRING A BYTE  ==================================");
        byte numeroByte = Byte.parseByte(numeroStr);
        System.out.println("numeroByte = " + numeroByte);

        System.out.println("=============== STRING A SHORT  ==================================");
        short numeroShort = Short.parseShort(numeroStr);
        System.out.println("numeroShort = " + numeroShort);

        System.out.println("=============== STRING A LONG  ==================================");
        long numeroLong = Long.parseLong(numeroStr);
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("=============== STRING A DOUBLE  ==================================");
        double numeroDouble = Double.parseDouble(numeroStr);
        System.out.println("numeroDouble = " + numeroDouble);

        //otras formas soportadas en números reales
        String numeroStr1 = "1030557360.000";
        double numeroDouble1 = Double.parseDouble(numeroStr1);
        System.out.println("numeroDouble1 = " + numeroDouble1);

        String numeroStr2 = "12345e-2";
        double numeroDouble2 = Double.parseDouble(numeroStr2);
        System.out.println("numeroDouble2 = " + numeroDouble2);

        System.out.println("=============== STRING A FLOAT  ==================================");
        float numeroFloat = Float.parseFloat(numeroStr);
        System.out.println("numeroFloat = " + numeroFloat);

        float numeroFloat1 = Float.parseFloat(numeroStr1);
        System.out.println("numeroFloat1 = " + numeroFloat1);

        float numeroFloat2 = Float.parseFloat(numeroStr2);
        System.out.println("numeroFloat2 = " + numeroFloat2);

        System.out.println("=============== STRING A BOOLEAN  ==================================");
        String logico = "TRUE";
        boolean datoLogico = Boolean.parseBoolean(logico);
        System.out.println("datoLogico = " + datoLogico);

        // PASAR DE PRIMITIVO A CADENA DE TEXTO
        // Existen dos formas usando String.value of() o tipodedato.toString()
        System.out.println("=============== INT A STRING ==================================");
        int numeroInt1 = 100;
        String numeroStr3 = Integer.toString(numeroInt1);
        System.out.println("numeroStr3 = " + numeroStr3);
        String numeroStr4 = String.valueOf(numeroInt);
        System.out.println("numeroStr4 = " + numeroStr4);

        System.out.println("=============== BYTE A STRING ==================================");
        byte numeroByte1 = 100;
        String numeroStr5 = Byte.toString(numeroByte1);
        System.out.println("numeroStr5 = " + numeroStr5);
        String numeroStr6 = String.valueOf(numeroByte1);
        System.out.println("numeroStr6 = " + numeroStr6);

        System.out.println("=============== SHORT A STRING ==================================");
        short numeroShort1 = 3276;
        String numeroStr7 = Short.toString(numeroShort1);
        System.out.println("numeroStr7 = " + numeroStr7);
        String numeroStr8 = String.valueOf(numeroShort1);
        System.out.println("numeroStr8 = " + numeroStr8);

        System.out.println("=============== LONG A STRING ==================================");
        long numeroLong1 = 1030557360L;
        String numeroStr9 = Long.toString(numeroLong1);
        System.out.println("numeroStr9 = " + numeroStr9);
        String numeroStr10 = String.valueOf(numeroLong1);
        System.out.println("numeroStr10 = " + numeroStr10);

        System.out.println("=============== DOUBLE A STRING ==================================");
        double numeroDouble3 = 102045689;
        String numeroStr11 = Double.toString(numeroDouble3);
        System.out.println("numeroStr11 = " + numeroStr11);
        String numeroStr12 = String.valueOf(numeroDouble3);
        System.out.println("numeroStr12 = " + numeroStr12);


        //otras formas soportadas en números reales
        double numeroDouble5 = 1030557360.000;
        String numeroStr13 = Double.toString(numeroDouble5);
        System.out.println("numeroStr13 = " + numeroStr13);
        String numeroStr14 = String.valueOf(numeroDouble5);
        System.out.println("numeroStr14 = " + numeroStr14);

        double numeroDouble6 = 12345e-2;
        String numeroStr15 = Double.toString(numeroDouble6);
        System.out.println("numeroStr15 = " + numeroStr15);
        String numeroStr16 = String.valueOf(numeroDouble6);
        System.out.println("numeroStr16 = " + numeroStr16);

        System.out.println("=============== FLOAT A STRING ==================================");
        float numeroFloat3 = 102045689f;
        String numeroStr17 = Float.toString(numeroFloat3);
        System.out.println("numeroStr17 = " + numeroStr17);
        String numeroStr18 = String.valueOf(numeroFloat3);
        System.out.println("numeroStr18 = " + numeroStr18);

        float numeroFloat4 = 1030551588.000f;
        String numeroStr19 = Float.toString(numeroFloat4);
        System.out.println("numeroStr19 = " + numeroStr19);
        String numeroStr20 = String.valueOf(numeroFloat4);
        System.out.println("numeroStr20 = " + numeroStr20);

        float numeroFloat5 = 1030551e-2f;
        String numeroStr21 = Float.toString(numeroFloat5);
        System.out.println("numeroStr21 = " + numeroStr21);
        String numeroStr22 = String.valueOf(numeroFloat5);
        System.out.println("numeroStr22 = " + numeroStr22);

        //CONVERSION ENTRE DATOS PRIMITIVOS
        //Lo recomendable es pasar de un tipo de dato menor a uno mayor ejemplo byte a short o de short a int o
        //de int a long si lo hacemos al contrario y el dato almacenado es màs grande que el tipo de dato podemos
        //tener perdida de información.
        //Anteponiendo el tipo de dato al que queremos convertir dentro de paréntesis hacemos el casteo es decir
        // obligamos a pasar de un tipo de dato a otro deben ser compatibles es decir no podemos pasar un int a un
        //string

        byte by = 10;
        short s = (short)by;
        System.out.println("s = " + s);
        int i = (int)s;
        System.out.println("i = " + i);

    }
}
