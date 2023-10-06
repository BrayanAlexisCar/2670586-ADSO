public class Ejercicio08{


    public static void main(String[]args){

        
    int []  arreglo1 = {1, 3, 4, 6, 9, 6};
    mostrar(arreglo1);

    int []  arreglo2 = {8, 3, 9, 26, 93, 12};
    mostrar(arreglo2);
    int []  arreglo3 = {0, 64, 34, 4, 9, 88};
    mostrar(arreglo3);

    int []  arreglo4 = {12, 33, 45, 623, 39, 23};
    mostrar(arreglo4);

    int []  arreglo5 = {17, 56, 8, 5, 333, 3};
    mostrar(arreglo5);
       
       


    }


    public static void mostrar(int [] arreglo){
        
         
        System.out.println(" contenido de el arreglo: " );
         for (int i = 0; i < arreglo.length; i++) {
           
            System.out.print(arreglo[i] + " , ");
         
            
    
        }
          System.out.println();

 
     }

  
    
       







}