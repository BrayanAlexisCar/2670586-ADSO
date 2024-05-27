
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import util.ConsumoAPI;


public class Menu extends javax.swing.JFrame {
    ConsumoAPI consumoapi;
    DefaultTableModel modelo; 
    String listaImagenes[];
    int posActual;
    int pagina;
    int listaNumeros [];
     
     
    public Menu(){
        consumoapi = new ConsumoAPI();    
        this.listaImagenes = new String[3]; 
        this.pagina = 1;
        this.listaNumeros = new int[7]; 
        
        initComponents();
        
        initAlternComponents();
        cargarImagenPokemon();
        ConsumoPokemones();
        cargarPaginador();
           
    }
    

    public void initAlternComponents() {
        setTitle("POKEDEX");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        Image icono = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png"));
        icono = icono.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        setIconImage(icono);
        
    
        Image icono_atras = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_atras.png"));
        icono_atras = icono_atras.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        btn_atras_img.setIcon(new ImageIcon(icono_atras));
        btn_atras_img.setBackground(Color.RED);
        btn_atras_img.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_atras_img.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        
        Image icono_siguiente = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));
        icono_siguiente = icono_siguiente.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        btn_siguiente_img.setIcon(new ImageIcon(icono_siguiente));
        btn_siguiente_img.setBackground(Color.RED);
        btn_siguiente_img.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_siguiente_img.setVerticalTextPosition(SwingConstants.BOTTOM);
        

        modelo = (DefaultTableModel) tablaDatos.getModel();
        
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(120);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(200);
        
        
        // Ajuste del Orden y Ancho de Columnas
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        
        // Alto de las filas
        tablaDatos.setRowHeight(25);        
       
 
    }
    

    public void cargarImagenPokemon(){
        try {
            String url = this.listaImagenes[posActual];
            if (url != null) { 
                URL imgUrl = new URL(url);
                Image imagen = getToolkit().createImage(imgUrl);
                imagen = imagen.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
                etq_imagen.setIcon(new ImageIcon(imagen));
                System.out.println(" la posicion img: " + posActual);

        }} catch (MalformedURLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (posActual==0) {
            btn_atras_img.setEnabled(false);
        }else{
             btn_atras_img.setEnabled(true);
        }
        
        if (posActual==2) {
            btn_siguiente_img.setEnabled(false);
        }else{
             btn_siguiente_img.setEnabled(true);
        }

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentPrincipal = new javax.swing.JPanel();
        contentBotones = new javax.swing.JPanel();
        Panel_detalles = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btn_siguiente_img = new javax.swing.JButton();
        btn_atras_img = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.red);

        etq_titulo.setFont(new java.awt.Font("MV Boli", 1, 34)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setText("POKEDEX");

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        contentPrincipal.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(contentPrincipal);

        contentBotones.setLayout(new java.awt.GridLayout(1, 0));

        Panel_detalles.setBackground(new java.awt.Color(255, 102, 102));

        etq_nombre.setBackground(java.awt.Color.red);
        etq_nombre.setFont(new java.awt.Font("Comic Sans MS", 1, 26)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Panel_detallesLayout = new javax.swing.GroupLayout(Panel_detalles);
        Panel_detalles.setLayout(Panel_detallesLayout);
        Panel_detallesLayout.setHorizontalGroup(
            Panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_detallesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_detallesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_detallesLayout.setVerticalGroup(
            Panel_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_detallesLayout.createSequentialGroup()
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Habilidad", "Url"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        btn_siguiente_img.setBorder(null);
        btn_siguiente_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguiente_imgActionPerformed(evt);
            }
        });

        btn_atras_img.setBorder(null);
        btn_atras_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras_imgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etq_titulo)
                .addGap(231, 231, 231))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btn_atras_img, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel_detalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_siguiente_img, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contentBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etq_titulo)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Panel_detalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_siguiente_img, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(btn_atras_img, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(contentBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atras_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras_imgActionPerformed
        if (this.posActual>0) {
            this.posActual--;
            cargarImagenPokemon();
            btn_siguiente_img.setEnabled(true);
        }
        
        

    }//GEN-LAST:event_btn_atras_imgActionPerformed

    private void btn_siguiente_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguiente_imgActionPerformed
        if (this.posActual<2) {
            this.posActual++;
            cargarImagenPokemon();
            btn_atras_img.setEnabled(true);
        }
    }//GEN-LAST:event_btn_siguiente_imgActionPerformed

    public void  ConsumoPokemones(){
        contentPrincipal.removeAll(); 
        int offset = (this.pagina*20)-20;
        String endpoint = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";
        String data = this.consumoapi.consumoGET(endpoint);
        

 
        JsonObject infoAPI = JsonParser.parseString(data).getAsJsonObject();
        JsonArray registros = infoAPI.getAsJsonArray("results");
        
        
        if(registros.size() > 0){
            for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            
            //datos de la api
            String name = temp.get("name").getAsString();
            String url = temp.get("url").getAsString();     
            
            
            
            JButton boton_poke = new JButton();
            boton_poke.setBackground(Color.white);
            boton_poke.setForeground(Color.black);
            boton_poke.setText(name);
            Font Fuente = new Font("Comic Sans MS", Font.BOLD, 14);
            boton_poke.setFont(Fuente);
       
            
            boton_poke.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                    DetallesPokemon(name, url);
                }
            });
                  
            contentPrincipal.add(boton_poke);  
        }
      
        contentPrincipal.revalidate();
        contentPrincipal.repaint();
        
        } 
    }
    
    
    public void DetallesPokemon(String name, String url) {
        etq_nombre.setText(name);
                    
        String consumoImagen = consumoapi.consumoGET(url);
        JsonObject detalles = JsonParser.parseString(consumoImagen).getAsJsonObject();
        JsonObject sprites = detalles.getAsJsonObject("sprites");


       
        this.listaImagenes[0] = sprites.get("front_default").getAsString();
        this.listaImagenes[1] = sprites.getAsJsonObject("other").getAsJsonObject("official-artwork").get("front_default").getAsString();
        this.listaImagenes[2] = sprites.getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
        this.posActual = 0;
        
        cargarImagenPokemon();

        
        JsonArray abilities = detalles.getAsJsonArray("abilities");
        modelo.setRowCount(0);

        for (int i = 0; i < abilities.size(); i++) {
            JsonObject temp_abilities = abilities.get(i).getAsJsonObject();
            JsonObject ability = temp_abilities.getAsJsonObject("ability");
            String ability_name = ability.get("name").getAsString();
            String ability_url = ability.get("url").getAsString();
            Object dato[] = new Object[]{i + 1, ability_name, ability_url};
            modelo.addRow(dato);
        }
       
        
    }


    public void cargarPaginador(){
        contentBotones.removeAll();
      
        
        int final_pag = 66;
        int  primera_pag = 1;
        
        
        JButton btn_primer_pag = new JButton();
        btn_primer_pag.setText("<<");
        contentBotones.add(btn_primer_pag);
                
         btn_primer_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = primera_pag;
                   contentPrincipal.removeAll();
                   ConsumoPokemones();
                    cargarPaginador();
                }
            });
         
         
        
        
        JButton btn_anterior_pag = new JButton();
        btn_anterior_pag.setText("<");
        contentBotones.add(btn_anterior_pag);
         btn_anterior_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    if(pagina > 1){
                        pagina--;
                        contentPrincipal.removeAll();
                        ConsumoPokemones();
                        cargarPaginador();
                    }
                   
                }
            });
        
    
        for (int i=0; i<listaNumeros.length; i++) {
            int num_pagina = pagina + i;

            if ( num_pagina <= final_pag){
                
                JButton btn = new JButton();
                contentBotones.add(btn);

                btn.setText(Integer.toString(num_pagina));
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pagina = num_pagina; 
                        
                        contentPrincipal.removeAll();
                       ConsumoPokemones();
                       cargarPaginador();
                    }
                });
                
            }
        }
        
         
         
        JButton btn_siguiente_pag = new JButton();
        btn_siguiente_pag.setText(">");
        contentBotones.add(btn_siguiente_pag);
        
        
         btn_siguiente_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina++;
                   contentPrincipal.removeAll();
                   ConsumoPokemones();
                   cargarPaginador();
                    
                }
        });
        
        
        
        JButton btn_ultima_pag = new JButton();
        btn_ultima_pag.setText(">>");
        contentBotones.add(btn_ultima_pag);
        
        
         btn_ultima_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = final_pag;
                   contentPrincipal.removeAll();
                   ConsumoPokemones();
                   cargarPaginador();
                    
                }
            });
         
         
       
        revalidate();
        repaint();
        
  
        //imprimir boton pagina atras
        //imorimit otones de paginas
        //imprimiir boton para siguiente
        //imprimir boton ultima pagina
        
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_detalles;
    private javax.swing.JButton btn_atras_img;
    private javax.swing.JButton btn_siguiente_img;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel contentBotones;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables

    

    
}
