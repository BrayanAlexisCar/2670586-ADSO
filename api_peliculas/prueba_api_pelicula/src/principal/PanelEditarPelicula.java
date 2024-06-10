
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;


public class PanelEditarPelicula extends javax.swing.JPanel {

    ConsumoAPI consumoapi;
    public PanelEditarPelicula( ConsumoAPI consumoapi) {
       this.consumoapi = consumoapi;
        initComponents();
        
        campo_nombre.setEnabled(false);
        campo_director.setEnabled(false);
        campo_anio.setEnabled(false);
        campo_sinopsis.setEnabled(false);
        campo_categoria.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        campo_id_pelicula = new javax.swing.JTextField();
        etq_titulo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etq_nombres = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campo_director = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        campo_anio = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campo_sinopsis = new javax.swing.JTextField();
        etq_email = new javax.swing.JLabel();
        campo_categoria = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(102, 153, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("PANEL EDITAR");

        etq_cedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula.setText("id pelicula:");

        btn_buscar.setBackground(new java.awt.Color(204, 153, 255));
        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_titulo2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        etq_titulo2.setText("Ingrese la pelicula que quiere editar:");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        etq_nombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombres.setText("Nombre:");

        etq_apellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_apellidos.setText("Director:");

        etq_direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_direccion.setText("Año:");

        etq_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_telefono.setText("Sinopsis:");

        etq_email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_email.setText("id categoria:");

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
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_direccion)
                                    .addComponent(etq_apellidos)
                                    .addComponent(etq_nombres)))
                            .addComponent(etq_telefono))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_anio, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(campo_director, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(campo_sinopsis, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(campo_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(campo_nombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_director, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(campo_sinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_email)
                    .addComponent(campo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
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
                        .addComponent(campo_id_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(etq_titulo2)))
                .addGap(0, 98, Short.MAX_VALUE))
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
                    .addComponent(campo_id_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_cedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        String id_pelicula = campo_id_pelicula.getText();
        String nombre = campo_nombre.getText();
        String director = campo_director.getText();
        String anio = campo_anio.getText();
        String sinopsis = campo_sinopsis.getText();
        String id_categoria = campo_categoria.getText();

        if (id_pelicula.isEmpty() || nombre.isEmpty() || director.isEmpty() || anio.isEmpty() || sinopsis.isEmpty() || id_categoria.isEmpty()) {
            // Mostrar un mensaje de alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");
        } else {

            Map<String, String> datosActualizar = new HashMap<>();
            datosActualizar.put("id_pelicula", id_pelicula); 
            datosActualizar.put("nombre", nombre);
            datosActualizar.put("director", director);
            datosActualizar.put("anio", anio);
            datosActualizar.put("sinopsis", sinopsis);
            datosActualizar.put("id_categoria", id_categoria);
            
            String respuesta02 = consumoapi.consumoPOST("http://localhost/api_peliculas/API/actualizarpelicula.php", datosActualizar);
               System.out.println(respuesta02);
               
              JsonObject respuesta_estado = JsonParser.parseString(respuesta02).getAsJsonObject();
             boolean status = respuesta_estado.get("status").getAsBoolean();
            
            
            if(status){
                  Alerta ventana = new Alerta("EXITO AL ACTUALIZAR LA PELICULA.");
            
            }else{
                    Alerta ventana = new Alerta("algo salio mal al actualizar la pelicula.");
            }
        }
        
        
        campo_id_pelicula.setText("");
        campo_nombre.setText("");
        campo_director.setText("");
        campo_anio.setText("");
        campo_sinopsis.setText("");
        campo_categoria.setText("");
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
      
      
        String id_pelicula = campo_id_pelicula.getText();
       
        buscarpelicula(id_pelicula);
       
    }//GEN-LAST:event_btn_buscarActionPerformed

   
     public void buscarpelicula(String id_pelicula){
         
        String respuesta01 = consumoapi.consumoGET("http://localhost/api_peliculaS/API/obtenerpelicula.php");
        
        
        boolean encontrado = false;
        
        
        
        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        for (int i = 0; i < registros.size(); i++) {
             JsonObject temp = registros.get(i).getAsJsonObject();
            if (temp.get("id_pelicula").getAsString().equals(id_pelicula)) {
          
            
                campo_nombre.setEnabled(true);
                campo_director.setEnabled(true);
                campo_anio.setEnabled(true);
                campo_sinopsis.setEnabled(true);
                campo_categoria.setEnabled(true);
          
                
                campo_nombre.setText(temp.get("nombre").getAsString());
                campo_director.setText(temp.get("director").getAsString());
                campo_anio.setText(temp.get("anio").getAsString());
                campo_sinopsis.setText(temp.get("sinopsis").getAsString());
                campo_categoria.setText(temp.get("id_categoria").getAsString());
                System.out.println(campo_id_pelicula);
                 
               
                
            }
          
        }

        if(encontrado){
             Alerta ventana = new Alerta("ESA PELICULA NO SE ENCUENTRA");
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JTextField campo_anio;
    private javax.swing.JTextField campo_categoria;
    private javax.swing.JTextField campo_director;
    private javax.swing.JTextField campo_id_pelicula;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_sinopsis;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
