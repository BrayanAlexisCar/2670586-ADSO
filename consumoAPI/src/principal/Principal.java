
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import util.ConsumoAPI;

public class Principal {

    public static void main(String[] args) {
        
      //instancia para realizar consumos
        Menu ventana = new Menu();
      
      ConsumoAPI consumo = new ConsumoAPI();
        
      
      //endopoint obtener
      //String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
      //System.out.println("respuesta obtener:" +respuesta01);
      
      
      
      //endopoint insertar
      //Map<String, String> datosInsertar = new HashMap<>();
      //datosInsertar.put("cedula", "1089097");
      //datosInsertar.put("nombres", "brayan");
      //datosInsertar.put("apellidos", "alexis");
      //datosInsertar.put("telefono", "23434");
      //datosInsertar.put("direccion", "calle 20");
      //datosInsertar.put("email", "alexis@gmail");
               
     // String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
      //System.out.println("respuesta insertar:" +respuesta02);
      
      
      //endopoint actualizar
      //Map<String, String> datosActualizar = new HashMap<>();
      //datosActualizar.put("cedula", "1089097");
      //datosActualizar.put("nombres", "brayan actualizado");
      //datosActualizar.put("apellidos", "alexis actualizado hola alejo");
      //datosActualizar.put("telefono", "334324");
      //datosActualizar.put("direccion", "calle 1");
      //datosActualizar.put("email", "alexis@gmail");
               
      //String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
      //System.out.println("respuesta actualizar:" +respuesta03);
      
       
      //endopoint eliminar
     // Map<String, String> datosEliminar = new HashMap<>();
      //datosEliminar.put("cedula", "1089097");
     
      //String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
      //System.out.println("respuesta eliminar:" +respuesta04);
      
      
        //JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        //for (int i = 0; i < registros.size(); i++) {
        //    JsonObject temp = registros.get(i).getAsJsonObject();
        //    
        //    String nombres = temp.get("nombres").getAsString();
        //    String apellidos = temp.get("apellidos").getAsString();
        //   
        //       
        //    
        //    System.out.println(nombres + ", "+ apellidos);
            
        //}
      
      
      
      
        
    }
    
}
