
import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double radio;
        double perimetro;
        double area;

        System.out.print("Ingres el radio del círculo: ");
        radio = scanner.nextDouble();

        perimetro = 2 * 3.14159 * radio;
         area = 3.14159 * radio * radio;

        System.out.println(" perímetro del círculo es: " + perimetro);
        System.out.println("el área del círculo es: " + area);
    }
}
