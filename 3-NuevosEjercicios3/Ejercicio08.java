import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la base del triangulo:");
    double base = scanner.nextInt();
    
    System.out.println("Ingrese la base del triangulo:");
    double altura = scanner.nextInt();

        if( base >=0 && altura >=0 ){
            double area = base * altura/2;
            System.out.println("el area del traingulo es:" + area);

        }else  System.out.println("los valores tienen que ser positivos para calcular el area");

        
        
        
      
}


}