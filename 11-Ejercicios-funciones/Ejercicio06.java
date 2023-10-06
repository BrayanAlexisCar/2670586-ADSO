public class Ejercicio06{


    public static void main(String[]args){

        System.out.println("FUNCIONES VALOR MAXIMO");

        System.out.println("EL valor maximo es :" +valormaximo(10, 8, 23));
        System.out.println("EL valor maximo es :" +valormaximo(45, 2, 23));
        System.out.println("EL valor maximo es :" +valormaximo(1, 9, 2));
        System.out.println("EL valor maximo es :" +valormaximo(8, 6, 33));
        System.out.println("EL valor maximo es :" +valormaximo(40, 5, 2));
       
       


        }


         public static int valormaximo(int a, int b, int c){
            int valormax = 0;
            if(a > b && a > c){
                valormax = a;
            }else if(b > a && b > c){
                 valormax = b;
            }else if( c > a && c > b){
                  valormax = c;
            }
    

            return valormax;
    
        }




}