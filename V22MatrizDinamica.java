import java.util.Scanner;

public class V22MatrizDinamica{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int filas = 0, columnas = 0, cont = 1;

        System.out.print("Dime el numeros de filas: ");
        filas = teclado.nextInt();

        System.out.print("Dime el numero de columnas: ");
        columnas = teclado.nextInt();

        int Matriz[][] = new int [filas][columnas];

        for(int i = 0; i < filas; i++){

            for(int j = 0; j < columnas; j++){

                Matriz [i][j]= cont;
                cont++;
                System.out.print("["+ Matriz[i][j] +"]");
            }
            System.out.println("");
        }
    }
}