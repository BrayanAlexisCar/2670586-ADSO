import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros;
        double suma ;
        double promedio;
        double numero;
        
        System.out.print("Ingrese la cantidad de números: ");
      cantidadNumeros = scanner.nextInt();
        
         suma = 0;


        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número:" );
            numero = scanner.nextDouble();
            suma += numero;
        }
        
         promedio = suma / cantidadNumeros;
        System.out.println("El promedio de los números ingresados es: " + promedio);
        
        
    }
}

