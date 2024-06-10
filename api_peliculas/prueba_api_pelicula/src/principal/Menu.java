package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import utils.ConsumoAPI;


public class Menu extends javax.swing.JFrame {
    
    ConsumoAPI consumoapi;
  
    public Menu() {
        
        consumoapi = new ConsumoAPI();
        initComponents();
        initAlternComponents();
    }

    public void initAlternComponents(){
        setTitle("Menu");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logocine.png")));
        
        
        btnListarPelicula.setBackground(Color.white);
        btnCrearPelicula.setBackground(Color.white);
        btnEditarPelicula.setBackground(Color.white);
        btnEliminarPelicula.setBackground(Color.white);
           
        btnListarCATEGORIA.setBackground(Color.white);
        btncrearCATEGORIA.setBackground(Color.white);
        btneditarCATEGORIA.setBackground(Color.white);
        btneliminarCATEGORIA.setBackground(Color.white);
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTemporal = new javax.swing.JLabel();
        contentMenu = new javax.swing.JPanel();
        btnListarPelicula = new javax.swing.JButton();
        btnCrearPelicula = new javax.swing.JButton();
        btnEditarPelicula = new javax.swing.JButton();
        btnEliminarPelicula = new javax.swing.JButton();
        btnListarCATEGORIA = new javax.swing.JButton();
        btneditarCATEGORIA = new javax.swing.JButton();
        btneliminarCATEGORIA = new javax.swing.JButton();
        btncrearCATEGORIA = new javax.swing.JButton();
        contentPrincipal = new javax.swing.JPanel();

        etqTemporal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqTemporal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTemporal.setText("PANEL PRINCIPAL");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentMenu.setBackground(new java.awt.Color(255, 102, 102));

        btnListarPelicula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnListarPelicula.setText("OBTENER PELICULA");
        btnListarPelicula.setFocusable(false);
        btnListarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPeliculaActionPerformed(evt);
            }
        });

        btnCrearPelicula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCrearPelicula.setText("   CREAR PELICULA");
        btnCrearPelicula.setFocusable(false);
        btnCrearPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPeliculaActionPerformed(evt);
            }
        });

        btnEditarPelicula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditarPelicula.setText("  EDITAR PELICULA");
        btnEditarPelicula.setFocusable(false);
        btnEditarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPeliculaActionPerformed(evt);
            }
        });

        btnEliminarPelicula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEliminarPelicula.setText("   ELIMINAR PELICULA");
        btnEliminarPelicula.setFocusable(false);
        btnEliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPeliculaActionPerformed(evt);
            }
        });

        btnListarCATEGORIA.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnListarCATEGORIA.setText("OBTENER CATEGORIA");
        btnListarCATEGORIA.setFocusable(false);
        btnListarCATEGORIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCATEGORIAActionPerformed(evt);
            }
        });

        btneditarCATEGORIA.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btneditarCATEGORIA.setText("EDITAR CATEGORIA");
        btneditarCATEGORIA.setFocusable(false);
        btneditarCATEGORIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarCATEGORIAActionPerformed(evt);
            }
        });

        btneliminarCATEGORIA.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btneliminarCATEGORIA.setText("ELIMINAR CATEGORIA");
        btneliminarCATEGORIA.setFocusable(false);
        btneliminarCATEGORIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarCATEGORIAActionPerformed(evt);
            }
        });

        btncrearCATEGORIA.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btncrearCATEGORIA.setText("CREAR CATEGORIA");
        btncrearCATEGORIA.setFocusable(false);
        btncrearCATEGORIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearCATEGORIAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncrearCATEGORIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneditarCATEGORIA, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnEditarPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarCATEGORIA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btneliminarCATEGORIA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentMenuLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(btnListarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnCrearPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnListarCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncrearCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneditarCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btneliminarCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentMenuLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(btnListarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(487, Short.MAX_VALUE)))
        );

        contentPrincipal.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarCATEGORIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCATEGORIAActionPerformed
             //crear el contendor nuevo
        
        PanelObtenerCategoria nuevo = new PanelObtenerCategoria( consumoapi);
        
      
        //ajustar el tamaño del contenedor nuevo
        
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        nuevo.setSize(contentPrincipal.getSize());
        
        
        //eliminar el contenidp dle contendedorPrincipal
        
        contentPrincipal.removeAll();
        
        
        //agregar dentro del contendorPrincipal el contendor nuevo
        
        contentPrincipal.add(nuevo);
      
        //rapaint(); //refrescar cambios
        repaint();
        revalidate();        
    }//GEN-LAST:event_btnListarCATEGORIAActionPerformed

    
    private void btnCrearPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPeliculaActionPerformed
       PanelInsertarPelicula nuevo = new PanelInsertarPelicula( consumoapi);
        
      
        //ajustar el tamaño del contenedor nuevo
        
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        nuevo.setSize(contentPrincipal.getSize());
        
        
        //eliminar el contenidp dle contendedorPrincipal
        
        contentPrincipal.removeAll();
        
        
        //agregar dentro del contendorPrincipal el contendor nuevo
        
        contentPrincipal.add(nuevo);
      
       
        repaint();
        revalidate();        
    }//GEN-LAST:event_btnCrearPeliculaActionPerformed

    private void btnEditarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPeliculaActionPerformed
      PanelEditarPelicula nuevo = new PanelEditarPelicula( consumoapi);
        
      
        //ajustar el tamaño del contenedor nuevo
        
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        nuevo.setSize(contentPrincipal.getSize());
        
        
        //eliminar el contenidp dle contendedorPrincipal
        
        contentPrincipal.removeAll();
        
        
        //agregar dentro del contendorPrincipal el contendor nuevo
        
        contentPrincipal.add(nuevo);
      
        //refrescar cambios
        repaint();
        revalidate();        
    }//GEN-LAST:event_btnEditarPeliculaActionPerformed

    private void btnEliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPeliculaActionPerformed
       PanelEliminarPelicula nuevo = new PanelEliminarPelicula( consumoapi);
        
      
        //ajustar el tamaño del contenedor nuevo
        
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
       nuevo.setSize(contentPrincipal.getSize());
        
        
        //eliminar el contenidp dle contendedorPrincipal
        
        contentPrincipal.removeAll();
        
        
        //agregar dentro del contendorPrincipal el contendor nuevo
        
        contentPrincipal.add(nuevo);
      
         //refrescar cambios
        repaint();
        revalidate();        
    }//GEN-LAST:event_btnEliminarPeliculaActionPerformed

    private void btnListarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPeliculaActionPerformed
        PanelObtenerPelicula nuevo = new PanelObtenerPelicula( consumoapi);
        
      
        //ajustar el tamaño del contenedor nuevo
        
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
       nuevo.setSize(contentPrincipal.getSize());
        
        
        //eliminar el contenidp dle contendedorPrincipal
        
        contentPrincipal.removeAll();
        
        
        //agregar dentro del contendorPrincipal el contendor nuevo
        
        contentPrincipal.add(nuevo);
      
         //refrescar cambios
        repaint();
        revalidate();        
    }//GEN-LAST:event_btnListarPeliculaActionPerformed

    private void btncrearCATEGORIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearCATEGORIAActionPerformed
        PanelInsertarCategoria nuevo = new PanelInsertarCategoria( consumoapi);
        
      
        //ajustar el tamaño del contenedor nuevo
        
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
       nuevo.setSize(contentPrincipal.getSize());
        
        
        //eliminar el contenidp dle contendedorPrincipal
        
        contentPrincipal.removeAll();
        
        
        //agregar dentro del contendorPrincipal el contendor nuevo
        
        contentPrincipal.add(nuevo);
      
         //refrescar cambios
        repaint();
        revalidate();        
    }//GEN-LAST:event_btncrearCATEGORIAActionPerformed

    private void btneditarCATEGORIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarCATEGORIAActionPerformed
        PanelEditarCategoria nuevo = new PanelEditarCategoria( consumoapi);
        
      
        //ajustar el tamaño del contenedor nuevo
        
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
       nuevo.setSize(contentPrincipal.getSize());
        
        
        //eliminar el contenidp dle contendedorPrincipal
        
        contentPrincipal.removeAll();
        
        
        //agregar dentro del contendorPrincipal el contendor nuevo
        
        contentPrincipal.add(nuevo);
      
         //refrescar cambios
        repaint();
        revalidate();        

    }//GEN-LAST:event_btneditarCATEGORIAActionPerformed

    private void btneliminarCATEGORIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarCATEGORIAActionPerformed
       PanelEliminarCategoria  nuevo = new PanelEliminarCategoria( consumoapi);
        
      
        //ajustar el tamaño del contenedor nuevo
        
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
       nuevo.setSize(contentPrincipal.getSize());
        
        
        //eliminar el contenidp dle contendedorPrincipal
        
        contentPrincipal.removeAll();
        
        
        //agregar dentro del contendorPrincipal el contendor nuevo
        
        contentPrincipal.add(nuevo);
      
         //refrescar cambios
        repaint();
        revalidate();        
    }//GEN-LAST:event_btneliminarCATEGORIAActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPelicula;
    private javax.swing.JButton btnEditarPelicula;
    private javax.swing.JButton btnEliminarPelicula;
    private javax.swing.JButton btnListarCATEGORIA;
    private javax.swing.JButton btnListarPelicula;
    private javax.swing.JButton btncrearCATEGORIA;
    private javax.swing.JButton btneditarCATEGORIA;
    private javax.swing.JButton btneliminarCATEGORIA;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTemporal;
    // End of variables declaration//GEN-END:variables
}
