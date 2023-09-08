import java.util.Date;



public class CajeroElectronico{

    int capacidadTotal; // dinero limite cajero
    int DineroDisponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String NombreBanco;
    String listaTransacciones [];
    String UsuarioAdmin;
    String ClaveAdmin;



    // constructor
    public CajeroElectronico(int capacidadTotal, int DineroDisponible, int cant_10, int cant_20, int cant_50, int cant_100, String NombreBanco, String UsuarioAdmin, String ClaveAdmin){

        // como tienen nombre igual puede dar ningun resultado

        //se soluciona con this para acceder al valor
        this.capacidadTotal = capacidadTotal;
        this.DineroDisponible = DineroDisponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.NombreBanco = NombreBanco;
        this.UsuarioAdmin  = UsuarioAdmin;
        this.ClaveAdmin = ClaveAdmin;


        listaTransacciones = new String[100];
    


    }



    public CajeroElectronico(int capacidadTotal, String NombreBanco, String UsuarioAdmin, String ClaveAdmin){
        this.capacidadTotal = capacidadTotal;
        this.NombreBanco = NombreBanco;
        this.UsuarioAdmin  = UsuarioAdmin;
        this.ClaveAdmin = ClaveAdmin;

        this.DineroDisponible = 0;
        this.cant_10 = 0;
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;


        listaTransacciones = new String[100];
    }


    public void imprimirEstado(){

        System.out.println("capacidad total: " +capacidadTotal);
        System.out.println("dineroDisponible: " +DineroDisponible);
        System.out.println("cant_10: " +cant_10);
        System.out.println("cant_20: " +cant_20);
        System.out.println("cant_50: " +cant_50);
        System.out.println("cant_100: " +cant_100);
        System.out.println("nombreBanco: " +NombreBanco);
        System.out.println("usuarioAdmin: " +UsuarioAdmin);
        System.out.println("ClaveAdmin: " +ClaveAdmin);
        System.out.println(" historial Transacciones: ");
        for (int i = 0; i < listaTransacciones.length; i++) {
            if(listaTransacciones[i] != null){
                System.out.println("  =>  " +listaTransacciones[i]);
            }
            
        }
        
        System.out.println(" ---------------------------------");

    }

     public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
        
        // calcular total ingresado

        int total = (cant_10 * 10000) + (cant_20 * 20000)+ (cant_50 * 50000) + (cant_100 * 100000);
        //validar que no exceda el limite

        if( total <= capacidadTotal){
             // SI. almacenar datos en los atributos y return true
            DineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;

            System.out.println(" -----CAJERO RECARGADO------");
            registrarTransaccion("ABASTECER","0000 0000 0000 0000", total, "OK");
            return true;

             // no. imprimir mensaje y return false
        }else{
            
             registrarTransaccion("ABASTECER","0000 0000 0000 0000", total, "ERROR");
            return false;
        }

       

    }

    public void registrarTransaccion( String tipo, String numeroTarjeta, int monto, String estado){
        Date fecha = new Date(); //objeto que crea fecha actual y toostring es para que no se meustre en pantalla no se que cosa

        String texto = fecha.toString() +" - " +tipo+ " - "+ numeroTarjeta+ " - "+monto+ " - " +estado;


        int indice = -1;
        for (int i = 0; i < listaTransacciones.length; i++) {
            if(listaTransacciones[i] == null){
                indice  = i;
                break;
            }
            
        }
        if( indice != -1){
            listaTransacciones[indice] = texto;
        }else{
            for (int i = 0; i < listaTransacciones.length; i++) {
                listaTransacciones[i] = listaTransacciones[i+1];
                
            }

            listaTransacciones[listaTransacciones.length - 1] = texto;
        }

    }


    public void consignarDineroaTarjeta(TarjetaDebito tarjeta, int monto){
        
        if(monto > 0){
            if(tarjeta.getestadotarjeta().equals("ACTIVA")){
                tarjeta.aumentarSaldo(monto);
                DineroDisponible -= monto;
                registrarTransaccion("CONSIGNACION", TarjetaDebito.getnumerotarjeta(), monto, "OK");
                System.out.println("Consignación exitosa en la tarjeta " + TarjetaDebito.getnumerotarjeta() +
                        ". Nuevo saldo de la tarjeta: " + tarjeta.getCantidadDineroTarjeta(monto));


            }else{
             registrarTransaccion("CONSIGNACION", TarjetaDebito.getnumerotarjeta(),monto, tarjeta.getestadotarjeta() );
              System.out.println("No se puede consignar a la tarjeta. Su estado es: " +tarjeta.getestadotarjeta() );

            }

           
        }
        

        }

        
    
    


   public void retirarDineroTarjeta(TarjetaDebito tarjeta, int monto) {
    if (monto > 0) {
        if (tarjeta.getestadotarjeta().equals("ACTIVA")) {
            if (monto <= tarjeta.getCantidadPermitidoRetirar() && monto <= tarjeta.getCantidadDineroTarjeta(monto)) {
                tarjeta.disminuirSaldo(monto);
                DineroDisponible += monto;
                registrarTransaccion("RETIRO", tarjeta.getnumerotarjeta(), monto, "OK");
                System.out.println("Retiro exitoso en la tarjeta " + tarjeta.getnumerotarjeta() +
                        ". Nuevo saldo de la tarjeta: " + tarjeta.getCantidadDineroTarjeta(monto));
            } else {
                registrarTransaccion("RETIRO", tarjeta.getnumerotarjeta(), monto, " Fondos insuficientes o límite de retiro excedido.");
                System.out.println("Fondos insuficientes o límite de retiro excedido.");
            }
            } else if (tarjeta.getestadotarjeta().equals("BLOQUEDA")) {
             registrarTransaccion("RETIRO", tarjeta.getnumerotarjeta(), monto, "NO SE PUEDE RETIRAR DE LA TARJETA");
            System.out.println("No se puede retirar de la tarjeta. Su estado es: " + tarjeta.getestadotarjeta());
        
            } else if (tarjeta.getestadotarjeta().equals("SUSPENDIDA")){
            registrarTransaccion("RETIRO", tarjeta.getnumerotarjeta(), monto, "NO SE PUEDE RETIRAR DE LA TARJETA");
            System.out.println("No se puede retirar de la tarjeta. Su estado es: " + tarjeta.getestadotarjeta());
            }
        }

            
    }
    

    }
    

  


        
    

   
