package es.ipartek;

public class Condicionales {
    public static void main(String[] args) {
        int t = 10;

        //Condicional de 1 rama
        boolean congelada = t < 0;
        if ( congelada ) {
            //Bloque se ejecuta si y solo si la condición es cierta
            System.out.println("El agua esta congelada");
        }

        //Condicional de 2 ramas
        if ( t < 0 ) {
            System.out.println("Esta congelada");
        } else {
            System.out.println("Esta liquida");
        }

        System.out.println("FIN");
    }
}
