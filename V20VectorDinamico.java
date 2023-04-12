import java.util.Scanner;

public class V20VectorDinamico{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int Lon = 0;

        System.out.print("Cuantos numeros deseas ingresar?: ");
        Lon = teclado.nextInt();

        int Num[] = new int [Lon];

        for(int i = 0; i < Num.length; i++){

            System.out.println("Por favor dame el valor #"+ (i + 1));
            Num[i] = teclado.nextInt();
        }
        for(int i = 0; i < Num.length;i++){

            System.out.print("["+ Num[i] +"]");
        }
    }
}