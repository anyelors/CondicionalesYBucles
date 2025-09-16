package es.ipartek;

public class Switch {
    public static void main(String[] args) {

        //Constantes --> Es un identificador cuyo valor no se puede cambiar
        final int DOMINGO = 1;


        int dia = 1;

        //La variable de control tiene que ser de tipo integral
        //enteros
        //cadenas
        //enumerados

        //No permite decimales
        switch (dia) {
            case DOMINGO:{
                System.out.println("Domingo");
            } break;
            case 2: {
                System.out.println("Lunes");
            } break;
            case 3: {
                System.out.println("Martes");
            } break;
            case 4: {
                System.out.println("Miércoles");
            } break;
            case 5: {
                System.out.println("Jueves");
            } break;
            case 6: {
                System.out.println("Viernes");
            } break;
            case 7: {
                System.out.println("Sábado");
            } break;
            default:{
                System.out.println("Dia invalido");
            }
        }
    }
}
