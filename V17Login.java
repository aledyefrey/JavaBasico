import java.util.Scanner;

public class V17Login{

    public static void main(String args[]){

        String usuario = "", clave = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tu usuario: ");
        usuario = teclado.nextLine();

        System.out.print("Dime tu clave: ");
        clave = teclado.nextLine();

        if(clave.equals("123456")){

            System.out.println("Acceso concedido");
        } else {

            System.out.println(usuario +" Datos incorrectos");
        }
    }
}