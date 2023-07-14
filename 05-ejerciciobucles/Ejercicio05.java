import java.util.Scanner;

public class Ejercicio05{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);


       

        System.out.print("ingrese el numero : ");
        int numero = Entrada.nextInt();

        int factorial = 1;


        System.out.print("factorial: ");
        for (int i = 1; i <= numero; i++){
            factorial *= numero;
        System.out.print(i);
           
             if (i < numero) {
                System.out.print(" x ");
            }
        }

           System.out.println(" = " + factorial);
    }
}



