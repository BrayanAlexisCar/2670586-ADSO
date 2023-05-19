import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd ;
        double eur ;
        double jpy ;
        double gbp;

        System.out.print("Ingrese  cantidad en COP: ");
        double cop = scanner.nextDouble();

        usd = cop / 4515.00;
        eur = cop / 4912.57  ;
        jpy = cop / 33.2;
        gbp = cop / 5657.30;

        System.out.println("cantidad en USD:" + usd);
        System.out.println("cantidad en EUR:" + eur);
        System.out.println("cantidad en JPY:" + jpy);
        System.out.println("cantidad en GBP:" + gbp);
    }
}
