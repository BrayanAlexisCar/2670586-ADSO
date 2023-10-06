public class Ejercicio17 {
    public static void main(String[]args){


        int numero1 = 123;
        sumadigitos(numero1);

        
        int numero2 = 5657;
        sumadigitos(numero2);

        
        int numero3 = 934;
        sumadigitos(numero3);

        
        int numero4 = 1232;
        sumadigitos(numero4);

        
        int numero5 = 154;
        sumadigitos(numero5);


      
       


    }


    public static int sumadigitos(int numero){
      
      int suma = 0;
       int numeroorigin = numero;

       while(numero!=0){
         int digito = numero % 10; // sacar el ultimo digirto
         suma = suma + digito; //se le suma el digito a suma
         numero = numero /10;// se eleimina el ultimo digito y pasa al sgte

       }
        System.out.println("la suma de " +numeroorigin+ " es " +suma);

        return 0;        


    }


}
