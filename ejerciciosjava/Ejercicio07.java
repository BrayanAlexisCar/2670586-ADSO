import java.util.Scanner;


public class Ejercicio07{


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double precio=0;
    double porcentajeDescuento=0;
     double precioFinal =0;


    System.out.print("Ingrese el precio del producto: ");
     precio = scanner.nextDouble();

    System.out.print("Ingrese el porcentaje de descuento: ");
     porcentajeDescuento = scanner.nextDouble();

    double descuento = precio * (porcentajeDescuento/100);
    precioFinal = precio - descuento;

    System.out.println("El precio final con descuento es: " + precioFinal);
    }
}