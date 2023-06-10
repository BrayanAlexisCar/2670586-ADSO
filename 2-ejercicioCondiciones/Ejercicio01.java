
import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.println("¡Bienvenido!");
         System.out.print(" ingrese su edad: ");
         edad = entrada.nextInt();


        if (edad < 18) {
            System.out.println("si usted es menor de edad. Recibes un auxilio de $800.000");
        } else {
            System.out.println("si usted es mayor de edad. Debes pagar un impuesto de $200.000");
        }

       
    }
}

