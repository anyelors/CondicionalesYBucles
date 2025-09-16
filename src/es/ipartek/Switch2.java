package es.ipartek;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        int mes;
        Scanner scan = new Scanner(System.in);

        System.out.println("Indica el mes");
        mes  = Integer.parseInt(scan.nextLine());

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("31 Dias");
            } break;
            case 4:
            case 6:
            case 9:
            case 11:{
                System.out.println("30 Dias");
            }break;
            case 2:{
                System.out.println("28 Dias");
            } break;
            default:{
                System.out.println("Mes invalido");
            }
        }
    }
}
