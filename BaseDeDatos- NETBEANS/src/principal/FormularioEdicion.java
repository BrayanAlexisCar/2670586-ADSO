
package principal;


public class FormularioEdicion extends javax.swing.JFrame {

    ventanaEditar ventana;
    int posicion;
    Persona ListaPersonas[];
   
    
    public FormularioEdicion(ventanaEditar ventana, int posicion) {
        this.ventana = ventana;
        this.posicion = posicion;
        
        
        initComponents();
        initAlternComponents();
    }

    
    
    
    
     public void initAlternComponents(){
        
        setTitle("Formulario de Edicion");
        setVisible(true);
        setLocationRelativeTo(null);
  
        campo_cedula.setText( ventana.listaPersonas[posicion].getDocumento() );
        campo_nombres.setText( ventana.listaPersonas[posicion].getNombres() );
       campo_apellidos.setText( ventana.listaPersonas[posicion].getApellidos());
        campo_direccion.setText( ventana.listaPersonas[posicion].getDireccion());
        campo_telefono.setText( ventana.listaPersonas[posicion].getTelefono());
        campo_email.setText( ventana.listaPersonas[posicion].getCorreo());
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        etq_cedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_cedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula.setText("Cedula:");

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
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(etq_cedula)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etq_apellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(campo_cedula)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etq_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(etq_nombres)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(etq_email)
                            .addGap(30, 30, 30)))
                    .addComponent(etq_direccion))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cedula)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_nombres)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_email)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
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
             boolean actualizacion= ventana.basedatos.actualizarPersona(documento, nombres, apellidos, direccion, telefono, email);
            ventana.listaPersonas[posicion].setDocumento(documento);
            ventana.listaPersonas[posicion].setNombres(nombres);
            ventana.listaPersonas[posicion].setApellidos(apellidos);
            ventana.listaPersonas[posicion].setDireccion(direccion );
            ventana.listaPersonas[posicion].setTelefono(telefono);           
            ventana.listaPersonas[posicion].setCorreo( email );
            
           
        
            if (actualizacion) {
                // Si la actualización fue exitosa se actualizara la tabla en la ventana Editar
                ventana.imprimirPersonas();
                System.out.println("Editado con éxito");
            } else {
                System.out.println("No se pudo editar");
            }
            
            
            dispose();
            
           
        }
        
        

    }//GEN-LAST:event_btn_editarActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
}
