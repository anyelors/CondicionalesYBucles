package es.ipartek;

import java.util.Scanner;

public class EjercicioBucles6 {
    /*
    3.- Crea una aplicación que permite al usuario repasar una tabla de multiplicar
    seleccionada aleatoriamente entre el 2 y el 10 ( la del 1 es muy simple ).
    La aplicación debe solicitar al usuario el resultado de cada multiplicación
    indicando si responde correctamente o no.
    Al final la aplicación debe indicar al usuario el número de aciertos y el de errores cometidos y la calificación.

    Si el numero de errores es 0 : "Excelente"
    Si el número de errores está entre 1 y 3 : "Correcto"
    Si el número de errores es superior a 3 : "Necesita mejorar".
    EXTRA: Modifica el ejercicio anterior de modo que el usuario tenga un máximo de 3 intentos para responder
    a cada una de las operaciones antes de dar el resultado por no válido.
     */

    public static void main(String[] args) {
        Integer numero;
        Integer aciertos = 0, fallos = 0, ingreso, intentos;
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor digite un numero de 2 al 10 para repasar Tabla de Multiplicar");
        numero = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 10; i++) {

            intentos = 0;
            do {
                if (intentos == 0) {
                    System.out.printf("Digita resultado [%d] * [%d] = ", numero, i);
                } else {
                    System.out.printf("No Valido Intento [%d], Digita resultado [%d] * [%d] = ", intentos+1, numero, i);
                }
                ingreso = Integer.parseInt(scan.nextLine());
                intentos += 1;
            } while (intentos < 3 && ((numero*i) != ingreso));

            if ((numero*i) == ingreso){
                aciertos +=1 ;
            } else {
                System.out.printf("Resultado [%d] * [%d] = [%d]\n", numero, i, (numero * i));
                fallos += 1;
            }
        }
        scan.close();

        if (fallos == 0) {
            System.out.printf("\nAciertos: [%d], Fallos [%d] Excelente", aciertos, fallos);
        } else if (fallos >= 1 || fallos <= 3) {
            System.out.printf("\nAciertos: [%d], Fallos [%d] Correcto", aciertos, fallos);
        } else {
            System.out.printf("\nAciertos: [%d], Fallos [%d] Necesita mejorar", aciertos, fallos);
        }
    }
}
