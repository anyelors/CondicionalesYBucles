package es.ipartek;

import java.util.Scanner;

public class EjercicioCondicionales1 {
    public static void main(String[] args) {
        //La aplicación va a pedir un nombre de usuario y una clave
        //si el nombre de usuario es ANA o MARIA (Usuario OK)
        //si la contraseña es IPARTEK (Contraseña OK)

        String usuario = "";
        String contraseña = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor digite usuario: ");
        usuario = scan.nextLine();

        System.out.println("Favor digite Contraseña");
        contraseña = scan.nextLine();
         scan.close();

        if (!usuario.toUpperCase().equals("ANA") && !usuario.toUpperCase().equals("MARIA")) {
            System.out.println("Usuario Desconocido ❌");
            return;
        }

        if (!contraseña.toUpperCase().equals("IPARTEK")) {
            System.out.println("Contraseña Incorrecta ❌");
            return;
        }

        System.out.println("Usuario y Contraseña Correcta ✅");

        /*
        if (usuario.equals("ANA") || usuario.equals("MARIA")) {
            if (contraseña.equals("IPARTEK")) {
                System.out.println("Usuario y Contraseña Correcta ✅");
            } else {
                System.out.println("Contraseña Incorrecta ❌");
            }
        } else {
            System.out.println("Usuario Desconocido ❌");
        }
        */

    }
}
