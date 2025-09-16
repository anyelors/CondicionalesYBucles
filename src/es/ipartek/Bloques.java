package es.ipartek;

public class Bloques {
    public static void main(String[] args) {

        //Encada bloque tenemos acceso tanto a las variables declaradas dentro
        //de ese nivel como en niveles superiores
        //Pero NO tenemos acceso a las variables declaradas en niveles inferiores
        // 1 Nivel
        int a = 10;
        {
            // 2 Nivel
            int b = 20;
            {
                // 3 Nivel
                int c = 30;
                System.out.println("3 Nivel a = " + a);
                System.out.println("3 Nivel b = " + b);
                System.out.println("3 Nivel c = " + c);
            }
            System.out.println("2 Nivel a = " + a);
            System.out.println("2 Nivel b = " + b);
        }
        System.out.println("1 Nivel a = " + a);
    }
}
