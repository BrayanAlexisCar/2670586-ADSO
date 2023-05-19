import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Ingrese un numero ");
         num = scanner.nextInt();

         if (num % 2 == 0) System.out.print("es par ");
         
         else System.out.print("no es par ");

         

    }
}