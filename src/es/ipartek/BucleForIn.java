package es.ipartek;

import java.util.Arrays;

public class BucleForIn {
    public static void main(String[] args) {
        //For para recorer estructuras de datos
        String valores = "10 20 30 40 50 60 70";
        String[] partes = valores.split("\\s+");
        System.out.println(Arrays.toString(partes));

        //Recorrer estructura de datos por posición
        for (int i = 0; i < partes.length; i++) {
            System.out.printf("En posición [%d], valor [%s]\n", i, partes[i]);
        }

        //Recorrer estructura de datos por valor
        for (String valor : partes){
            System.out.println("valor = " + valor);
        }




    }
}
