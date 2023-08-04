import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la ciudad origen: ");
        String ciudadOrigen = scanner.nextLine();

        System.out.print("Ingrese la cantidad de paradas: ");
        int cantidadParadas = scanner.nextInt();
        scanner.nextLine();

        double distanciaTotal = 0.0;
        String ciudadActual = ciudadOrigen;

        for (int i = 0; i < cantidadParadas; i++) {
            System.out.print("Ingrese la ciudad de la parada " +  (i+1)+ ":") ;
            String ciudadParada = scanner.nextLine();
            

 
        
        }

      
  
    }
}
