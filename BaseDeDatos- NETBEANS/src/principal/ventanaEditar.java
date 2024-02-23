
package principal;

import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
 
       

public class ventanaEditar extends javax.swing.JFrame {
  
     Persona[] listaPersonas;
     DefaultTableModel modelo; 
     BaseDatos basedatos;
   
   public ventanaEditar() {
   
        initComponents();
        initAlternComponent();
         
         basedatos = new BaseDatos();  

        imprimirPersonas();
       
        
    }
   
   
   
    
    
      public void initAlternComponent(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("MENU");
        setResizable(false);
        
     
         modelo = (DefaultTableModel) tablaDatos.getModel();
        
        tablaDatos.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(120);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(120);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(6).setPreferredWidth(40);
        
        // Ajuste del Orden y Ancho de Columnas
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        // Alto de las filas
        tablaDatos.setRowHeight(25);

        
    }
      
      
     
      
      
      public void imprimirPersonas(){
            modelo.setRowCount(0);
            listaPersonas = basedatos.extraerPersonas();
            for (int i=0;i<listaPersonas.length && listaPersonas[i]!=null; i++) {
                String documento = listaPersonas[i].getDocumento();
                String nombres = listaPersonas[i].getNombres();
                String apellidos = listaPersonas[i].getApellidos();
                String direccion =  listaPersonas[i].getDireccion();             
                String telefono = listaPersonas[i].getTelefono();               
                String correo = listaPersonas[i].getCorreo();
                
                
                JButton btnEditar = new JButton();
                btnEditar.setBackground(Color.white);
                Image icono_editar = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_editar.png") );
                icono_editar = icono_editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                btnEditar.setIcon( new ImageIcon(icono_editar) );
               
               

                Object dato[] = new Object[]{ documento, nombres, apellidos,  direccion, telefono, correo, btnEditar };
                modelo.addRow(dato);
                
                
                 ventanaEditar ventanaActual = this;
                final int posicion = i;
                btnEditar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        FormularioEdicion ventana = new FormularioEdicion( ventanaActual, posicion);
                    }
                });


            }
        }
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABLA DE EDICION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Direccion", "Telefono", "Email", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables

     
}
