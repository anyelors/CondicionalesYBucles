package es.ipartek;

public class EjercicioBucles5 {
    public static void main(String[] args) {
        /*
        * La aplicación debe mostrar las tablas de multiplicación
        * */

        final Integer LIMIT = 10;
        for (int i = 1; i <= LIMIT ; i++) {
            for (int j = 1; j <= LIMIT; j++) {
                System.out.printf("%-4d",(i*j));
            }
            System.out.println();
        }
    }
}
