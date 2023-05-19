import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);

    int num1;
    int num2;

    System.out.print("Ingrese el primer número: ");
    num1 = entrada.nextInt();

    System.out.print("Ingrese el segundo número: ");
    num2 = entrada.nextInt();

    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;

    System.out.println("El  número uno ahora es " + num1 + " el  número dos ahora es " + num2);
  }
}




