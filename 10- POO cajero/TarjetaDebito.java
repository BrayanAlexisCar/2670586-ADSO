import java.util.Date;

public class TarjetaDebito{

    String  nombrePropietario;
    static String  numerotarjeta;
    String  nombrebanco;
    int  CantidadDineroTarjeta;
    int  CantidadPermitidoRetirar;
    String [] Ultimastransacciones;
    String  Clave;
    String estadotarjeta;



      public TarjetaDebito(String nombrePropietario, String numerotarjeta, String nombrebanco, int  CantidadDineroTarjeta, int CantidadPermitidoRetirar, String Clave, String estadotarjeta) {
            this.nombrePropietario = nombrePropietario;
            this.numerotarjeta = numerotarjeta;
            this.nombrebanco = nombrebanco;
            this. CantidadDineroTarjeta =  CantidadDineroTarjeta;
            this.CantidadPermitidoRetirar = CantidadPermitidoRetirar;
            this.Clave = Clave;
            this.estadotarjeta = estadotarjeta;
            this.Ultimastransacciones = new String[100];
        
    }   


    public void imprimirTarjeta(){

        System.out.println("Nombre propietario: " +nombrePropietario);
        System.out.println("Numero tarjeta: " +numerotarjeta);
        System.out.println("Nombre del banco: " +nombrebanco);
        System.out.println("cantidad de dinero en la tarjeta: " +CantidadDineroTarjeta);
        System.out.println("cantidad pemitida a retirar: " +CantidadPermitidoRetirar);
        System.out.println("clave: " +Clave);
        System.out.println("Estado de la tarjeta: " +estadotarjeta);
        System.out.println(" ultimas Transacciones: ");
        for (int i = 0; i < Ultimastransacciones.length; i++) {
            if(Ultimastransacciones[i] != null){
                System.out.println("  =>  " +Ultimastransacciones[i]);
            }
            
        }
        
        System.out.println(" ---------------------------------");
   
        System.out.println(" ---------------------------------");

    }


    public void disminuirSaldo(int monto){

        if(estadotarjeta.equals("ACTIVA")){
            if (monto <= CantidadPermitidoRetirar && monto <= CantidadDineroTarjeta) {
                CantidadDineroTarjeta = CantidadDineroTarjeta - monto;
               registrarTransaccion("RETIRO", monto, "OK");
                System.out.println("Retiro exitoso. Nuevo saldo de la tarjeta: " + CantidadDineroTarjeta);

                }else{
                     System.out.println("Fondos insuficientes o limite de retiro excedido.");
                }      
   
            }else if(estadotarjeta.equals("BLOQUEADA")){
                  System.out.println("Retiro Fallido.  su cuenta esta bloqueada " );

            }else if(estadotarjeta.equals("SUSPENDIDA")){
                    System.out.println("Retiro Fallido.  su cuenta esta Suspendida " );

            }
                
              
    }


    public void aumentarSaldo(int monto){

        if(estadotarjeta.equals("ACTIVA")){
            CantidadDineroTarjeta += monto;
                registrarTransaccion("DEPOSTIO", monto, "OK");
                System.out.println("Deposito exitoso. Nuevo saldo de la tarjeta: " + CantidadDineroTarjeta);


            }else if( estadotarjeta.equals("BLOQUEADA")){
                System.out.println("Deposito Fallido.  su cuenta esta bloqueada" );
            
            } else if( estadotarjeta.equals("SUSPENDIDA")){
                System.out.println("Retiro Fallido.  su cuenta esta Suspendida " );
                           
            }
        }


        public void registrarTransaccion( String tipotransaccion, int monto, String estado){
        Date fecha = new Date(); //objeto que crea fecha actual y toostring es para que no se meustre en pantalla no se que cosa

        String texto = fecha.toString() +" - " +tipotransaccion+ " - " +monto+ " - " +estado;


        int indice = -1;
        for (int i = 0; i < Ultimastransacciones.length; i++) {
            if(Ultimastransacciones[i] == null){
                indice  = i;
                break;
            }
            
        }
        if( indice != -1){
            Ultimastransacciones[indice] = texto;
        }else{
            for (int i = 0; i < Ultimastransacciones.length; i++) {
                Ultimastransacciones[i] = Ultimastransacciones[i+1];
                
            }

            Ultimastransacciones[Ultimastransacciones.length - 1] = texto;
        }

    }


        

        public int getCantidadDineroTarjeta(  int cantidad) {
            return cantidad;
        }


        public static String getnumerotarjeta() {
            return numerotarjeta ;
        }


     


        public String getestadotarjeta( ) {
            return estadotarjeta;
        }


        public int getCantidadPermitidoRetirar() {
            return CantidadPermitidoRetirar;
        }


    


    
}



