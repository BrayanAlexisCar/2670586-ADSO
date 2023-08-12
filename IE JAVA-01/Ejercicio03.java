import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese un número para el tamaño: ");
        int tamano = scanner.nextInt();

        int[] array = new int[tamano];
        int[] arregloafectado = new int[tamano];

        System.out.println("ingrese la cantidad de bombas: ");
        int cantidadBombas = scanner.nextInt();

        for (int i = 0; i < cantidadBombas; i++) {
            int bomba = 1;

            while (array[bomba] == 1) {
                bomba = (int) (Math.random() * tamano);
            }

            array[bomba] = 1;

        }

        System.out.println("areglo de bombas:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        System.out.println("area afectada:");

        for( int i = 0; i < array.length; i++){
            if(array[i] == 1){
                int izquierda = i - 1;
                int derecha = i + 1;

                 if( izquierda < 0){
                    izquierda = 0;
                }
                if( derecha > tamano){
                    derecha = tamano -1;
                }
            for( int a = izquierda; a <= derecha; a++){
                     if (a != i) {
                        if (arregloafectado[a] != 1) {
                            arregloafectado[a] = 2;
                        }
                       
                    } else {
                        arregloafectado[a] = 1;
                    }
                 
                }

            }

        }
         for (int i = 0; i < arregloafectado.length; i++) {
          
            System.out.print(arregloafectado[i] + " ");
        }
        System.out.println();
        



    }
}
