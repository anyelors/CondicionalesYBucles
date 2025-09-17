package es.ipartek;

import java.util.Scanner;

public class EjercicioCondicionales6 {
    public static void main(String[] args) {
        /*
        Crea una aplicación para validar la seguridad de una contraseña.
        Para ello la aplicación debe solicitar una contraseña y validar las siguientes restricciones:
        Tiene 8 caracteres
        La primera letra es mayúscula
        La última letra es un dígito.
        Contiene un carácter #, $, *
        No contiene espacios en blanco
         */

        String contrasena = "";
        char primeraLetra;
        char ultimaLetra;
        boolean errorLength = true;
        boolean errorPrimeraLetra = true;
        boolean errorPrimeraLetraMay = true;
        boolean errorUltimoDig = true;
        boolean errorCaracter = true;
        boolean errorEspacios = true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Favor digite contraseña: ");
            contrasena = scan.nextLine();
        } while (contrasena.length()==0);

        scan.close();

        if (contrasena.length()!=8) {
            errorLength = false;
        }

        primeraLetra = contrasena.charAt(0);
        if (Character.isLetter(primeraLetra)){
            if(!Character.isUpperCase(primeraLetra)){
                errorPrimeraLetraMay = false;
            }
        } else {
            errorPrimeraLetra = false;
        }

        ultimaLetra = contrasena.charAt(contrasena.length()-1);
        if(!Character.isDigit(ultimaLetra)) {
            errorUltimoDig = false;
        }

        if(!(contrasena.contains("#")) ||
                (contrasena.contains("$")) ||
                (contrasena.contains("*"))) {
            errorCaracter = false;
        }

        if (!contrasena.contains(" ") ) {
            errorEspacios = false;
        }

        System.out.printf("\nTiene 8 caracteres: [%s]", errorLength ? "SI" : "NO");
        System.out.printf("\nLa primera es letra: [%s]", errorPrimeraLetra ? "SI" : "NO");
        System.out.printf("\nLa primera letra es mayúscula: [%s]", errorPrimeraLetraMay ? "SI" : "NO");
        System.out.printf("\nLa última letra es un dígito: [%s]", errorUltimoDig ? "SI" : "NO");
        System.out.printf("\nContiene un carácter #, $, *: [%s]", errorCaracter ? "SI" : "NO");
        System.out.printf("\nContiene espacios en blanco: [%s]", errorEspacios ? "SI" : "NO");

    }
}
