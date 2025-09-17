package es.ipartek;

import java.util.Scanner;

public class EjercicioCondicionales2 {

    public static void main(String[] args) {
        //Crea una aplicación que solicite un importe y una forma de pago
        //(M) Metálico
        //(V) Visa
        //(C) Mastercard
        //Si usuario paga con Visa se le aplica un 2% de descuento o el 5% si el importe mayor a 1000 €
        //Si usuario paga con Mastercard se le aplica un descuento del 3%
        //Si el usuario paga en Metálico se le aplica un descuento del 0.5%
        //si el usuario no indica ninguna forma de pago debe indicar error

        final String METALICO = "M";
        final String VISA = "V";
        final String MASTERCARD = "C";
        float monto = 0.0F;
        float descuento = 0.0F;
        String formaPago;
        boolean error = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite monto a pagar:");
        monto = Float.parseFloat(scan.nextLine());

        System.out.println("""
                       Digite forma de pago:
                       (M) Metálico
                       (V) Visa
                       (C) MasterCard 
                       """);
        formaPago = scan.nextLine();
        scan.close();

        if (validarVacio(formaPago)){
            System.out.println("Error debe digitar una forma de pago");
            return;
        }

        switch (formaPago) {
            case METALICO: {
                descuento = monto * 0.005F;
            }break;
            case MASTERCARD: {
                descuento = monto * 0.03F;
            } break;
            case VISA:{
                if (monto > 1000) {
                    descuento = monto * 0.05F;
                } else {
                    descuento = monto * 0.02F;
                }
            } break;
            default:{
                System.out.println("Forma de Pago incorrecta");
                error = true;
            }
        }

        if (!error) {
            System.out.printf("Monto total: [%.2f] Descuento: [%.2f] Monto a Pagar: [%.2f]", monto, descuento, (monto - descuento));
        }

    }

    public static boolean validarVacio(String cadena){
        return cadena.trim().isEmpty();
    }
}
