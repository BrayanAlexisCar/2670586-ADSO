import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese las horas trabajadas:");
    int horastrabajadas = scanner.nextInt();

    System.out.println("Ingrese la tarifa por hora: ");
    double tarifahora = scanner.nextDouble();
    
    double salariosemanal;
    int horasExtras = 0;
    
    if(horastrabajadas <=40){
        salariosemanal = horastrabajadas * tarifahora;
       
        System.out.println("El salario semanal del empleado es: " + salariosemanal);

    } if(horastrabajadas >40){

        horasExtras = horastrabajadas - 40;
        salariosemanal = (40 * tarifahora) + (horasExtras * (tarifahora * 1.5));
       
        System.out.println("El salario semanal del empleado es: " + salariosemanal);
    } 

    }
   

   }
    

        
    


    



    
    

 