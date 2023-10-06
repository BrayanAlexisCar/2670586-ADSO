public class Ejercicio09 {
     public static void main(String[]args){

        
    int []  arreglo1 = {9, 3, 4, 6, 9, 6};
    encontrarminimo(arreglo1);

    int []  arreglo2 = {8,234,5454,23,23, 6};
    encontrarminimo(arreglo2);

    int []  arreglo3 = {9,2,5,9,23,43,1};
    encontrarminimo(arreglo3);

    int []  arreglo4 = {5,6,2,823,23,4};
    encontrarminimo(arreglo4);

    int []  arreglo5 = {34,6,78,453,34,67,887,2,3};
    encontrarminimo(arreglo4);

    
       
       


    }


    public static void encontrarminimo(int [] arreglo){
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if(arreglo[i] < menor){
                menor = arreglo[i];
            }
           
            

        }
           System.out.println("El número minimo es el " + menor);
 
        

        
       

  
    
    }


}
