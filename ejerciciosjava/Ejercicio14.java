import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double promePonderado;

        int credit1;
        int credit2;
        int credit3;

        System.out.print("Ingrese  nota de la materia 1: ");
         nota1 = scanner.nextDouble();
        System.out.print("Ingrese créditos de la materia 1: ");
        credit1 = scanner.nextInt();

        System.out.print("Ingrese nota de la materia 2: ");
         nota2 = scanner.nextDouble();
        System.out.print("Ingrese créditos de la materia 2: ");
        credit2 = scanner.nextInt();

        System.out.print("Ingrese nota de la materia 3: ");
        nota3 = scanner.nextDouble();
        System.out.print("Ingrese créditos de la materia 3: ");
        credit3 = scanner.nextInt();

        promePonderado = (nota1 * credit1 + nota2 * credit2 + nota3 * credit3) /
            (credit1 + credit2 + credit3);
        System.out.println("El promedio ponderado es: " + promePonderado);
    }
}
