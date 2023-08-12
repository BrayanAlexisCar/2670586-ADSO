import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if ( numero <= 999999){
            int numalrevez = 0;
            int numerooriginal = numero;
            
            while (numero > 0) {
                int digito = numero % 10;
                numalrevez =numalrevez * 10 + digito;
                numero = numero / 10;
            }
          
            if( numalrevez == numerooriginal){

            System.out.println("el numero es palindromo");

            }else{
             System.out.println("el numero no es palindromo");
            }

        }  else{System.out.println( "el numero maximo esd e 6 digitos");   
         
        }
    
    }
    

}

