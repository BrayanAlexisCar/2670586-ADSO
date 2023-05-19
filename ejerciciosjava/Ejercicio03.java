import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
       

        System.out.println("Ingrese numero 1: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 =  entrada.nextInt();

        int numaux = num1;
        num1 = num2;
        num2 = numaux;

         System.out.println(" númerouno ahora es " + num1 + " y  númerodos ahora es " + num2);

}


}
