public class Ejercicio10 {
     public static void main(String[]args){

        
      double []  arreglo1 = {9, 3, 4, 6, 9, 6};
      promedio(arreglo1);

      double []  arreglo2 = {8,234,5454,23,23, 6};
      promedio(arreglo2);

      double []  arreglo3 = {9,2,5,9,23,43,1};
      promedio(arreglo3);

      double []  arreglo4 = {5,6,2,823,23,4};
      promedio(arreglo4);

      double []  arreglo5 = {34,6,78,453,34,67,887,2,3};
      promedio(arreglo4);

    
       
       


    }


    public static void promedio(double [] arreglo){
        int total  = 0;
        double promedios = 0;

        for (int i = 0; i < arreglo.length; i++) {
            total +=  arreglo[i];
            promedios = total / arreglo[i]; 
          
       

        }
           System.out.println("El total de la suma es " +total);
          System.out.println("El promedio es " +promedios);
         System.out.println();
    }
   



}
