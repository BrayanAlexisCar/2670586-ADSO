import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        

        System.out.print("diga el primer número:");
        int numero1 = entrada.nextInt();

        System.out.print("diga el segundo número:");
        int numero2 = entrada.nextInt();

        System.out.print("diga el tercer número:");
        int numero3 = entrada.nextInt();


            int mayor = numero1;
        if ( numero1 > mayor ){
            mayor = numero1;
            
        }

        int menor = numero2;
        if ( numero2 < menor){
            menor = numero2;
        }


       
        if ( numero3 > mayor ){
            mayor = numero3;
            
        }

        if ( numero3 > menor ){
            menor = numero3;
            
        }


        System.out.println("el numero mayor es:" +mayor);
        System.out.println("el numero menor es:" +menor);

    }
}
