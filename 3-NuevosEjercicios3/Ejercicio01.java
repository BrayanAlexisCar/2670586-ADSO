import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
       System.out.println("ingrese un numero: ");
       int numero = entrada.nextInt();

       if (numero<0){
       System.out.print("el numero es negativo");

       }else if(numero>0){
        System.out.print("el numero es positivo");

       }

    

}


}