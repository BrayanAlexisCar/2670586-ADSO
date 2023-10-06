public class Ejercicio21 {
    public static void main(String[]args){


      
        double gradoc1 = gradosC(7);
        double gradoc2 = gradosC(9);
        double gradoc3 = gradosC(23);
        double gradoc4 = gradosC(34);
        double gradoc5 = gradosC(45);
      
       


    }


    public static double gradosC(double gradoC){
      
        double gradoorigin = gradoC;

        double gradoF = (gradoC * 9/5) +32;
       
      
        System.out.println(" grados C "+gradoorigin+ " convertido a Fahrenheit es: " +gradoF);
        return gradoF;
      
    

    }


}
