package es.ipartek;

import java.util.Scanner;

public class CondicionalesAnidados {
    public static void main(String[] args) {
        int t;
        Scanner scan = new Scanner(System.in);

        System.out.println("Indica la temperatura");
        t  = Integer.parseInt(scan.nextLine());

        //Condicionales anidados
        if ( t <= 0) {
            System.out.println("El agua esta helada");
        } else if  ( t > 0 && t < 100) {
            System.out.println("El agua esta liquida");
        } else {
            System.out.println("El agua esta hirviendo");
        }

        //Anidamiento en 1 rama
        boolean a = true;
        boolean b = true;

        if (a) {
            if (b) {
                System.out.println("A y B");
            }
        }

        if (a && b) {
            System.out.println("A y B");
        }

    }
}
