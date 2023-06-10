import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su edad estimado usuario:");
        int edad = scanner.nextInt();

        if(edad >=18 ){
            System.out.println("usted puede votar");

        }else  System.out.println("usted no puede votar");
            

}


}