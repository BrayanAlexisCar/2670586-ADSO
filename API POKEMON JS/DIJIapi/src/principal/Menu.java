package principal;
import java.awt.event.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import static java.lang.ModuleLayer.empty;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import util.ConsumoAPI;


public class Menu extends javax.swing.JFrame {
    
    JsonObject digimon;
    ConsumoAPI consumoapi;

    int pagina;
    int posActual;
    int listaNumeros [];


    public Menu() {
        initComponents();
        this.pagina = 0;
         this.digimon = digimon;
        this.listaNumeros = new int[5]; 
        this.consumoapi = new ConsumoAPI();

   
        iniAlternComponents();
        ConsumoDigimones();
        cargarPaginador();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contentDigimones = new javax.swing.JPanel();
        contentPaginador = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        contentDigimones.setBackground(new java.awt.Color(255, 204, 51));
        contentDigimones.setLayout(new java.awt.GridLayout(2, 3, 15, 9));

        contentPaginador.setBackground(new java.awt.Color(255, 255, 255));
        contentPaginador.setLayout(new java.awt.GridLayout(1, 0));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        etq_titulo.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(contentDigimones, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentDigimones, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iniAlternComponents(){
        setTitle("DIGIMON");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        

        Image titulo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/Digimon_logo.png"));
        titulo = titulo.getScaledInstance(200, 80, Image.SCALE_SMOOTH);
        etq_titulo.setIcon(new ImageIcon(titulo));
              
             
    }   
    
    
    
    
    public void ConsumoDigimones() {
      int offset = (this.pagina*5)-5;
     String endpoint = "https://digi-api.com/api/v1/digimon?page="+pagina;
     String data = this.consumoapi.consumoGET(endpoint);

     JsonObject infoAPI = JsonParser.parseString(data).getAsJsonObject();
     JsonArray registros = infoAPI.getAsJsonArray("content");

     if (registros.size() > 0) {
         for (int i = 0; i < registros.size(); i++) {
             JsonObject temp = registros.get(i).getAsJsonObject();

             String name = temp.get("name").getAsString();
             String image = temp.get("image").getAsString();
             String href = temp.get("href").getAsString();
             
             String data2 = consumoapi.consumoGET(href);
              
             JsonObject digimonData = JsonParser.parseString(data2).getAsJsonObject();
             JsonArray levels = digimonData.getAsJsonArray("levels");
             JsonArray attributes = digimonData.getAsJsonArray("attributes");
             JsonArray types = digimonData.getAsJsonArray("types");
             
             JsonArray fields = digimonData.getAsJsonArray("fields");
             
             
            
             
            
             
             digimonPanel panel = new digimonPanel();
             panel.etq_nombre.setText(name);
             panel.setImagen(image);
             contentDigimones.setBorder(new EmptyBorder(10, 10, 10, 10));
             
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    JsonObject digimonData = temp; 
                    System.out.println(name);
                    PanelDetalles ventana = new PanelDetalles(digimonData,levels,attributes,fields, types, consumoapi);

                    
                }
            });
           
             contentDigimones.add(panel);
             
              
           
         }

         contentDigimones.revalidate();
         contentDigimones.repaint();
     }
 }
    
    
 
    
    public void cargarPaginador(){
        
      contentPaginador.removeAll();
        
        int final_pag =  291;
        int  primera_pag = 0;
        
        
        JButton btn_primer_pag = new JButton();
        btn_primer_pag.setText("<<");
        contentPaginador.add(btn_primer_pag);
                
         btn_primer_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = primera_pag;
                   contentDigimones.removeAll();
                   ConsumoDigimones();
                    cargarPaginador();
                }
            });
         
         
        
        
        JButton btn_anterior_pag = new JButton();
        btn_anterior_pag.setText("<");
        contentPaginador.add(btn_anterior_pag);
         btn_anterior_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    if(pagina > 0){
                        pagina--;
                        contentDigimones.removeAll();
                        ConsumoDigimones();
                        cargarPaginador();
                    }
                   
                }
            });
        
    
        for (int i=0; i<listaNumeros.length; i++) {
            int num_pagina = pagina + i;

            if ( num_pagina <= final_pag){
                
                JButton btn = new JButton();
                contentPaginador.add(btn);

                btn.setText(Integer.toString(num_pagina + 1));
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pagina = num_pagina; 
                        
                       contentDigimones.removeAll();
                       ConsumoDigimones();
                       cargarPaginador();
                    }
                });
                
            }
        }
        
         
         
        JButton btn_siguiente_pag = new JButton();
        btn_siguiente_pag.setText(">");
        contentPaginador.add(btn_siguiente_pag);
        
        
         btn_siguiente_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina++;
                   
                   contentDigimones.removeAll();
                   ConsumoDigimones();
                   cargarPaginador();
                    
                }
        });
        
        
        
        JButton btn_ultima_pag = new JButton();
        btn_ultima_pag.setText(">>");
        contentPaginador.add(btn_ultima_pag);
        
        
         btn_ultima_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = final_pag;
                   contentDigimones.removeAll();
                   ConsumoDigimones();
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
    private javax.swing.JPanel contentDigimones;
    private javax.swing.JPanel contentPaginador;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
