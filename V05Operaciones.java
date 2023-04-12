public class V05Operaciones{

    public static void main(String args[]){

        int num1 = 4, num2 = 4, rta;
        rta = num1 + num2 / 2;
        System.out.println("operacion sin parentesis = "+ rta);
        rta = (num1 + num2)/2;
        System.out.println("operacion con parentesis = "+ rta);
    }
}