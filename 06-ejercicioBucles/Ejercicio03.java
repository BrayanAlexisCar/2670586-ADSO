import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el valor total a financiar: ");
        double valor = scanner.nextDouble();

        System.out.print("ingrese la tasa de interés : ");
        double tasadeinteres = scanner.nextDouble();

        System.out.print("ingrese la cantidad de cuotas: ");
        int cuotas = scanner.nextInt();

        double factordeInteres = 1.0;
        for (int i = 1; i <= cuotas; i++) {
            factordeInteres *= (1 + (tasadeinteres / 100.0));
        }
        double valorCuota = valor * ((tasadeinteres / 100.0) * factordeInteres) / (factordeInteres - 1);

        System.out.println("detalle de las cuotas:");

        double deuda = valor;
        for (int i = 1; i <= cuotas; i++) {
            double interes = deuda * (tasadeinteres / 100.0);
            double abonoCapital = valorCuota - interes;
            deuda -= abonoCapital;
            System.out.println("Valor de la cuota: " + valorCuota);
            System.out.println("Valor del interés: " + interes);
            System.out.println("Valor del abono a capital: " + abonoCapital);
            System.out.println("Deuda total: " + deuda);
            System.out.println();
        }
    }
}
