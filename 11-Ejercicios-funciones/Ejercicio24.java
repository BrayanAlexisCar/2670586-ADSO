public class Ejercicio24 {
    public static void main(String[]args){



     
      int []  arreglo1 = {3, 2, 2, 2, 9, 6};
      paresEimpares(arreglo1);

       int []  arreglo2 = {3,3,9,11,9,14, 16};
       paresEimpares(arreglo2);
       int []  arreglo3 = {2,4,8,7,9,13};
       paresEimpares(arreglo3);
       int []  arreglo4 = {7,7,7,7,7,2};
       paresEimpares(arreglo4);
       int []  arreglo5 = {4,4,4,4,4,4};
       paresEimpares(arreglo5);


    
       
       


    }


    public static void paresEimpares(int [] arreglo){
       
        int pares =0;
        int impares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] % 2 == 0){
                pares++;

            }else{
                impares++;
       
            }
            
           
        }  
         System.out.println();
        
         System.out.println("cantidad de pares :" +pares);
        System.out.println("cantidad de impares:" +impares);
        
        
       
      
    
       

    }
        


   


}
