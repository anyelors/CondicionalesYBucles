package es.ipartek;

import java.util.Scanner;

public class EjercicioBucles2 {
    public static void main(String[] args) {
        /*
        * 2.- Crea una aplicación que solicite al usuario un código PIN.
        * Si el usuario indica el código "0000" se muestra el mensaje "PIN correcto".
        * En caso contrario, se muestra un mensaje de error "PIN incorrecto" y se le solicita el PIN nuevamente.
        * Si el usuario se equivoca un máximo de 3 veces, la aplicación termina mostrando el mensaje "PIN Bloqueado."
        * */

        final String PIN = "0000";
        String vPin = "";
        Integer contador = 0;
        Scanner scan = new Scanner(System.in);

        do{
            contador += 1;
            System.out.printf("Intentos [%d], Favor digite PIN: ", contador);
            vPin = scan.nextLine();
        } while (!vPin.equals(PIN) && contador < 3);

        System.out.println((vPin.equals(PIN) && contador <= 3) ? "PIN Correcto" : "PIN Incorrecto Bloqueado");
    }
}
