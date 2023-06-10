import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la coordenada X:");
        int x = entrada.nextInt();

        System.out.print("Ingrese la coordenada Y:");
        int y = entrada.nextInt();

        int cuadrante = 0;

        if (x > 1 && y > 6) {
            cuadrante = 1;
        } else if (x < -1 && y > -6) {
            cuadrante = 2;
        } else if (x < -1 && y < -6) {
            cuadrante = 3;
        } else if (x > 1 && y < 6) {
            cuadrante = 4;
        }

       
        System.out.println("La coordenada (" + x + ", " + y + ") se encuentra en el cuadrante " + cuadrante);
       
    }
}

    


            

