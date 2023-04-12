public class V15Ciclos2{

    public static void main(String agrs[]){

        int i = 1, j = 99;
        System.out.println("Series 2 con for");
        for(i = 1; i <= 5;i++){

            if(i < 5){

                System.out.print(i +", ");
                System.out.print(j +", ");
            } else {

                System.out.print(i +", ");
                System.out.println(j);
            }
            j--;
        }
        System.out.println("");
        i = 1;
        j = 99;
        System.out.println("Serie 2 con while");
        while(i <= 5){

            if(i < 5){

                System.out.print(i +", ");
                System.out.print(j +", ");
            } else {

                System.out.print(i +", ");
                System.out.println(j);
            }
            i++;
            j--;
        }
        i = 1;
        j = 99;
        System.out.println("");
        System.out.println("Serie 2 con do while");
        do{

            if(i < 5){

                System.out.print(i +", ");
                System.out.print(j +", ");
            } else {

                System.out.print(i +", ");
                System.out.println(j);
            }
        i++;
        j--;
        }while(i <= 5);
    }
}