
package principal;

import java.awt.Color;
import utils.BaseDatos;
import utils.Persona;


public class PanelEliminar extends javax.swing.JPanel {

    BaseDatos basedatos;
    public PanelEliminar(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
        
        campo_nombres.setEnabled(false);
        campo_apellidos.setEnabled(false);
        campo_direccion.setEnabled(false);
        campo_telefono.setEnabled(false);
        campo_email.setEnabled(false);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_titulo3 = new javax.swing.JLabel();
        etq_cedula1 = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        etq_nombres = new javax.swing.JLabel();
        campo_nombres = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        etq_email = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 102, 255));

        etq_titulo.setBackground(new java.awt.Color(255, 51, 102));
        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("PANEL ELIMINAR");

        etq_titulo3.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        etq_titulo3.setText("Ingrese la cedula de la persona que quiere borrar:");

        etq_cedula1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula1.setText("Cedula:");

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_nombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombres.setText("Nombres:");

        campo_nombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etq_apellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_apellidos.setText("Apellidos:");

        campo_apellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etq_direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_direccion.setText("Direccion:");

        campo_direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etq_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_telefono.setText("Telefono:");

        campo_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etq_email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_email.setText("Email:");

        campo_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_eliminar.setBackground(new java.awt.Color(51, 204, 0));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                        .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(46, 46, 46)
                                            .addComponent(btn_buscar))
                                        .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etq_direccion)
                                .addGap(331, 331, 331)))
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
                                    .addComponent(etq_telefono)))
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
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_cedula1)
                    .addComponent(btn_buscar))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_email)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       String documento = campo_cedula.getText();
        
        buscarpersona(documento);
    
    
        
      
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        String documento = campo_cedula.getText();
        String nombres = campo_nombres.getText();
        String apellidos = campo_apellidos.getText();
        String direccion = campo_direccion.getText();
        String telefono = campo_telefono.getText();
        String email = campo_email.getText();

        if (documento.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            // Mostrar un mensaje de alerta indicando que todos los campos son obligatorios
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");
        } else {

            boolean eliminar = basedatos.eliminarPersona(documento);
            
         
            
            if(eliminar){
                Alerta ventana = new Alerta("Persona elimianda correctamente en la base de datos.");
            }else{
                Alerta ventana = new Alerta("No se pudo eliminar a la persona.");
            }
            
        }
        
            campo_cedula.setText("");
            campo_nombres.setText("");
            campo_apellidos.setText("");
            campo_direccion.setText("");
            campo_telefono.setText("");
            campo_email.setText("");
    }//GEN-LAST:event_btn_eliminarActionPerformed


    
   
     public void buscarpersona(String cedula){
         Persona [] listapersona = basedatos.extraerPersonas();
        
        boolean encontrado = false;
        for (int i = 0; i <listapersona.length && listapersona != null ; i++) {
            if(listapersona[i] != null && listapersona[i].getDocumento().equals(cedula)){
                
               
                
                
                campo_nombres.setText(listapersona[i].getNombres());
                campo_apellidos.setText(listapersona[i].getApellidos());
                campo_direccion.setText(listapersona[i].getDireccion());
                campo_telefono.setText(listapersona[i].getTelefono());
                campo_email.setText(listapersona[i].getCorreo());
                encontrado = true;

            }
        }
    
        if(!encontrado){
             Alerta ventana = new Alerta("ESA PERSONA NO SE ENCUENTRA");
        }
    
    }
     
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
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
