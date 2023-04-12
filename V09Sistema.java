import java.util.Scanner;

public class V09Sistema{

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        String nom = "";
        int numdepa = 0, servicio= 0;
        System.out.println("BIENVENIDO AL SISTEMA VACACIONAL DE COCACOLA COMPANY");
        System.out.print("Como te llamas ? ");
        nom = entrada.nextLine();
        System.out.print("Numero departamento ? ");
        numdepa = entrada.nextInt();
        System.out.print("anyos de servicio ? ");
        servicio = entrada.nextInt();

        if(numdepa == 1){

            if(servicio <= 1){

                System.out.println("El trabajador "+ nom +" tienes derecho a 6 dias de vacaiones");
            } else if(servicio >= 2 && servicio <= 6){

                System.out.println("El trabajador "+ nom +" tiene derecho a 14 dias de vacaciones");
            } else if(servicio >= 7){

                System.out.println("El trabajador "+ nom +" tiene derecho a 20 dias de vacaciones");
            }
        } else if(numdepa == 2){

            if (servicio <= 1){

                System.out.println("El trabajador "+ nom +" tiene derecho a 7 dias de vacaciones");
            } else if(servicio >= 2 && servicio <= 6){

                System.out.println("El trabajador "+ nom +" tiene derecho a 15 dias de vacaciones");
            } else if(servicio >= 7){

                System.out.println("El trabajador "+ nom +" tiene derecho a 22 dias de vacaiones");
            }
        } else if(numdepa == 3){

            if(servicio <= 1){

                System.out.println("El trabajador "+ nom +" tiene derecho a 10 dias de vacaciones");
            } else if(servicio >= 2 && servicio <= 6){

                System.out.println("El trabajador "+ nom +" tiene derecho a 20 dias de vacaiones");
            } else if(servicio >= 7){

                System.out.println("El trabajador "+ nom +" tiene derecho a 30 dias de vacaciones");
            }
        }
    }
}