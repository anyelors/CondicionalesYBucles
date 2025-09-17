package es.ipartek;

import java.util.Random;
import java.util.Scanner;

public class EjercicioBucles3 {
    public static void main(String[] args) {
        /*
        * 3.- Crea una aplicación para jugar a adivinar el número secreto.
        * Para ello el programa debe generar un número aleatorio entre 1 y 100.
        * Después la aplicación debe solicitar al usuario repetidamente que intente adivinar el número secreto hasta conseguirlo.
        * Para calcular el número secreto puedes emplear el método nextInt() de la clase Random.
        * Consulta la ayuda de la API de Java para ver las sobrecargas del método.
         * */

        final Integer MAX_LIMITE = 20;
        Integer numSecreto;
        Integer vNumSecreto;
        Integer contador = 0;
        Scanner scan = new Scanner(System.in);

        Random generadorAleatorios = new Random();
        numSecreto = 1+generadorAleatorios.nextInt(100);

        System.out.println("numSecreto = " + numSecreto);

        do {
            System.out.println("Favor digite numero secreto: ");
            vNumSecreto = Integer.parseInt(scan.nextLine());

            if (vNumSecreto > numSecreto) {
                if (Math.abs(vNumSecreto - numSecreto) >= MAX_LIMITE)
                    System.out.println("Valor MUY grande");
                else
                    System.out.println("Valor grande");
            }

            if (vNumSecreto < numSecreto) {
                if (Math.abs(vNumSecreto - numSecreto) >= MAX_LIMITE)
                    System.out.println("Valor MUY pequeño");
                else
                    System.out.println("Valor pequeño");
            }

            contador++;
        } while (vNumSecreto != numSecreto);

        System.out.printf("Numero aleatorio [%d] : Numero digitado [%d] : Numero de Intentos [%d]", numSecreto, vNumSecreto, contador);
    }
}
