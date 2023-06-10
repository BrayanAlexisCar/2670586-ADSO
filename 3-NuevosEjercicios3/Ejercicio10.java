import java.util.Scanner;

public class Ejercicio10{

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su dia de nacimiento:");
    int dia = scanner.nextInt();
    
    System.out.println("Ingrese su mes de nacimietno:");
    int mes = scanner.nextInt();
    
    System.out.println("Ingrese su ano de nacimiento:");
    int ano = scanner.nextInt();

    int anoactual = 2023; 

    
    
    if (anoactual - ano >=18) {
        System.out.print("Usted es mayor de edad");
    } else {
        System.out.print("Usted es menor de edad");
    }
        
        
      
}


}
