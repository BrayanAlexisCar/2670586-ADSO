import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresar la posición del n-ésimo Fibonacci:");
        int posicion = entrada.nextInt();

       
    int a = 0;
    int b = 1;
    int result;

    int i = 2;

    while (i < posicion){
        result = a + b;
        a = b;
        b = result;
        i = i + 1;
 
   

    }
            System.out.println( " El n-esimo numero Fibonacci es:" + b );

    }
}

