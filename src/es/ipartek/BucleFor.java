package es.ipartek;

public class BucleFor {
    public static void main(String[] args) {

        //Bucle se repite 10 veces
        for ( int contador = 0; contador < 10; contador++ ) {
            System.out.println(contador + " HOLA 1 a 1");
        }

        for ( int contador = 0; contador < 100; contador+=10 ) {
            System.out.println(contador + " HOLA 10 en 10");
        }

    }
}
