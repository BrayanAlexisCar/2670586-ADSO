import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ancho;
        double altura;
        double area;

        System.out.print("Ingrese el ancho: ");
         ancho = scanner.nextDouble();

        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();

        area = ancho * altura;

        System.out.println("El área del rectángulo es: " + area);
    }
}