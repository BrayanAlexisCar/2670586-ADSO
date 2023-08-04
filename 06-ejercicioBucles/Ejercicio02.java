import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese la cantidad total financiers: ");
        double cantidadfinanciada = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de las cuotas pagadas: ");
        int cuotaspagadas = scanner.nextInt();

        System.out.print("Ingrese el valor de cada cuota: ");
        double valordecuota = scanner.nextDouble();

       
        double interesestotales = 0;
        int i = 1;
    while (i <= cuotaspagadas){
           interesestotales = interesestotales + (valordecuota - (cantidadfinanciada / cuotaspagadas));
            i++;
            }

            double porcentaje = (interesestotales / cantidadfinanciada) * 100;
             System.out.println("Porcentaje de intereses pagados: " + porcentaje + "%");

    }
}
