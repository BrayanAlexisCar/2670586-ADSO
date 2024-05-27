package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    int listaNumeros [];
    
    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.pagina = 1;
        this.listaNumeros = new int[7]; 
        
        initComponents();
        initAlternComponents();
        cargarPokemones();
        cargarPaginador();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();
        panelDetalle = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("POKEMON");

        panelBotones.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panelBotones);

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelPaginador.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initAlternComponents(){
        setTitle("POKEDEX");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")) );
        setLocationRelativeTo(null);
        setVisible(true);  
        
    }
    
    public void cargarPokemones(){
        int offset = (this.pagina*20)-20;
        String endpoint = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";
        String data = this.consumo.consumoGET(endpoint);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("results");
        for (int i=0; i<results.size(); i++) {
            JsonObject temp = results.get(i).getAsJsonObject();
            
            JButton btn = new JButton( temp.get("name").getAsString() );
            panelBotones.add(btn);
            
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Nombre: "+ temp.get("name").getAsString());
                    System.out.println("Url: "+temp.get("url").getAsString());
                    
                    panelDetalle.removeAll();
                    DetallePokemon detalle = new DetallePokemon( temp );
                    detalle.setSize( panelDetalle.getSize() );
                    detalle.setPreferredSize( panelDetalle.getPreferredSize() );
                    panelDetalle.add(detalle);
                    
                    revalidate();
                    repaint();
                }
            });
        }
        
        panelDetalle.removeAll();
        DetallePokemon detalle = new DetallePokemon( results.get(0).getAsJsonObject() );
        detalle.setSize( panelDetalle.getSize() );
        detalle.setPreferredSize( panelDetalle.getPreferredSize() );
        panelDetalle.add(detalle);
        
        revalidate();
        repaint();
    }
    
    
    public void cargarPaginador(){
        panelPaginador.removeAll();
      
        
        int final_pag = 66;
        int  primera_pag = 1;
        
        
        JButton btn_primer_pag = new JButton();
        btn_primer_pag.setText("<<");
        panelPaginador.add(btn_primer_pag);
                
         btn_primer_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = primera_pag;
                   panelBotones.removeAll();
                   cargarPokemones();
                    cargarPaginador();
                }
            });
         
         
        
        
        JButton btn_anterior_pag = new JButton();
        btn_anterior_pag.setText("<");
        panelPaginador.add(btn_anterior_pag);
         btn_anterior_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    if(pagina > 1){
                        pagina--;
                        panelBotones.removeAll();
                        cargarPokemones();
                        cargarPaginador();
                    }
                   
                }
            });
        
    
        for (int i=0; i<listaNumeros.length; i++) {
            int num_pagina = pagina + i;

            if ( num_pagina <= final_pag){
                
                JButton btn = new JButton();
                panelPaginador.add(btn);

                btn.setText(Integer.toString(num_pagina));
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pagina = num_pagina; 
                        
                        panelBotones.removeAll();
                       cargarPokemones();
                       cargarPaginador();
                    }
                });
                
            }
        }
        
         
         
        JButton btn_siguiente_pag = new JButton();
        btn_siguiente_pag.setText(">");
        panelPaginador.add(btn_siguiente_pag);
        
        
         btn_siguiente_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina++;
                   
                   panelBotones.removeAll();
                   cargarPokemones();
                   cargarPaginador();
                    
                }
        });
        
        
        
        JButton btn_ultima_pag = new JButton();
        btn_ultima_pag.setText(">>");
        panelPaginador.add(btn_ultima_pag);
        
        
         btn_ultima_pag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = final_pag;
                   panelBotones.removeAll();
                   cargarPokemones();
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
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
