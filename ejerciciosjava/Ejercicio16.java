import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numperiodos;
        double inversionInicial;
        double tasainteresAnual;
        double montofinal;

        System.out.print("Ingrese la inversión inicial: ");
        inversionInicial = entrada.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
         tasainteresAnual = entrada.nextDouble() / 100;

        System.out.print("Ingrese el número de períodos: ");
         numperiodos = entrada.nextInt();

        montofinal = inversionInicial * Math.pow(1 + tasainteresAnual, numperiodos);

        System.out.println("El monto final obtenido es: " + montofinal);
    }
}
