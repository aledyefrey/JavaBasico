public class V06Promedio{

    public static void main(String args[]){

        int matematicas = 5, biologia = 4, quimica = 7, promedio;
        promedio = (matematicas + biologia + quimica)/3;
        if(promedio >= 6){

            System.out.println("El alumno aprobo "+ promedio);
        } else {

            System.out.println("El alumno reprobo "+ promedio);
        }
    }
}