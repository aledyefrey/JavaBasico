import java.util.Scanner;

public class V18Cadena{

   public static void main(String args[]){

        String CadOri = "", CadSub = "";
        int NumCad = 0, desde = 0, hasta = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una cadena de caracteres : ");
        CadOri = teclado.nextLine();

        NumCad = CadOri.length();
        System.out.println("La cadena de caracteres " + CadOri +" posee "+ NumCad +" caracteres");

        System.out.println("Desde que caracter quieres obtener la nueva cadena: ");
        desde = teclado.nextInt();
        System.out.println("Hasta que caracter quieres la nueva cadena: ");
        hasta = teclado.nextInt();

        CadSub = CadOri.substring(desde, hasta);
        System.out.println("La nueva cadena es: \n"+ CadSub);
    }
}