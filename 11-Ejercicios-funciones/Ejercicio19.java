public class Ejercicio19 {
    public static void main(String[]args){


        double numero1 = 12.4;
        area(numero1);

        
        double numero2 = 5.3;
        area(numero2);

        
        double numero3 = 93.4;
        area(numero3);

        
        double numero4 = 12.32;
        area(numero4);

        
        double numero5 = 1.54;
        area(numero5);


      
       


    }


    public static void area(double radio){
      
        double  pi = 3.1416;
        double area = pi*(radio * radio);
      
      
        System.out.println("el area del ciruclo es: " + area );

    }


}
