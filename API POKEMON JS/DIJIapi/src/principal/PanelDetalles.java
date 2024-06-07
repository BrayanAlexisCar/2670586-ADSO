
package principal;

import com.google.gson.JsonArray;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;


public class PanelDetalles extends javax.swing.JFrame {

    JsonObject digimon;
    ConsumoAPI consumoapi;
    JsonArray levels;
    JsonArray attributes;
    JsonArray fields;
    JsonArray types;

    public PanelDetalles(JsonObject data,JsonArray levels, JsonArray attributes, JsonArray fields, JsonArray types, ConsumoAPI consumoapi) {
        initComponents();
        this.digimon = data;
        this.consumoapi = consumoapi;
        this.levels = levels;
        this.attributes = attributes;
        this.fields = fields;
         this.types = types;
        
       
        initAlternComponents();
        detalle();
        
     
       
    }

    public void initAlternComponents() {
        setTitle("Detalles");
        dispose();

        setVisible(true);
        setResizable(false);
        setSize(440,500);
        
        
    }

    public void detalle( ) {
       etq_nombre.setText(digimon.get("name").getAsString());
       
        mostrar_img(digimon.get("image").getAsString());
        
        
        DefaultTableModel modelo_levels = (DefaultTableModel) tabla_levels.getModel();
        modelo_levels.setRowCount(0); 
      
        
        for (int i=0; i<levels.size(); i++) {
            JsonObject temp = levels.get(i).getAsJsonObject();
            String level = temp.get("level").getAsString();
            Object[] fila = new Object[]{level};
            modelo_levels.addRow(fila);
        }
        
        
         DefaultTableModel modelo_attributes = (DefaultTableModel) tabla_attributes.getModel();
        modelo_attributes.setRowCount(0); 
      
        
        for (int i=0; i<attributes.size(); i++) {
            JsonObject temp = attributes.get(i).getAsJsonObject();
            String attribute = temp.get("attribute").getAsString();
            Object[] fila = new Object[]{attribute};
            modelo_attributes.addRow(fila);
        }
        
        
        
          DefaultTableModel modelo_types = (DefaultTableModel) tabla_types.getModel();
        modelo_types.setRowCount(0); 
      
        
        for (int i=0; i<types.size(); i++) {
            JsonObject temp = types.get(i).getAsJsonObject();
            String type = temp.get("type").getAsString();
            Object[] fila = new Object[]{type};
            modelo_types.addRow(fila);
        }
        
        
        
        for (int i = 0; i < fields.size(); i++) {
            JsonObject temp = fields.get(i).getAsJsonObject();
            String imageUrl = temp.get("image").getAsString();

            try {
                URL imgUrl = new URL(imageUrl);
                ImageIcon icon = new ImageIcon(imgUrl);
                Image image = icon.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
                icon = new ImageIcon(image);
                JLabel imageLabel = new JLabel(icon);
                content_fields.add(imageLabel);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PanelDetalles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    
       
    }
    
    
    public void mostrar_img(String imagen) {
        try {
            URL url = new URL(imagen);
            ImageIcon icon = new ImageIcon(url);
            Image image = icon.getImage().getScaledInstance(190, 150, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);
            etq_imagen.setIcon(icon);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_levels = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_types = new javax.swing.JTable();
        content_fields = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_attributes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        etq_nombre.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tabla_levels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Levels"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_levels.setPreferredSize(new java.awt.Dimension(80, 80));
        jScrollPane2.setViewportView(tabla_levels);

        tabla_types.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Types"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_types.setPreferredSize(new java.awt.Dimension(80, 80));
        jScrollPane3.setViewportView(tabla_types);

        content_fields.setBackground(new java.awt.Color(255, 204, 51));
        content_fields.setLayout(new java.awt.GridLayout(1, 0));

        tabla_attributes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attributes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_attributes.setPreferredSize(new java.awt.Dimension(80, 80));
        jScrollPane5.setViewportView(tabla_attributes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(content_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(content_fields, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content_fields;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tabla_attributes;
    private javax.swing.JTable tabla_levels;
    private javax.swing.JTable tabla_types;
    // End of variables declaration//GEN-END:variables
}
