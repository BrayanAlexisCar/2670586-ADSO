
package principal;

import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;

public class Principal {

    
    public static void main(String[] args) {
        ConsumoAPI consumo = new ConsumoAPI();
        Menu menu = new Menu();
        
      
      //endopoint obtener PELICULA
      //String respuesta01 = consumo.consumoGET("http://localhost/api_peliculaS/API/obtenerpelicula.php");
      //System.out.println("respuesta obtener:" +respuesta01);
      
       //endopoint obtener CATEGORIA
       //String respuesta001 = consumo.consumoGET("http://localhost/api_peliculaS/API/obtenercategoria.php");
      //System.out.println("respuesta obtener:" +respuesta001);
      
      
      
      
      
      
      //endopoint insertar PELICULA
      //Map<String, String> datosInsertar = new HashMap<>();
      //datosInsertar.put("nombre", "pelicula desde java");
      //datosInsertar.put("director", "brayan");
      //datosInsertar.put("anio", "2021");
      //datosInsertar.put("sinopsis", "holaaaaaaa");
      //datosInsertar.put("id_categoria", "3");
   
               
      //String respuesta02 = consumo.consumoPOST("http://localhost/api_peliculaS/API/insertarpelicula.php", datosInsertar);
     //System.out.println("respuesta insertar:" +respuesta02);
     
     
     
     
      //endopoint insertar CATEGORIA
      //Map<String, String> datosInsertarcategoria = new HashMap<>();
      //datosInsertarcategoria.put("nombre", "categoria desde netbeans");
      
   
               
      //String respuesta02 = consumo.consumoPOST("http://localhost/api_peliculaS/API/insertarcategoria.php", datosInsertarcategoria);
      //System.out.println("respuesta insertar:" +respuesta02);
      
      
      
      
      //endopoint actualizar PELICULA
     //Map<String, String> datosActualizar = new HashMap<>();
      //datosActualizar.put("nombre", "pelicula desde java");
      
      //datosActualizar.put("director", "brayan actualizado");
      //datosActualizar.put("anio", "123123");
      // datosActualizar.put("sinopsis", "probando actualizar");
      //datosActualizar.put("id_categoria", "3");
        
               
     // String respuesta03 = consumo.consumoPOST("http://localhost/api_peliculaS/API/actualizarpelicula.php", datosActualizar);
      //System.out.println("respuesta actualizar:" +respuesta03);
      
      
      
      
      
      
      //endopoint actualizar CATEGORIA
     //Map<String, String> datosActualizar = new HashMap<>();
      //datosActualizar.put("id_categoria", "4");
      // datosActualizar.put("nombre", "categoria actualizada");
     
               
     //String respuesta03 = consumo.consumoPOST("http://localhost/api_peliculaS/API/actualizarcategoria.php", datosActualizar);
     //System.out.println("respuesta actualizar:" +respuesta03);
      
      
      
      
      
      
      
       
      //endopoint eliminar PELICULA
      //Map<String, String> datosEliminar = new HashMap<>();
      //datosEliminar.put("nombre", "pelicula desde java");
     //
      //String respuesta04 = consumo.consumoPOST("http://localhost/api_peliculaS/API/eliminarpelicula.php", datosEliminar);
      //System.out.println("respuesta eliminar:" +respuesta04);
      //
      
      
      
      //endopoint eliminar CATEGORIA
      //Map<String, String> datosEliminar = new HashMap<>();
      //datosEliminar.put("nombre", "categoria actualizada");
     
      //String respuesta04 = consumo.consumoPOST("http://localhost/api_peliculaS/API/eliminarcategoria.php", datosEliminar);
      //System.out.println("respuesta eliminar:" +respuesta04);
      
      
      
       
      
      
    }
    
}
