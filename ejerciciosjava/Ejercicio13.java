
import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int segundos;
        int horas;
        int minutos ;
        
        int seg;

        System.out.print("diga el número de segundos:");
         segundos = entrada.nextInt();

         horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        seg = (segundos % 3600) % 60;

        System.out.println("Tiempo equivalente en: " + horas + " horas, " + minutos + " minutos, " + seg + " seg.");
    }
}

        
    

  