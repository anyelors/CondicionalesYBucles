package es.ipartek;

public class EjercicioBucles4 {
    public static void main(String[] args) {
        /*
        * Hacer una aplicación que muestre los valores del 1 al 10
        * debe de hacerlo con FOR DoWhile While
        * */

        final Integer LIMIT = 10;
        Integer i = 1;

        System.out.println("DoWhile");
        do{
            System.out.printf("%-2d", i);
            i++;
        } while(i <= LIMIT);

        System.out.println();
        System.out.println("While");
        i = 1;
        while (i <= LIMIT){
            //Notación PostFija --> Asigna --> Incrementa
            System.out.printf("%-2d", i++);
        }

        System.out.println();
        System.out.println("For");
        for (i=1; i <= LIMIT; i++) {
            System.out.printf("%-2d", i);
        }
    }
}
