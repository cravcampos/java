package com.java.seccion03_strings;

public class StringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb;
        sb = new StringBuilder(a);

        System.out.println("=========================  USANDO MÉTODO CONCAT() ================");
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){

            //Prueba de rendimiento con concat()
            //c = c.concat(a).concat(b).concat("\n");//500 = 2ms,1000 = 6ms, 10000 = 169ms, 100000 = 5749ms

            //Prueba de rendimiento con +
            //c +=  a + b +"\n"; //500 = 23ms, 1000 23ms, 10000 = 98ms, 100000 = 2167ms

            //Prueba de rendimiento con append()
            sb.append(a).append(b).append("\n");// 500 = 1ms, 1000 = 1ms, 10000 = 1ms, 100000 = 15ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());


    }
}
