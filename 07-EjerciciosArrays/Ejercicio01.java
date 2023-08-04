import java.util.Scanner;

public class Ejercicio01 {
    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);


        
        System.out.print("ingrese un numero entero: ");
        int numero = Entrada.nextInt();
       
        int array [] = new int [numero];
        int variable = 1;

        for( int i = 0; i < array.length; i++){
       
         
            System.out.println("numero " +i+ " es " +variable );
               variable = variable + 2;

        
        }

}


}
