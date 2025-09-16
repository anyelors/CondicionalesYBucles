package es.ipartek;

import java.util.Scanner;

public class EjercicioCondicionales4 {
    public static void main(String[] args) {

        //Crea una aplicación que solicite al usuario la longitud de los lados A, B y C de un triángulo, y nos muestre a continuación el tipo de triángulo con el que se corresponde, tal que:

        //Equilátero si todos los lados son iguales
        //Isósceles si solo dos lados son iguales
        //Escaleno si todos los lados son distintos
        //La aplicación debe mostrar al final los lados del triángulo y su tipo en una línea del tipo:

        //"Los lados del triángulo son A = xxx, B = xxx, C = xxx, y es de tipo yyyyyyyy."

        int a, b, c;
        String tipoTriangulo = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor digite lado A del Triangulo");
        a = Integer.parseInt(scan.nextLine());

        System.out.println("Favor digite lado B del Triangulo");
        b = Integer.parseInt(scan.nextLine());

        System.out.println("Favor digite lado C del Triangulo");
        c = Integer.parseInt(scan.nextLine());

        scan.close();

        if (a == b && a == c) {
            tipoTriangulo = "Equilátero";
        }
        if ((a != b && a == c) || (a == b && a != c) || (b == c && b != a)) {
            tipoTriangulo = "Isósceles";
        }
        if (a != b && b != c) {
            tipoTriangulo = "Escaleno";
        }

        System.out.printf("Los lados del triángulo son A = [%d], B = [%d], C = [%d], y es de tipo %s.", a, b, c, tipoTriangulo);
    }
}
