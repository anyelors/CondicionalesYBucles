package es.ipartek;

import java.util.Scanner;

public class EjercicioCondicionales3 {
    public static void main(String[] args) {
        //La aplicación solicita al usuario una nota decimal y debe mostrarse la calificación
        //0 - <5 Suspenso
        //5 - <6 Suficiente
        //6 - <7 Bien
        //7 - <9 Notable
        //9 - <10 Sobresaliente
        //10 Matrícula Honor
        //Nota fuera de rango

        float nota;
        Scanner scan = new Scanner(System.in);
        System.out.println("Favor digite Nota: ");
        nota = Float.parseFloat(scan.nextLine());

        if (nota >= 0 && nota < 5) {
            System.out.println("Nota ["+nota+"] Suspenso");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Nota ["+nota+"] Suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Nota ["+nota+"] Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Nota ["+nota+"] Notable");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("Nota ["+nota+"] Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Nota ["+nota+"] Matrícula de Honor");
        } else {
            System.out.println("Nota fuera de rango");
        }
    }
}
