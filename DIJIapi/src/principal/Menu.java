
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.ModuleLayer.empty;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import util.ConsumoAPI;


public class Menu extends javax.swing.JFrame {
    
    JsonObject digimon;
    ConsumoAPI consumoapi;
    int pagina;
    String listaImagenes[];
    int posActual;
     
    public Menu() {
        initComponents();
        this.pagina = 1;
        this.listaImagenes = new String[1]; 
        this.consumoapi = new ConsumoAPI();
        
   
        iniAlternComponents();
        ConsumoDigimones();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contentDigimones = new javax.swing.JPanel();
        contentPaginador = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentDigimones.setBackground(new java.awt.Color(204, 204, 204));
        contentDigimones.setLayout(new java.awt.GridLayout(2, 3, 15, 9));

        contentPaginador.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPaginadorLayout = new javax.swing.GroupLayout(contentPaginador);
        contentPaginador.setLayout(contentPaginadorLayout);
        contentPaginadorLayout.setHorizontalGroup(
            contentPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        contentPaginadorLayout.setVerticalGroup(
            contentPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

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
                        .addGap(199, 199, 199)
                        .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(contentDigimones, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentDigimones, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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
    
    
    
    
    public void  ConsumoDigimones(){
         
        //int offset = (this.pagina*20)-20;
        String endpoint = "https://digi-api.com/api/v1/digimon";
        String data = this.consumoapi.consumoGET(endpoint);
        
        
        JsonObject infoAPI = JsonParser.parseString(data).getAsJsonObject();
        JsonArray registros = infoAPI.getAsJsonArray("content");
        
        if(registros.size() > 0){
            for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            
            //datos de la api
            String name = temp.get("name").getAsString();
            String href = temp.get("href").getAsString();
            
            String image = temp.get("image").getAsString();
            
              
            
           JButton boton_digi = new JButton();
            boton_digi.setBackground(Color.white);
            boton_digi.setForeground(Color.black);
            boton_digi.setText(name);      
            Font Fuente = new Font("Comic Sans MS", Font.BOLD, 14);
            boton_digi.setFont(Fuente);
            
            boton_digi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                    JsonObject digimonData = temp; 
                    PanelDetalles ventana = new PanelDetalles( digimonData);
                    ventana.setVisible(true);
                }
            });
            
            
            
            contentDigimones.add(boton_digi);
            
            mostrar_img(image, boton_digi);
        }
      
        contentDigimones.revalidate();
        contentDigimones.repaint();
        
        } 
    }
    
    
    public void mostrar_img(String imagen, JButton boton){
         try {
            URL url = new URL(imagen);
            ImageIcon icon = new ImageIcon(url);
            Image image = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);
            boton.setIcon(icon);
            boton.setLayout(new BoxLayout(boton, BoxLayout.PAGE_AXIS));
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    
       
    
    public void DetallesPokemon(String name, String href) {
      
                    
        String consumoImagen = consumoapi.consumoGET(href);
        JsonObject detalles = JsonParser.parseString(consumoImagen).getAsJsonObject();
        JsonObject sprites = detalles.getAsJsonObject("sprites");


       
      
       // cargarImagenPokemon();

        
       
       
        
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentDigimones;
    private javax.swing.JPanel contentPaginador;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
