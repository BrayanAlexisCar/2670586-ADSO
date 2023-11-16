import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // para eventos de clickç


public class Buscaminas extends JFrame{


   
    //initcomponent para  visualizar elem
    //constructor
    public Buscaminas(){
        initComponent();
        
    }


    public void initComponent(){

        setTitle("BuscaMinas"); 
	    setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") )); // para poner imagen a la aplicacion
        setSize(340,430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false); // para no estirar la ventana

        
        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.white); // O CON new Color(0,0,0)
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etq_titulo_020 = new JLabel();
        etq_titulo_020.setText("020");
        etq_titulo_020.setFont(new Font("Arial", Font.BOLD, 30));
        etq_titulo_020.setHorizontalAlignment(JLabel.CENTER);
        etq_titulo_020.setBackground(Color.BLACK); 
        etq_titulo_020.setForeground(Color.RED);
        etq_titulo_020.setOpaque(true);
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 0;
        restricciones.gridwidth = 4; 
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 30; // todo el ancho 
        restricciones.weightx = 0; // filas
        restricciones.insets = new Insets(0,10,3,10);
        restricciones.fill = GridBagConstraints.BOTH; // para decirle como se va a distribuir 
        contenedor.add(etq_titulo_020, restricciones);
        restricciones.insets = new Insets(0,0,0,0);
        

        JButton etq_titulo_emoji = new JButton();
        etq_titulo_emoji.setText(":)");
        etq_titulo_emoji.setFont(new Font("Arial", Font.BOLD, 30));
        restricciones.gridx = 4; //coordenada en X
        restricciones.gridy = 0;
        restricciones.gridwidth = 3; 
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 40; // todo el ancho 
        restricciones.weightx = 0; // filas
        restricciones.insets = new Insets(0,20,3,20);
        restricciones.fill = GridBagConstraints.BOTH; // para decirle como se va a distribuir 
        contenedor.add(etq_titulo_emoji, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        
        JLabel etq_titulo_000 = new JLabel();
        etq_titulo_000.setText("000");
        etq_titulo_000.setFont(new Font("Arial", Font.BOLD, 30));
        etq_titulo_000.setHorizontalAlignment(JLabel.CENTER);
        etq_titulo_000.setBackground(Color.BLACK); 
        etq_titulo_000.setForeground(Color.RED);
        etq_titulo_000.setOpaque(true);
        restricciones.gridx = 7; //coordenada en X
        restricciones.gridy = 0;
        restricciones.gridwidth = 4; 
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 30; // todo el ancho 
        restricciones.weightx = 0; // filas
        restricciones.insets = new Insets(0,15,3,15);
        restricciones.fill = GridBagConstraints.BOTH; // para decirle como se va a distribuir 
        contenedor.add(etq_titulo_000, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        
        int filas = 10;
        int columnas = 10;

        //fila 0
        JButton [][]tabla = new JButton [filas][columnas];
        for (int i = 1; i < filas; i++) {
             for(int j = 1; j < columnas; j++) {

              
                tabla[i][j] = new JButton();    
                restricciones.gridx = j; // columan
                restricciones.gridy = i; //fila
                restricciones.gridwidth = 1; 
                restricciones.gridheight = 1;
                restricciones.weightx = 0;
                restricciones.weighty = 1;
                restricciones.insets = new Insets(0,0,0,0);
                restricciones.fill = GridBagConstraints.BOTH;
                contenedor.add(tabla[i][j], restricciones);
                restricciones.insets = new Insets(0,0,0,0);


                
                }

          
            
        }
       


        add(contenedor);
        setVisible(true);
        revalidate(); //renderizar correctamente los elementos
    }

}


