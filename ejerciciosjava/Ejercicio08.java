import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cadena1;
        String cadena2;
        String resultado;

        System.out.print("Ingrese  primera cadena: ");
         cadena1 = scanner.nextLine();

        System.out.print("Ingrese  segunda cadena: ");
         cadena2 = scanner.nextLine();

         resultado = cadena1 + cadena2;

        System.out.println("el resultado es: " + resultado);
    }
}