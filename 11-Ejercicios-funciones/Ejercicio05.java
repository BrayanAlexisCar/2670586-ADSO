public class Ejercicio05{


    public static void main(String[]args){

        System.out.println("FUNCIONES POTENCIA");

        System.out.println("EL RESULTADO DE LA POTENCIA ES:" +potencia(2, 5));
        System.out.println("EL RESULTADO DE LA POTENCIA ES:" +potencia(7, 10));
        System.out.println("EL RESULTADO DE LA POTENCIA ES:" +potencia(6, 4));
        System.out.println("EL RESULTADO DE LA POTENCIA ES:" +potencia(-4, 24));
        System.out.println("EL RESULTADO DE LA POTENCIA ES:" +potencia(30, 13));;
       


        }


         public static int potencia(int a, int b){


            int resultado = a;
           for (int i = 1; i <= b; i++) {
                resultado = resultado * a;
            
           }
           return resultado;
    
        }




}