public class Ejercicio22 {
    public static void main(String[]args){



     
        int []numero1 = generarprimos(7);
        imprimirnumero(numero1);

        int [] numero2 = generarprimos(9);
        imprimirnumero(numero2);
        int [] numero3 = generarprimos(23);
        imprimirnumero(numero3);
        int [] numero4 = generarprimos(34);
        imprimirnumero(numero4);
        int [] numero5 = generarprimos(45);
        imprimirnumero(numero5);
      

    }


     public static int[] generarprimos(int numero){

        int arreglo [] = new int [numero];
        int contador = 0;
        for (int i = 2; contador < arreglo.length; i++) {
             if(primo(i)) {
             arreglo[contador] = i;
             contador++;
             
            }
             
        }
        return arreglo;
      
    }


    public static boolean primo(int numero){

        int divisores = 0;
        for (int i = 2; i < numero; i++) {

            if(numero % i==0) {
               divisores++;
            }
            
        }
    
        if (divisores == 0) {           
            return true;
        }else{         
              return false;
        }

    }


    public static void imprimirnumero(int [] numeros){
    System.out.println(" primos generados: " );
        
        for (int i = 0; i < numeros.length; i++) {
             System.out.print(numeros[i] + ", ");
           
            
        }
        System.out.println();
    

    }
        


   


}
