import java.util.Scanner;

public class V17Nombres{

    public static void main(String args[]){

        String Nom1 = "", Nom2 = "";
        Scanner teclado = new Scanner(System.in);
        System.out.print("por favor ingresa tu primer nombre: ");
        Nom1 = teclado.nextLine();

        System.out.print("Por favor dime tu segundo Nombre: ");
        Nom2 = teclado.nextLine();

        if(Nom1.equalsIgnoreCase(Nom2)){

            System.out.println("Los nombres son iguales");
        } else {

            System.out.println("Los nombres son diferentes");
        }
    }
}