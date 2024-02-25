
package principal;

import utils.BaseDatos;


public class PanelCrear extends javax.swing.JPanel {

   
    BaseDatos basedatos;
    public PanelCrear(BaseDatos basedatos) {
        initComponents();
        this.basedatos = basedatos; 
        
        initComponents();
        initAlternComponent();
        
        
    }
    
    
    public void initAlternComponent(){
        
     
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        btn_enviar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PANEL CREAR");

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

        btn_enviar.setBackground(new java.awt.Color(51, 102, 255));
        btn_enviar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_enviar.setText("ENVIAR");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(etq_apellidos)
                                .addComponent(etq_telefono))
                            .addComponent(etq_cedula))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(etq_nombres))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_direccion)
                                    .addComponent(etq_email))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_email))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_apellidos)
                            .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_direccion)
                        .addGap(41, 41, 41)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(etq_email)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed

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

            boolean agregar = datos.insertarPersona(documento, nombres,apellidos, direccion, telefono, email);

            if(agregar){
                Alerta ventana = new Alerta("Persona insertada correctamente en la base de datos.");
            }else{
                Alerta ventana = new Alerta("No se pudo agregar a la persona.");
            }
        }

    }//GEN-LAST:event_btn_enviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
