package com.java.seccion02_variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        /*PRIMITIVOS NUMÉRICOS*/

        /*
         * ENTEROS
         * */

        //byte
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);
        System.out.println("==================================================================");
        //short
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES );
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE);
        System.out.println("==================================================================");

        //int
        int numeroInt = 6717272;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES );
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int " + Integer.MIN_VALUE);
        System.out.println("==================================================================");

        //long
        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES );
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long " + Long.MIN_VALUE);
        System.out.println("==================================================================");
    }
}
