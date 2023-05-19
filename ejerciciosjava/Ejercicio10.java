import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;    
        int division;
        int resto;

        System.out.print("Ingrese  primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese  segundo número: ");
        num2 = scanner.nextInt();

        division = num1 / num2;
        resto = num1 % num2;

        System.out.println("El resultado de la división es: " + division);
        System.out.println("El resto de la división es: " + resto);
    }
}