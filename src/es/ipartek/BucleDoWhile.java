package es.ipartek;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {

        final String PASS = "Ipartek";

        String clave = "";
        Scanner scan = new Scanner(System.in);

        // BUCLE INDETERMINADO 1 - n
        do {
            System.out.println("Indique la Clave: ");
            clave = scan.nextLine();
        } while (!clave.equals(PASS));

        System.out.println("OK");
    }
}
