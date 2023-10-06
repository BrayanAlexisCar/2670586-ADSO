public class Ejercicio18 {
    public static void main(String[]args){


        int numero1 = 123;
        inverso(numero1);

        
        int numero2 = 5657;
        inverso(numero2);

        
        int numero3 = 934;
        inverso(numero3);

        
        int numero4 = 1232;
        inverso(numero4);

        
        int numero5 = 154;
        inverso(numero5);


      
       


    }


    public static int inverso(int numero){
       int numerooriginal = numero;
       int nuevonumero = 0;

       int cifra = 0;
       while(numero!=0){
            cifra = numero % 10;
            numero = numero/10;
            nuevonumero = nuevonumero * 10 + cifra;

       }
        System.out.println("el numero " +numerooriginal+ " invertido es "+nuevonumero);

        return 0;        

    }


}
