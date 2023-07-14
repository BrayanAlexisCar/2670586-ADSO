import java.util.Scanner;

public class Ejercicio01{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);


        System.out.print("ingrese un numero emntre 1 y 6: ");
        int numero = Entrada.nextInt();

        int numeroFinal = 0;
        int contador = 1;
          while(contador <= numero){
             int random = (int) (Math.random() * 10) + 1;
             numeroFinal = numeroFinal *10 + random;
         
                     
            contador++;
      }
       
        int resultadoproducto = numeroFinal*2;

        System.out.println("el numero construido es: " +numeroFinal);
        System.out.println("el resultado del producto es :" +resultadoproducto);

      }

}