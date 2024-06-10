
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;


public class PanelEditarCategoria extends javax.swing.JPanel {

    ConsumoAPI consumoapi;
    public PanelEditarCategoria( ConsumoAPI consumoapi) {
       this.consumoapi = consumoapi;
        initComponents();
        
        campo_nombre.setEnabled(false);
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        campo_id_categoria = new javax.swing.JTextField();
        etq_titulo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etq_nombres = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(102, 153, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("PANEL EDITAR");

        etq_cedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula.setText("id categoria:");

        btn_buscar.setBackground(new java.awt.Color(204, 153, 255));
        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_titulo2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        etq_titulo2.setText("Ingrese la categoria que quiere editar:");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        etq_nombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombres.setText("Nombre:");

        btn_editar.setBackground(new java.awt.Color(255, 102, 102));
        btn_editar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(etq_nombres)
                        .addGap(18, 18, 18)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_nombres))
                .addGap(78, 78, 78)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(etq_cedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_id_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(etq_titulo2)))
                .addGap(0, 84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(campo_id_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_cedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        String id_categoria = campo_id_categoria.getText();
        String nombre = campo_nombre.getText();
       

        if (id_categoria.isEmpty() || nombre.isEmpty() ) {
            // Mostrar un mensaje de alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");
        } else {

            Map<String, String> datosActualizar = new HashMap<>();
            datosActualizar.put("id_categoria", id_categoria); 
            datosActualizar.put("nombre", nombre);
        
            
            String respuesta02 = consumoapi.consumoPOST("http://localhost/api_peliculas/API/actualizarcategoria.php", datosActualizar);
               System.out.println(respuesta02);
               
              JsonObject respuesta_estado = JsonParser.parseString(respuesta02).getAsJsonObject();
             boolean status = respuesta_estado.get("status").getAsBoolean();
            
            
            if(status){
                  Alerta ventana = new Alerta("EXITO AL ACTUALIZAR LA CATEGORIA.");
            
            }else{
                    Alerta ventana = new Alerta("algo salio mal al actualizar la categoria.");
            }
        }
        
        
        campo_id_categoria.setText("");
        campo_nombre.setText("");
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
      
      
        String id_categoria = campo_id_categoria.getText();
       
        buscarcategoria(id_categoria);
       
    }//GEN-LAST:event_btn_buscarActionPerformed

   
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
    private javax.swing.JButton btn_editar;
    private javax.swing.JTextField campo_id_categoria;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
