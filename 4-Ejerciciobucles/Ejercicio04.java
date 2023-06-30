import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 3) {
            System.out.println("|------------- Bienvenido ------------|");
            System.out.println("| 1. Docente                           |");
            System.out.println("| 2. Estudiante                        |");
            System.out.println("| 3. Salir                             |");
            System.out.println("|-------------------------------------|");
            System.out.println("Ingrese alguna opción: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.println("Has seleccionado la opción 1: Docente");

                System.out.print("Ingrese la cantidad de notas: ");
                int cantidad = entrada.nextInt();

                double sumanotas = 0;
             int contador = 1;

                while (contador <= cantidad) {
                    System.out.print("Ingrese la nota " + contador + ": ");
                    double nota = entrada.nextDouble();

                    sumanotas = sumanotas + nota;
                    contador = contador + 1;
                }

                double promedio = sumanotas / cantidad;
                System.out.println("El promedio del estudiante es: " + promedio);

            } else if (opcion == 2) {
                System.out.println("Has seleccionado la opción 2: Estudiante");

                System.out.print("Ingrese la cantidad de notas: ");
                int cantidadmaterias = entrada.nextInt();

                double totalcreditos = 0;
               double sumanotaporcredito = 0;

                for (int contador = 1; contador <= cantidadmaterias; contador++) {
                    System.out.print("Ingrese la nota de la materia " + contador + ": ");
                    double nota = entrada.nextDouble();

                  System.out.print("Ingrese la cantidad de créditos: ");
                   int creditos = entrada.nextInt();

                    totalcreditos = totalcreditos + creditos;
                    sumanotaporcredito = sumanotaporcredito + (nota * creditos);
                }

                double promedio = sumanotaporcredito / totalcreditos;
                System.out.println("Total de créditos: " + totalcreditos);
                System.out.println("Promedio del semestre: " + promedio);

            } else if (opcion == 3) {
                System.out.println("usted se salio con exito");
            } 

            System.out.println("-------------------------------------");
        }
    }
}
