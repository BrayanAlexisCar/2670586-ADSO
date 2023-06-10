import java.util.Scanner;

public class Ejercicio05{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


    int num1;
    int num2;
    int num3;


        System.out.println("Ingrese el primer número: ");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número: ");
        num2 = entrada.nextInt();

        System.out.println("Ingrese el tercer número: ");
        num3 = entrada.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Los números se ingresaron en Orden Ascendente.");
        } else {
            System.out.println("Los números NO se ingresaron en Orden Ascendente.");
        }
    }
    

    }


