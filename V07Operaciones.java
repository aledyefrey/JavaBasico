public class V07Operaciones{

    public static void main(String args[]){

        int operacion = 1, num1 = 8, num2 = 4, rta = 0;
        if(operacion == 1){

            rta = num1 + num2;
            System.out.println("El resultado de la suma es: "+ rta);
        } else if(operacion == 2){

            rta = num1 - num2;
            System.out.println("El resultado de la resta es: "+ rta);
        } else if(operacion == 3){

            rta = num1 * num2;
            System.out.println("El ressultado de la multiplicacion es: "+ rta);
        } else if(operacion == 4){

            rta = num1 / num2;
            System.out.println("El resultado de la divicion es: "+ rta);
        } else {

            System.out.println("La operacion que escojiste no existe");
        }
    }
}