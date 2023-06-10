import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("INGRESE EL PRIMER NUMERO:");
        int n1 = scanner.nextInt();

        System.out.println("INGRESE EL SEGUNDO NUMERO:");
        int n2 = scanner.nextInt();

        System.out.println("INGRESE EL TERCER NUMERO:");
        int n3 = scanner.nextInt();

        System.out.println("INGRESE EL CUARTO NUMERO:");
        int n4 = scanner.nextInt();
        
        int maximo = n1;

       if( n2 > maximo){
            maximo = n2;
       }
    
       if( n3 > maximo){
        maximo = n3;
       }

       if( n4 > maximo){
            maximo = n4;
       }

       System.out.print("el numero maximo es:" + maximo);
 }
 

 }