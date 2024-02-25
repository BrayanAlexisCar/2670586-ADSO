
package principal;

import utils.BaseDatos;
import utils.Persona;


public class PanelEditar extends javax.swing.JPanel {

    BaseDatos basedatos;
    public PanelEditar( BaseDatos basedatos) {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        etq_titulo = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        campo_cedula = new javax.swing.JTextField();
        etq_titulo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        btn_editar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(204, 255, 51));

        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("PANEL EDITAR");

        etq_cedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula.setText("Cedula:");

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_titulo2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        etq_titulo2.setText("Ingrese la cedula que quiere editar:");

        jPanel2.setBackground(new java.awt.Color(204, 255, 51));

        etq_nombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombres.setText("Nombres:");

        etq_apellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_apellidos.setText("Apellidos:");

        etq_direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_direccion.setText("Direccion:");

        etq_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_telefono.setText("Telefono:");

        etq_email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_email.setText("Email:");

        btn_editar.setBackground(new java.awt.Color(51, 102, 255));
        btn_editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_email)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_direccion)
                                    .addComponent(etq_apellidos)
                                    .addComponent(etq_nombres)))
                            .addComponent(etq_telefono))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(campo_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(campo_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(campo_email, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(campo_nombres))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_email)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(etq_cedula)
                        .addGap(53, 53, 53)
                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(etq_titulo2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar)
                            .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(etq_cedula)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

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

            BaseDatos datos = new BaseDatos();

            boolean agregar = datos.actualizarPersona(documento, nombres,apellidos, direccion, telefono, email);

            if(agregar){
                Alerta ventana = new Alerta("Persona editada correctamente en la base de datos.");
            }else{
                Alerta ventana = new Alerta("No se pudo editada a la persona.");
            }
        }
        
        
        campo_cedula.setText("");
        campo_nombres.setText("");
        campo_apellidos.setText("");
        campo_direccion.setText("");
        campo_telefono.setText("");
        campo_email.setText("");
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       String documento = campo_cedula.getText();
       
       
        
        buscarpersona(documento);
       
    }//GEN-LAST:event_btn_buscarActionPerformed

   
     public void buscarpersona(String cedula){
        Persona [] listapersona = basedatos.extraerPersonas();
        
        boolean encontrado = false;
        for (int i = 0; i <listapersona.length && listapersona != null ; i++) {
            if(listapersona[i] != null && listapersona[i].getDocumento().equals(cedula)){
              
                campo_nombres.setEnabled(true);
                campo_apellidos.setEnabled(true);
                campo_direccion.setEnabled(true);
                campo_telefono.setEnabled(true);
                campo_email.setEnabled(true);
                
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
    private javax.swing.JButton btn_editar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
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
