import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int numeroalrevez = 0;
        int total;
        int numerooriginal = numero;
        

        while(numero > 0){
            total = numero %10;
            numeroalrevez = numeroalrevez * 10 + total;
            numero = numero / 10;
            
        
            if( numeroalrevez ==  numerooriginal){

            System.out.println("el numero es palindromo");

            }else{
             System.out.println("el numero no es palindromo");
            }
    
         }      
         
    }
}
