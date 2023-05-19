import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese la temperatura en grados Celsius: ");
    double celsius = entrada.nextDouble();

    double fahrenheit = (celsius * 9 / 5) + 32;

    System.out.println(celsius + " grados Celsius equivale a " + fahrenheit + " grados Fahrenheit.");
  }
}

    

