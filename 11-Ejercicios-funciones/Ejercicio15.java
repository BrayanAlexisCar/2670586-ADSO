public class Ejercicio15 {
    public static void main(String[]args){


        int numero1 = 4;
        fibonacci(numero1);

        
        int numero2 = 5;
        fibonacci(numero2);

        
        int numero3 = 9;
        fibonacci(numero3);

        
        int numero4 = 12;
        fibonacci(numero4);

        
        int numero5 = 15;
        fibonacci(numero5);


      
       


    }


    public static int fibonacci(int posicion){
        int a = 0;
        int b = 1;
        int resultado;

        int i = 1;

    while (i < posicion){
        resultado = a + b;
        a = b;
        b = resultado;
        i = i + 1;
 
    }
        System.out.println("El " +posicion+"-enesimo termino Fibonacci es:" + b );
        System.out.println();
        return 0;   


}


}
