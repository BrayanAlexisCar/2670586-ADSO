import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();

        int  raiz = n;
        while ( raiz > 9) {
            int sumaDigitos = 0;
            while ( raiz > 0) {
                int digito =  raiz % 10;
                sumaDigitos += digito;
                 raiz /= 10;
            }
             raiz = sumaDigitos;
        }
        System.out.println("La Raiz Digital de " + n + " es: " +  raiz);
    }
}
