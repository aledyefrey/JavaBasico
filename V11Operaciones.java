public class V11Operaciones{

    public static void main(String args[]){

       int num1 = 5, num2 = 3, rta = 0, parametro = 2;

        switch(parametro){

            case 1:
                rta = num1 + num2;
                System.out.println("El resultado de la suma es = "+ rta);
                break;
            case 2:
                System.out.println("El resultado de la resta es = "+(rta = num1 - num2));
                break;
            case 3:
                rta = num1 * num2;
                System.out.println("El resultado de la multiplicacion es = "+ rta);
                break;
            case 4:
                rta = num1 / num2;
                System.out.println("El resultado de la divicion es = "+ rta);
                break;
            default:
                System.out.println("esta opcion no existe");
        }
    }
}