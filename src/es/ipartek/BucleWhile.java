package es.ipartek;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        final String PASS = "Ipartek";

        String clave = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique la Clave: ");
        clave = scan.nextLine();

        while (!clave.equals(PASS)) {
            System.out.println("Clave errada, vuelve a intentarlo: ");
            clave = scan.nextLine();
        };

        scan.close();
        System.out.println("OK");
    }
}
