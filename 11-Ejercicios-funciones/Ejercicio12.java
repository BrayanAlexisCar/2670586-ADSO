public class Ejercicio12 {
public static void main(String[]args){

        int numero1 = 17;
        boolean primo1 = primo(numero1);

        int numero2 = 3;
        boolean primo2 = primo(numero2);

        int numero3 = 8;
        boolean primo3 = primo(numero3);

        int numero4 = 37;
        boolean primo4 = primo(numero4);

        int numero5 = 4;
        boolean primo5 = primo(numero5);

        

    }


    public static boolean primo(int numero){
        int divisores = 0;

        for (int i = 2; i < numero; i++) {

            if(numero % i==0) {
               divisores++;
            }
            
        }
    
        if (divisores == 0) {
            System.out.println("el numero "+ numero+ " es primo");
            return true;
        }else{
              System.out.println(numero + " no es primo");
              return false;
        }

        }

    
}
