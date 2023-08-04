import java.util.Scanner;

public class Ejercicio02 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese un número: ");
      int numero = scanner.nextInt();

      int primo [] = new int [numero];

     
      int num = 2;
      int cont = 0;
       

      while (cont < numero) {
          int divisores = 0;
         for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
               divisores++;
                
            }
         }
         if ( divisores == 2){
           primo[cont] = num;
          cont++;
         }
         num++;

   }
   System.out.println("primo:");
    for(int i =0; i <=numero; i++){
   System.out.println(primo[i]+ " ");
    }

   }
   }
        
  





  
    


