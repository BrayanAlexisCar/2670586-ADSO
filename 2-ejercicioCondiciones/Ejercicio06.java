   
 import java.util.Scanner;

 public class Ejercicio06 {
 
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
 
         System.out.print("Ingresar un número de 6 dígitos: ");
         int numero = entrada.nextInt();
 
         System.out.println("//------------------------------//");
         System.out.println("Menú:");
         System.out.println("1. Primer Digito.");
         System.out.println("2. Segundo Digito.");
         System.out.println("3. Tercer Digito.");
         System.out.println("4. Cuarto Digito.");
         System.out.println("5. Quinto Digito.");
         System.out.println("6. Sexto Digito.");
         System.out.println("//-----------------------------//");
 
         System.out.print("Ingrese una opción: ");
         int opcion = entrada.nextInt();
 
         int digito;
 
         if (opcion == 1) {
             digito = numero / 100000;
             System.out.println("El primer dígito es: " + digito);
         } else if (opcion == 2) {
             digito = (numero / 10000) % 10;
             System.out.println("El segundo dígito es: " + digito);
         } else if (opcion == 3) {
             digito = (numero / 1000) % 10;
             System.out.println("El tercer dígito es: " + digito);
         } else if (opcion == 4) {
             digito = (numero / 100) % 10;
             System.out.println("El cuarto dígito es: " + digito);
         } else if (opcion == 5) {
             digito = (numero / 10) % 10;
             System.out.println("El quinto dígito es: " + digito);
         } else if (opcion == 6) {
             digito = numero % 10;
             System.out.println("El sexto dígito es: " + digito);
         }
     }
 }
 



