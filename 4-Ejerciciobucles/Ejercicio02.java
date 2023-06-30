import java.util.Scanner;

public class Ejercicio02{
    public static void main (String[]args){

        Scanner entrada = new Scanner (System.in);

        System.out.print (" ingrese la cantidad de notas:");
        int cantidadmaterias = entrada.nextInt();
        
       
        double totalcreditos = 0;
        double sumanotaporcredito = 0;
        

       for(int contador = 1; contador <= cantidadmaterias; contador++ ){    
           System.out.println (" ingrese la nota de la materia:");
           double nota = entrada.nextDouble();

        System.out.println ( "inrese la cantidad de creditos");
        int creditos = entrada.nextInt();

        totalcreditos = totalcreditos + creditos;

        sumanotaporcredito = sumanotaporcredito + (nota*creditos);


    }

    double promedio = sumanotaporcredito / totalcreditos;
      System.out.println ( "total de creditos:"+totalcreditos);
      System.out.println ( "promedio del semestre :"+promedio);
   }

}
   
        
      
      
        

    

       

