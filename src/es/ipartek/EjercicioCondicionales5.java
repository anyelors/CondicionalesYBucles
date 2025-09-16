package es.ipartek;

import java.util.Scanner;

public class EjercicioCondicionales5 {
    public static void main(String[] args) {
        /*
        Crea una aplicación que permite a un usuario adquirir una entrada de cine.
        La aplicación debe solicitar al usuario varios datos:

        Selecciona sesión de Mañana/Tarde --> La Mañana son 5€ y la Tarde son 6€
        Selecciona butaca normal o VIP  --> La butaca VIP incrementa la entrada 1€
        Selecciona bebida / palomitas pequeñas / palomitas grandes --> La bebida son 0.25€ más, las palomitas pequeñas 0.75€ y las palomitas grandes 1.50€.
        La aplicación debe mostrar al final las opciones seleccionadas y el precio final de la entrada.
         */

        String sesion = "";
        String butaca = "";
        String tieBebida = "";
        String tiePalomitasPequenas = "";
        String tiePalomitasGrandes = "";
        float total = 0.0F;
        boolean error = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Selecciona sesión de Mañana (M) / Tarde (T)");
            sesion = scan.nextLine();

            switch (sesion.toUpperCase()) {
                case "M":{
                    total += 5;
                } break;
                case "T":{
                    total += 6;
                } break;
                default: {
                    System.out.println("Sesión incorrecta");
                    error = true;
                }
            }
        } while (error);

        do {
            System.out.println("Selecciona butaca Normal (N) / VIP (V)");
            butaca = scan.nextLine();
        } while ((!butaca.equalsIgnoreCase("V")) && (!butaca.equalsIgnoreCase("N")));

        if (butaca.equalsIgnoreCase("V")) {
            total += 1;
        }

        do {
            System.out.println("Selecciona bebida S / N");
            tieBebida = scan.nextLine();
        } while ((!tieBebida.equalsIgnoreCase("S")) && (!tieBebida.equalsIgnoreCase("N")));

        if (tieBebida.equalsIgnoreCase("S")){
            total += 0.25;
        }

        do {
            System.out.println("Selecciona palomitas pequeñas S / N");
            tiePalomitasPequenas = scan.nextLine();
        } while ((!tiePalomitasPequenas.equalsIgnoreCase("S")) && (!tiePalomitasPequenas.equalsIgnoreCase("N")));

        if (tiePalomitasPequenas.equalsIgnoreCase("S")){
            total += 0.75;
        }

        do {
            System.out.println("Selecciona palomitas grandes S / N");
            tiePalomitasGrandes = scan.nextLine();
        } while ((!tiePalomitasGrandes.equalsIgnoreCase("S")) && (!tiePalomitasGrandes.equalsIgnoreCase("N")));

        if (tiePalomitasGrandes.equalsIgnoreCase("S")){
            total += 1.50;
        }

        System.out.printf("Valor total a pagar de la entrada es: [%.2f]", total);
    }
}
