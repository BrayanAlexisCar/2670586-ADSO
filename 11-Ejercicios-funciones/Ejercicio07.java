public class Ejercicio07{


    public static void main(String[]args){

        

        int arreglo1 [] = arreglos(6);
        mostrar(arreglo1);

        int arreglo2 [] = arreglos(2);
        mostrar(arreglo2);

         int arreglo3 [] = arreglos(4);
        mostrar(arreglo3);

         int arreglo4 [] = arreglos(10);
        mostrar(arreglo4);

         int arreglo5 [] = arreglos(14);
        mostrar(arreglo5);
         
      
       


    }


    public static int[] arreglos(int tamano){
        
        int[] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++) { 
         int aleatorio = (int)(Math.random()*100);
         arreglo[i] = aleatorio;
        
    
       
        }
       

        return arreglo; 
 
     }

  
     public static void mostrar(int [] arreglo){
       System.out.println(" arreglo: ");

         for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " , ");
         
            
    
        }
          System.out.println();

 
     }




}