import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
        Scanner leer_numero = new Scanner(System.in);
        Scanner leer_texto = new Scanner(System.in);

    
        Perro [] listado = new Perro [20];    


        listado[0] = new Perro("Felipe", "Brayan", 4, "bmw", 10, 90);
        listado[1] = new Perro("manchas", "albeiro", 8, "chihuahua", 4, 95);


    
        listado[0].comer(500);
        listado[1].dormir(1);

        listado[0].hacercaca(400);
        //System.out.println("ingrese el nombre del perro");
        //String nombre = leer_texto.nextLine();
//
//
        //System.out.println("ingrese el nombre del Propietario");b z n
        //String propietario = leer_texto.nextLine();
//
        //
        //System.out.println("ingrese la edad de la mascota  ");
        //int edad = leer_numero.nextInt();
//
        //System.out.println("ingrese la raza");
        //String raza = leer_texto.nextLine();
//
//
        //System.out.println("ingrese el peso de la mascota ");
        //double peso = leer_numero.nextInt();
//
        //System.out.println("ingrese en nivel de energia");
        //double energia = leer_numero.nextInt();


        //listado[2] =  new Perro(nombre, propietario, edad, raza, peso, edad);

        

        for (int i = 0; i < listado.length; i++) {
                if (listado[i] != null) {
                   listado[i].imprimirDetalle();
                }                           
        }


        //perro mas pesado

        Perro mas_pesado = listado[0];
             for (int i = 0; i < listado.length; i++) {
                 if (listado[i] != null) {
                    if ( listado[i].getPeso() >= mas_pesado.getPeso() ) {
                        mas_pesado = listado[i];
                    }
                    
                }     
        }
        if (mas_pesado != null) {
            
                System.out.println("nombre mas pesado: " +mas_pesado.getNombre());
                System.out.println("propietario mas pesado: " +mas_pesado.getPropietario());
                System.out.println("peso mas pesado: " +mas_pesado.getPeso());
        }else{

              System.out.println("la lista esta vacia " );
        }
        
    }
}
