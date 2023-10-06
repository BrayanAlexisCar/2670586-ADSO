public class Ejercicio16 {
    public static void main(String[]args){


        int numero1 = 44;
        cantidad(numero1);

        
        int numero2 = 5;
        cantidad(numero2);

        
        int numero3 = 934;
        cantidad(numero3);

        
        int numero4 = 1232;
        cantidad(numero4);

        
        int numero5 = 15;
        cantidad(numero5);


      
       


    }


    public static int cantidad(int numero){
       int cifras = 0;
      
       int numeroorigin = numero;
       while(numero!=0){
            numero = numero/10;
            cifras++;

       }
        System.out.println("el numero " +numeroorigin+ " tiene "+cifras+" cifras");

        return 0;        

    }


}
