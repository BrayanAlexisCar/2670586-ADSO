
package principal;

import javax.swing.table.DefaultTableModel;

public class TablaBasica extends javax.swing.JFrame {

    
    DefaultTableModel modelo;
    
    Persona listaPersonas[];
    
   
    
    public TablaBasica() {
         listaPersonas = new Persona[100];
         
         listaPersonas[0] = new Persona("12323132", " Brayan", "Alexis", "32332323", "alexis@gmail.com");
         listaPersonas[1] = new Persona("23425453454", " alejo", "pille", "65463534", "alejo@gmail.com");
         listaPersonas[2] = new Persona("5243534", " felipe", "carvajal", "432423", "felipe@gmail.com");
         listaPersonas[3] = new Persona("746634", " miguel", "mango", "1231443", "miguel@gmail.com");
         listaPersonas[4] = new Persona("42423424", " cristian", "bustamante", "342342342", "cristian@gmail.com");
        
        initComponents();
        initAternComponents();
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        imprimirPersonas();
       
    }
    
    
    
    
    
    public void imprimirPersonas(){
        modelo.setRowCount(0); // limpia la tabla eliminando duplicados
        for (int i = 0;listaPersonas[i]!= null; i++) {
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String correo = listaPersonas[i].getCorreo();
            
            Object dato[] = new Object[]{ documento, nombres, apellidos, telefono, correo};
            modelo.addRow(dato);
            
        }
        
    }
    
    
    public void limpiarcampos(){
       campodocumento.setText("");
       camponombres.setText("");
       campoapellidos.setText("");
       campotelefono.setText("");
       campocorreo.setText("");
       campodocumento.requestFocus();
            
     }  
    
    public void initAternComponents(){
        setVisible(true);
        setTitle("TABLA BASICA");
        setLocationRelativeTo(null);
        
        
        modelo = (DefaultTableModel) tabladatos.getModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTitulo = new javax.swing.JPanel();
        etqtitulo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        etqdocumento = new javax.swing.JLabel();
        campodocumento = new javax.swing.JTextField();
        etqnombres = new javax.swing.JLabel();
        camponombres = new javax.swing.JTextField();
        etqapellidos = new javax.swing.JLabel();
        campoapellidos = new javax.swing.JTextField();
        etqtelefono = new javax.swing.JLabel();
        campotelefono = new javax.swing.JTextField();
        etqcorreo = new javax.swing.JLabel();
        campocorreo = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        contenedorDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorTitulo.setBackground(new java.awt.Color(0, 51, 255));

        etqtitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etqtitulo.setText("Tabla Basica");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedorFormulario.setBackground(new java.awt.Color(0, 204, 204));

        etqdocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqdocumento.setForeground(new java.awt.Color(0, 0, 0));
        etqdocumento.setText("Documento:");

        campodocumento.setBackground(new java.awt.Color(255, 255, 255));

        etqnombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqnombres.setForeground(new java.awt.Color(0, 0, 0));
        etqnombres.setText("Nombres:");

        camponombres.setBackground(new java.awt.Color(255, 255, 255));

        etqapellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqapellidos.setForeground(new java.awt.Color(0, 0, 0));
        etqapellidos.setText("Apellidos:");

        campoapellidos.setBackground(new java.awt.Color(255, 255, 255));

        etqtelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqtelefono.setForeground(new java.awt.Color(0, 0, 0));
        etqtelefono.setText("Telefono:");

        campotelefono.setBackground(new java.awt.Color(255, 255, 255));

        etqcorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqcorreo.setForeground(new java.awt.Color(0, 0, 0));
        etqcorreo.setText("Correo:");

        campocorreo.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregar.setBackground(new java.awt.Color(51, 204, 0));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camponombres, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(etqapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoapellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(etqcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqdocumento)
                    .addComponent(etqnombres)
                    .addComponent(etqapellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqtelefono)
                    .addComponent(etqcorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        contenedorDatos.setBackground(new java.awt.Color(153, 153, 255));

        tabladatos.setBackground(new java.awt.Color(255, 255, 255));
        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabladatos);

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
       
        String documento = campodocumento.getText();
        String nombres = camponombres.getText();
        String apellidos = campoapellidos.getText();
        String telefono = campotelefono.getText();
        String correo = campocorreo.getText();
       
   
        if( documento.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || correo.isEmpty() ){
            Alerta ventana = new Alerta();  
            
        }
        else{
            
            int cedulaencontrada = -1; // no se encuentrta aun
            int correoencontrado = -1;
            
            for(int i = 0; i < listaPersonas.length; i++) {
                if(listaPersonas[i] != null){
                        if(listaPersonas[i].getDocumento().equals(campodocumento.getText())){
                           cedulaencontrada = i;
                        }if(listaPersonas[i].getCorreo().equals(campocorreo.getText())){
                            correoencontrado = i;
                        }
                }
            }
            
            
            if(cedulaencontrada != -1 && correoencontrado != -1 ){
                AlertaAmbos ventanaAmbos = new AlertaAmbos();
                    limpiarcampos();
            }else if(cedulaencontrada != -1){
                AlertaCedula ventanaCedula = new AlertaCedula();
                limpiarcampos();
            }else if(correoencontrado != -1){
                AlertaCorreo ventanaCorreo = new AlertaCorreo();
                limpiarcampos();
            }     
            else{
                
                 // Buscar posicon vacia
                int posicion = -1;
                for (int i=0;i<listaPersonas.length;i++) {
                    if (listaPersonas[i]==null) {
                        posicion = i;
                        break;
                    }
                }


                // Crear objeto en posicion vacia
                if (posicion!=-1) {
                    listaPersonas[posicion] = new Persona(documento, nombres, apellidos, telefono, correo);

                    Object data[] = new Object[]{ documento, nombres, apellidos, telefono, correo };
                    modelo.addRow(data);

                    campodocumento.setText("");
                    camponombres.setText("");
                    campoapellidos.setText("");
                    campotelefono.setText("");
                    campocorreo.setText("");
                    campodocumento.requestFocus();
                }
            }
        } 
        
    }//GEN-LAST:event_btn_agregarActionPerformed

                   
     
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JTextField campoapellidos;
    private javax.swing.JTextField campocorreo;
    private javax.swing.JTextField campodocumento;
    private javax.swing.JTextField camponombres;
    private javax.swing.JTextField campotelefono;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etqapellidos;
    private javax.swing.JLabel etqcorreo;
    private javax.swing.JLabel etqdocumento;
    private javax.swing.JLabel etqnombres;
    private javax.swing.JLabel etqtelefono;
    private javax.swing.JLabel etqtitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
