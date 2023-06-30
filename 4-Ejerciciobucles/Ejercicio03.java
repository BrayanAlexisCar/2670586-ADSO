import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = entrada.nextInt();


        

        for (int i = 1; i <= altura; i++) {
           
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

           
            for (int k = 1; k <= i; k++) {
                System.out.print("X ");
            }

            System.out.println();
        }
    }
}

   


        