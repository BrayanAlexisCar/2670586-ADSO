
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;


public class PanelEliminarPelicula extends javax.swing.JPanel {

    ConsumoAPI consumoapi;
    public PanelEliminarPelicula(ConsumoAPI consumoapi) {
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

        etq_titulo = new javax.swing.JLabel();
        etq_titulo3 = new javax.swing.JLabel();
        etq_cedula1 = new javax.swing.JLabel();
        campo_id_pelicula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
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
        btn_eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        etq_titulo.setBackground(new java.awt.Color(255, 51, 102));
        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("PANEL ELIMINAR");

        etq_titulo3.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        etq_titulo3.setText("Ingrese la pelicula que quiere borrar:");

        etq_cedula1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula1.setText("id pelicula:");

        btn_buscar.setBackground(new java.awt.Color(153, 0, 153));
        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_nombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombres.setText("Nombre:");

        campo_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etq_apellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_apellidos.setText("Director");

        campo_director.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etq_direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_direccion.setText("Año:");

        campo_anio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etq_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_telefono.setText("Sinopsis:");

        campo_sinopsis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etq_email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_email.setText("Id categoria");

        campo_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

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
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_nombres)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(etq_cedula1))
                                    .addComponent(etq_apellidos))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_director, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campo_id_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(btn_buscar))
                                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_sinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_email)
                                    .addComponent(etq_telefono)
                                    .addComponent(etq_direccion)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(btn_eliminar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_id_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_cedula1)
                    .addComponent(btn_buscar))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(campo_sinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_email)
                    .addComponent(campo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       String id_pelicula = campo_id_pelicula.getText();
        
        buscarpelicula(id_pelicula);
    
    
        
      
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
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

            Map<String, String> datosEliminar= new HashMap<>();
         
            datosEliminar.put("id_pelicula", id_pelicula);
            datosEliminar.put("nombre", nombre);
            datosEliminar.put("director", director);
            datosEliminar.put("anio", anio);
            datosEliminar.put("sinopsis", sinopsis);
            datosEliminar.put("id_categoria", id_categoria);
            String respuesta03 = consumoapi.consumoPOST("http://localhost/api_peliculaS/API/eliminarpelicula.php", datosEliminar);
            System.out.println(respuesta03);
            
            
             JsonObject respuesta_estado = JsonParser.parseString(respuesta03).getAsJsonObject();
             boolean status = respuesta_estado.get("status").getAsBoolean();
            
            
            if(status){
                  Alerta ventana = new Alerta("EXITO AL ELIMINAR LA PELICULA.");
            
            }else{
                    Alerta ventana = new Alerta("algo salio mal al eliminar la pelicula.");
            }
        }
        
        
        campo_id_pelicula.setText("");
        campo_nombre.setText("");
        campo_director.setText("");
        campo_anio.setText("");
        campo_sinopsis.setText("");
        campo_categoria.setText("");
    }//GEN-LAST:event_btn_eliminarActionPerformed


    
   
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
                campo_sinopsis.setText(temp.get("sinopsis").getAsString());
                campo_anio.setText(temp.get("anio").getAsString());
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
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField campo_anio;
    private javax.swing.JTextField campo_categoria;
    private javax.swing.JTextField campo_director;
    private javax.swing.JTextField campo_id_pelicula;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_sinopsis;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_cedula1;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo3;
    // End of variables declaration//GEN-END:variables
}
