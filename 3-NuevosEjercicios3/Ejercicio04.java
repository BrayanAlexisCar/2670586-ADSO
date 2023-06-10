import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 notas:");
       
        System.out.print("Ingrese la primera nota: ");
         float n1 = scanner.nextInt();

         System.out.print("Ingrese la segunda nota: ");
          float n2 = scanner.nextInt();
         
         System.out.print("Ingrese la tercera nota: ");
         float n3 = scanner.nextInt();


         float promedio=(n1 + n2 + n3)/3;
         System.out.println("el promedio es:" +promedio);


          if(promedio >=7){
            System.out.print("usted aprobo ");

          }else if(promedio<7)
          System.out.print("usted desaprobo ");

        
    }

 }

    

