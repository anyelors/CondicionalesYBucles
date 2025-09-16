package es.ipartek;

import java.util.Scanner;

public class EjercicioBucles1 {

    public static void main(String[] args) {

        //Solicite al usuario un valor numérico hasta que se indique un valor negativo
        //La aplicación debe mostrar la sumatoria menos el último

        int sumatoria = 0;
        int numero;

        Scanner scan = new Scanner(System.in);

        System.out.println("*** Bucle Do While  ***");
        do {
            System.out.println("Digite numero: ");
            numero = Integer.parseInt(scan.nextLine());
            if (numero > 0) {
                sumatoria += numero;
            }
        } while (numero > 0);

        System.out.println("Sumatoria con Bucle Do While es : [" + sumatoria + "]\n");

        //####################################################################

        System.out.println("*** Bucle While ***");
        sumatoria = 0;
        System.out.println("Digite numero: ");
        numero = Integer.parseInt(scan.nextLine());
        
        while (numero > 0){
            sumatoria += numero;
            System.out.println("Digite numero: ");
            numero = Integer.parseInt(scan.nextLine());
        }

        scan.close();

        System.out.println("sumatoria con Bucle While es : [" + sumatoria + "]");

    }
}
