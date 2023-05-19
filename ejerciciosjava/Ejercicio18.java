import java.util.Scanner;

public class Ejercicio18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double peso;
    double altura;
    double imc;

        System.out.print("Ingrese su peso: ");
        peso = scanner.nextDouble();

        System.out.print("Ingrese su altura: ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Su indice de Masa Corporal IMC es: " + imc);
    }
}

