public class Ejercicio14 {
    public static void main(String[]args){


      int []  arreglo1 = {9, 3, 4, 6, 9, 6};
      boolean ordenado1 = ordenado(arreglo1);

      int []  arreglo2 = {1,2,4,8,9, 16};
      boolean ordenado2 = ordenado(arreglo2);

      int []  arreglo3 = {9,2,5,9,23,43,1};
      boolean ordenado3 = ordenado(arreglo3);

      int []  arreglo4 = {5,6,9,12,23,43};
      boolean ordenado4 = ordenado(arreglo4);

      int []  arreglo5 = {34,6,78,453,34,67,887,2,3};
      boolean ordenado5 = ordenado(arreglo5);

    
       
       


    }


    public static boolean ordenado(int [] arreglo){
       
        for (int i = 1; i < arreglo.length; i++) {
            if(arreglo[i] < arreglo[i-1]){
                
                System.out.println("el arreglo  no esta ordenado de forma ascendente ");
                return false;
            }
            
        }  
        System.out.println("El arreglo esta ordenado de forma ascendente.");
        return true;
    
       

    }
   


}
