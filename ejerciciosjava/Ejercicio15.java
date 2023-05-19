import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double metros;
        double cm;
        double pulgadas;
        double pies;

        System.out.print("Ingrese la longitud en metros: ");
        metros = entrada.nextDouble();

        cm = metros * 100;
        pulgadas = metros * 39.37;
        pies = metros * 3.281;

        System.out.println("Longitud en cm es : " + cm);
        System.out.println("Longitud en pulgadas es: " + pulgadas);
        System.out.println("Longitud en pies es: " + pies);
    }
}