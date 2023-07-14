import java.util.Scanner;

public class Ejercicio03 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese un número: ");
      int numero = scanner.nextInt();
      System.out.println("Primos aleatorios:");

      int primos = 0;
      int cont = 1;

      while (primos < numero) {
         int random = (int) (Math.random() * 99) + 1;
         int divisores = 0;

         for (int divisor = 1; divisor <= random; divisor++) {
            if (random % divisor == 0) {
               divisores++;
            }
         }

         if (divisores == 2) {
            primos++;
            System.out.println("Primo " + primos + " Generado -> " + random);
         }
         cont++;
      }
   }
}
