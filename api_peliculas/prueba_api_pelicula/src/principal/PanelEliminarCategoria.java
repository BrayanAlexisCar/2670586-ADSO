
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;


public class PanelEliminarCategoria extends javax.swing.JPanel {

    ConsumoAPI consumoapi;
    public PanelEliminarCategoria(ConsumoAPI consumoapi) {
        this.consumoapi = consumoapi;
        initComponents();
        
        campo_nombre.setEnabled(false);
       
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_titulo3 = new javax.swing.JLabel();
        etq_cedula1 = new javax.swing.JLabel();
        campo_id_categoria = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        campo_nombre = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        etq_cedula2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        etq_titulo.setBackground(new java.awt.Color(255, 51, 102));
        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("PANEL ELIMINAR");

        etq_titulo3.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        etq_titulo3.setText("Ingrese la categoria que quiere borrar:");

        etq_cedula1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula1.setText("Nombre:");

        btn_buscar.setBackground(new java.awt.Color(153, 0, 153));
        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        campo_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        etq_cedula2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula2.setText("id categoria:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(etq_titulo3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etq_cedula1)
                            .addComponent(etq_cedula2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(campo_id_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btn_buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btn_eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_id_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(etq_cedula2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_cedula1))
                .addGap(54, 54, 54)
                .addComponent(btn_eliminar)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       String id_categoria = campo_id_categoria.getText();
        
        buscarcategoria(id_categoria);
    
    
        
      
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        String id_categoria = campo_id_categoria.getText();
        String nombre = campo_nombre.getText();
   

        if (id_categoria.isEmpty() || nombre.isEmpty()) {
            // Mostrar un mensaje de alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");
        } else {

            Map<String, String> datosEliminar= new HashMap<>();
         
            datosEliminar.put("id_categoria", id_categoria);
            datosEliminar.put("nombre", nombre);
           
            String respuesta03 = consumoapi.consumoPOST("http://localhost/api_peliculaS/API/eliminarcategoria.php", datosEliminar);
            System.out.println(respuesta03);
            
            
             JsonObject respuesta_estado = JsonParser.parseString(respuesta03).getAsJsonObject();
             boolean status = respuesta_estado.get("status").getAsBoolean();
            
            
            if(status){
                  Alerta ventana = new Alerta("EXITO AL ELIMINAR LA CATEGORIA.");
            
            }else{
                    Alerta ventana = new Alerta("algo salio mal al eliminar la categoria.");
            }
        }
        
        
        campo_id_categoria.setText("");
        campo_nombre.setText("");
        
    }//GEN-LAST:event_btn_eliminarActionPerformed


    
   
     public void buscarcategoria(String id_categoria){
        String respuesta01 = consumoapi.consumoGET("http://localhost/api_peliculaS/API/obtenercategoria.php");
        
        
        boolean encontrado = false;
        
        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        for (int i = 0; i < registros.size(); i++) {
             JsonObject temp = registros.get(i).getAsJsonObject();
            if (temp.get("id_categoria").getAsString().equals(id_categoria)) {
          
            
                campo_nombre.setEnabled(true);
                
          
                campo_nombre.setText(temp.get("nombre").getAsString());
               
           
                
            }
          
        }

        if(encontrado){
             Alerta ventana = new Alerta("ESA CATEGORIA NO SE ENCUENTRA");
        }
    
    }
     
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField campo_id_categoria;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel etq_cedula1;
    private javax.swing.JLabel etq_cedula2;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo3;
    // End of variables declaration//GEN-END:variables
}
