
package principal;


public class Principal {
    public static void main(String arg[]){
        
        BaseDatos basedatos = new BaseDatos();
        
        Menu menu = new Menu();
        //basedatos.imprmirPersonas();
        
        
        
        basedatos.insertarPersona("100023", "brayan", "alexis", "mz 1 cs 1", "321232321", "alexos@gmail.com");
        basedatos.actualizarPersona("100023", "miguel ", "mora", "mz 1 cs 1", "321232321", "alexos@gmail.com");
        basedatos.eliminarPersona("100023");
        
       // Persona listado[] = basedatos.extraerPersonas();
       // //for (int i = 0; i < listado.length && listado[i] != null; i++) {
        //    System.out.println("--" +listado[i].getNombres()+" "+listado[i].getApellidos());
       //     
        //}
        
       
    }
}
//