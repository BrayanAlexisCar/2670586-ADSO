import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // para eventos de click
import javax.swing.BorderFactory;


public class Factura extends JFrame{


    //initcomponent para  visualizar elem
    //constructor
    public Factura(){
        initComponent();
        
    }


    public void initComponent(){

        setTitle("Simulador de Factura"); 
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") )); // para poner imagen a la aplicacion
        setSize(620,690);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false); // para no estirar la ventana

        
        JPanel contenedor = new JPanel();
        contenedor.setBackground(new Color(244,244,244)); 
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();
      
      
       

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("DATOS CLIENTE:");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 22));
        etq_titulo.setHorizontalAlignment(JLabel.LEFT);;
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 0;
        restricciones.gridwidth =  1; // 1 celda acnho
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 0; // todo el ancho 
        restricciones.weighty = 0; // todas als filas
        restricciones.fill = GridBagConstraints.BOTH; // para decirle cómo se va a distribuir
        contenedor.add(etq_titulo, restricciones);

        JLabel etq_cedula_cliente = new JLabel();
        etq_cedula_cliente.setText("CEDULA:");
        etq_cedula_cliente.setFont(new Font("Arial", Font.BOLD, 13));
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 0;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula_cliente, restricciones);
     
       


        JTextField campo_cedula_cliente = new JTextField();
        campo_cedula_cliente.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,0,0,0);// margen dentro de la celda
        contenedor.add(campo_cedula_cliente, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);


       
        JButton btn_cedula_cliente = new JButton();
        btn_cedula_cliente.setText("BUSCAR");
        restricciones.gridx = 4;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 0;
        //restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,0,0);// margen dentro de la celda
        contenedor.add(btn_cedula_cliente, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);  // para reestablecer el tamaño
        

        JLabel etq_nombres_cliente = new JLabel();
        etq_nombres_cliente.setText("NOMBRES:");
        etq_nombres_cliente.setHorizontalAlignment(JLabel.LEFT);
        etq_nombres_cliente.setFont(new Font("Arial", Font.BOLD, 13));
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 2;
        restricciones.gridwidth = 1; //  celdas a lo ancho
        restricciones.gridheight = 1; // elda a lo alto
        restricciones.weightx = 0; // todo el ancho 
        restricciones.weighty = 0; // filas
        restricciones.insets = new Insets(12,0,0,0);
        //restricciones.fill = GridBagConstraints.BOTH; // para decirle como se va a distribuir 
        contenedor.add(etq_nombres_cliente, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);
        
   

        JLabel etq_direccion_cliente = new JLabel();
        etq_direccion_cliente.setText("DIRECCION:");
        etq_direccion_cliente.setHorizontalAlignment(JLabel.LEFT);
        etq_direccion_cliente.setFont(new Font("Arial", Font.BOLD, 13));
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 3;
        restricciones.gridwidth = 1; //  celdas a lo ancho
        restricciones.gridheight = 1; // elda a lo alto
        restricciones.weightx = 0; // todo el ancho 
        restricciones.weighty = 0; // filas
         restricciones.insets = new Insets(12,0,10,0);
        //restricciones.fill = GridBagConstraints.BOTH; // para decirle como se va a distribuir 
        contenedor.add(etq_direccion_cliente, restricciones);
         restricciones.insets = new Insets(0,0,0,0);




         //VENDEDOR
        
        JLabel etq_titulo_vendedor = new JLabel();
        etq_titulo_vendedor.setText("DATOS VENDEDOR:");
        etq_titulo_vendedor.setFont(new Font("Arial", Font.BOLD, 22));
        etq_titulo_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 4;
        restricciones.gridwidth =  1; 
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 0; // todo el ancho 
        restricciones.weighty = 0; // filas
        restricciones.fill = GridBagConstraints.BOTH; // para decirle cómo se va a distribuir
        restricciones.insets = new Insets(10,0,0,0);
        contenedor.add(etq_titulo_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);



        JLabel etq_cedula_vendedor = new JLabel();
       
        etq_cedula_vendedor.setText("CEDULA:");
        etq_cedula_vendedor.setFont(new Font("Arial", Font.BOLD, 13));
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula_vendedor, restricciones);
     
       


        JTextField campo_cedula_vendedor = new JTextField();
        campo_cedula_vendedor.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,0,0,0);// margen dentro de la celda
        contenedor.add(campo_cedula_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);


       
        JButton btn_cedula_vendedor = new JButton();
        btn_cedula_vendedor.setText("BUSCAR");
        restricciones.gridx = 4;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        //restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,0,0);// margen dentro de la celda
        contenedor.add(btn_cedula_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);  // para reestablecer el tamaño


         JLabel etq_nombres_vendedor = new JLabel();
        etq_nombres_vendedor.setText("NOMBRES:");
        etq_nombres_vendedor.setHorizontalAlignment(JLabel.LEFT);
        etq_nombres_vendedor.setFont(new Font("Arial", Font.BOLD, 13));
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 6;
        restricciones.gridwidth = 1; //  celdas a lo ancho
        restricciones.gridheight = 1; // elda a lo alto
        restricciones.weightx = 0; // todo el ancho 
        restricciones.weighty = 0; // filas
        restricciones.insets = new Insets(15,0,0,0);
        //restricciones.fill = GridBagConstraints.BOTH; // para decirle como se va a distribuir 
        contenedor.add(etq_nombres_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);



        // LISTA PRODUCTOS

        JLabel etq_lista_productos = new JLabel();
        etq_lista_productos.setText("LISTA PRODUCTOS FACTURADOS:");
        etq_lista_productos.setHorizontalAlignment(JLabel.LEFT);
        etq_lista_productos.setFont(new Font("Arial", Font.BOLD, 20));
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 7;
        restricciones.gridwidth = 1; //  celdas a lo ancho
        restricciones.gridheight = 1; // elda a lo alto
        restricciones.weightx = 0; // todo el ancho 
        restricciones.weighty = 0; // filas
        restricciones.insets = new Insets(25,0,0,0);
        restricciones.fill = GridBagConstraints.NONE; // para decirle como se va a distribuir 
        contenedor.add(etq_lista_productos, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);



        JLabel etq_id = new JLabel();
        etq_id.setText("ID");
        etq_id.setFont(new Font("Arial", Font.BOLD, 13));
        etq_id.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 5; // todo el ancho
        restricciones.weighty = 0; // filas
        restricciones.insets = new Insets(15,0,0,5); 
        restricciones.fill = GridBagConstraints.BOTH;// para decirle cómo se va a distribuir
        contenedor.add(etq_id, restricciones);
        restricciones.insets = new Insets(0,0,0,0);
        
        JLabel etq_nombre_lista = new JLabel();
        etq_nombre_lista.setText("NOMBRE");
        etq_nombre_lista.setFont(new Font("Arial", Font.BOLD, 13));
        etq_nombre_lista.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 1; //coordenada en X
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 20; // todo el ancho
        restricciones.weighty = 0; // filas
        restricciones.insets = new Insets(15,0,0,5);
        restricciones.fill = GridBagConstraints.BOTH; // para decirle cómo se va a distribuir
        contenedor.add(etq_nombre_lista, restricciones);
        restricciones.insets = new Insets(0,0,0,0);
        
        JLabel etq_cantidad = new JLabel();
        etq_cantidad.setText("CANT");
        etq_cantidad.setFont(new Font("Arial", Font.BOLD, 13));
        etq_cantidad.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 3; //coordenada en X
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 0; // todo el ancho
        restricciones.weighty = 0; // filas
        restricciones.insets = new Insets(15,0,0,5);
        restricciones.fill = GridBagConstraints.BOTH; // para decirle cómo se va a distribuir
        contenedor.add(etq_cantidad, restricciones);
        restricciones.insets = new Insets(0,0,0,0);



        JTextField cuadro1 = new JTextField();
        cuadro1.setSize(0, 15);  // Establece la altura del cuadro
        cuadro1.setBorder(BorderFactory.createLineBorder(new Color(12,183,242))); // Agregar un borde rojo
        restricciones.gridx = 0;
        restricciones.gridy = 9; // Coloca estos cuadros abajo de otros componentes
        restricciones.gridwidth = 1; // Ocupa todo el ancho
        restricciones.gridheight = 1;
        restricciones.weightx = 0; // Ocupa todo el ancho
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(cuadro1, restricciones);

        JTextField cuadro2 = new JTextField();
        cuadro2.setSize(0, 15); // Establece la altura del cuadro
        cuadro2.setBorder(BorderFactory.createLineBorder(new Color(12,183,242))); // Agregar un borde rojo
        restricciones.gridx = 1;
        restricciones.gridy = 9; // Coloca estos cuadros abajo de otros componentes
        restricciones.gridwidth = 1; // Ocupa todo el ancho
        restricciones.gridheight = 1;
        restricciones.weightx = 0; // Ocupa todo el ancho
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(cuadro2, restricciones);

        
        JTextField cuadro3 = new JTextField();
        cuadro3.setSize(0, 15); // Establece la altura del cuadro
        cuadro3.setBorder(BorderFactory.createLineBorder(new Color(12,183,242))); // Agregar un borde 

        restricciones.gridx = 3;
        restricciones.gridy = 9; // Coloca estos cuadros abajo de otros componentes
        restricciones.gridwidth = 1; // Ocupa todo el ancho
        restricciones.gridheight = 1;
        restricciones.weightx = 0; // Ocupa todo el ancho
        restricciones.weighty = 0 ;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(cuadro3, restricciones);

        

        JButton btn_add = new JButton();
        btn_add.setText("ADD");
        restricciones.gridx = 4;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        //restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,0,0);// margen dentro de la celda
        contenedor.add(btn_add, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);  // para reestablecer el tamaño


        JLabel etq_labelscroll = new JLabel();
        etq_labelscroll.setText("----");
        etq_labelscroll.setFont(new Font("Arial", Font.BOLD, 20));
        etq_labelscroll.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane( etq_labelscroll);
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 5;
        restricciones.gridheight = 1;
        restricciones.weightx = 30;
        restricciones.weighty = 90;
        restricciones.insets = new Insets(15,0,0,0);
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(scroll, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);  



        JLabel etq_total = new JLabel(); 
        etq_total.setText("Total: $0");
        etq_total.setFont(new Font("Arial", Font.BOLD, 20));
        restricciones.gridx = 4;
        restricciones.gridy = 11;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_total, restricciones);
     
        
        add(contenedor);
        setVisible(true);
        revalidate(); //renderizar correctamente los elementos
    }

}