import java.util.Scanner;

public class V08Suma{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        String nom = "";
        int num1 = 0, num2 = 0, rta = 0;
        System.out.print("como te llamas? ");
        nom = teclado.nextLine();

        System.out.print("Dame el primer valor ");
        num1 = teclado.nextInt();

        System.out.print("Dame el segundo valor ");
        num2 = teclado.nextInt();

        rta = num1 + num2;
        System.out.println("Hola " + nom +" el resultado de tu suma es = "+ rta);
    }
}