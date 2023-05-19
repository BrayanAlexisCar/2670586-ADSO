import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;


        System.out.print ("imgrese la base del triangulo: ");
        base= entrada.nextDouble();

        System.out.print ("ingrese la altura del triangulo: ");
        altura = entrada.nextDouble();

        area= (base * altura) / 2;

        

        System.out.println("El área del triángulo es " + area);
}


}
