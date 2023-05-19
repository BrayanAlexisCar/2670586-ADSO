import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int edad;
        double salario;

        System.out.print("Ingrese el nombre del empleado: ");
         nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
         edad = scanner.nextInt();

         System.out.print("Ingrese el salario del empleado: ");
         salario = scanner.nextDouble();

        System.out.println("Información del empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
