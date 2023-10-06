public class Ejercicio02{


    public static void main(String[]args){

        System.out.println("FUNCIONES RESTAR");

        System.out.println("EL RESULTADO DE LA RESTA ES:" +resta(10, 8));
        System.out.println("EL RESULTADO DE LA RESTA ES:" +resta(7, 10));
        System.out.println("EL RESULTADO DE LA RESTA ES:" +resta(6, 4));
        System.out.println("EL RESULTADO DE LA RESTA ES:" +resta(-4, 24));
        System.out.println("EL RESULTADO DE LA RESTA ES:" +resta(30, 13));;
       


        }


         public static int resta(int a, int b){
            int resultado = (a - b); // parentesis para saber que es una operacion
    
                return resultado;
    
        }




}