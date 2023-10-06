public class Ejercicio13 {
    public static void main(String[]args){


      int []  arreglo1 = {9, 3, 4, 6, 9, 6};
      ordenascendente(arreglo1);

      int []  arreglo2 = {8,234,5454,23,23, 6};
      ordenascendente(arreglo2);

      int []  arreglo3 = {9,2,5,9,23,43,1};
      ordenascendente(arreglo3);

      int []  arreglo4 = {5,6,2,823,23,4};
      ordenascendente(arreglo4);

      int []  arreglo5 = {34,6,78,453,34,67,887,2,3};
      ordenascendente(arreglo5);

    
       
       


    }


   public static void ordenascendente(int[] arreglo) {
    for (int i = 1; i < arreglo.length; i++) {
        for (int a = 0; a < arreglo.length; a++) {
            if (arreglo[a] > arreglo[i]) {
                int auxiliar = arreglo[a];
                arreglo[a] = arreglo[i];
                arreglo[i] = auxiliar;
            }
        }
    }

    System.out.println("orden ascendente:");
    for (int i : arreglo) {
        System.out.print(i +", ");
    }
    System.out.println();
}



}
