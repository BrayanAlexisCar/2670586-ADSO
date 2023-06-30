import java.util.Scanner;

public class Ejercicio01{
    public static void main (String[]args){

        Scanner entrada = new Scanner (System.in);

        System.out.print (" ingrese la cantidad de notas:");
        int cantidad = entrada.nextInt();
        
       
        double sumanotas = 0;
        int contador = 1;

        while( contador<= cantidad){
             System.out.print (" ingrese la nota:"+contador+":");
             double nota = entrada.nextDouble();

             sumanotas = sumanotas + nota;

             contador = contador + 1;
        }

        double promedio = sumanotas / cantidad;
        System.out.println (" el promedio del estuidante es :"+promedio);


      }

}
        
      
        

    

       


       