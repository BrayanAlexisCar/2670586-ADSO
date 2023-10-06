public class Ejercicio03{


    public static void main(String[]args){

        System.out.println("FUNCIONES MULTIPLICAR");

        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES:" +multiplicacion(5, 8));
        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES:" +multiplicacion(7, 610));
        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES:" +multiplicacion(8, 4));
        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES:" +multiplicacion(2, 24));
        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES:" +multiplicacion(-3, 7));;
       


        }


         public static int multiplicacion(int a, int b){
            int resultado = (a * b); // parentesis para saber que es una operacion
    
                return resultado;
    
        }




}
