
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
 
       

public class VentanaEliminar extends javax.swing.JFrame {
  
     Persona[] listaPersonas;
     DefaultTableModel modelo; 
     BaseDatos basedatos;
   
   public VentanaEliminar() {
   
        initComponents();
        initAlternComponent();
         
        basedatos = new BaseDatos();  
        listaPersonas = basedatos.extraerPersonas();
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
                
                
                JButton btnEliminar = new JButton();
                btnEliminar.setBackground(Color.white);
                Image icono_eliminar = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_eliminar.png") );
                icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                btnEliminar.setIcon( new ImageIcon(icono_eliminar) );
               
               

                Object dato[] = new Object[]{ documento, nombres, apellidos,  direccion, telefono, correo, btnEliminar };
                modelo.addRow(dato);
                
                
                 VentanaEliminar ventanaActual = this;
                final int posicion = i;
                btnEliminar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ConfirmarEliminar ventana = new ConfirmarEliminar( ventanaActual, posicion);
                    }
                });


            }
        }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU DE ELIMINAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 347, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(89, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
