import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("es divisible por 2, 3 y 5");
        } else {
            System.out.println(" no es divisible por 2, 3 y 5");
        }

    }
}


   

   
    


