import java.util.Scanner;



public class Principal{
   
    public static void main(String[]args){

        
        CajeroElectronico  cajero1 = new CajeroElectronico(3000000, 1000000, 6, 10, 30, 34, "ADSOBANCO" , "Elviscocho", "contrasena123");
        cajero1.imprimirEstado();


        CajeroElectronico  cajero2 = new CajeroElectronico(150000000, "davivienda", "colombia", "parce");
        cajero2.imprimirEstado();

        // metodos sobreccargados caundo tienen el mismo nombre

        System.out.println();


        cajero1.abastecerCajero(1000, 1000, 500, 500);
        cajero2.abastecerCajero(2000, 2000, 500, 500);

        cajero2.imprimirEstado();

        System.out.println();


        TarjetaDebito tarjeta1 = new TarjetaDebito("brayan", "3212342343", "BANCOLOMBIA", 4000000, 500000, "Cocacolca", "ACTIVA");

        TarjetaDebito tarjeta2 = new TarjetaDebito("POPEYE", "234232112", "BBVA", 500000, 1000000, "PEPSI", "ACTIVA");

        TarjetaDebito tarjeta3 = new TarjetaDebito("ALFONSO", "123112", "BANCOLOMBIA", 60000, 1000000, "COLOMBIANA", "BLOQUEADA");

        TarjetaDebito tarjeta4 = new TarjetaDebito("JOHN WICK", "6663434", "AV VILLAS", 8000000, 2000000, "ASESINO123", "ACTIVA");

        TarjetaDebito tarjeta5 = new TarjetaDebito("ADOLFO", "6623423", "CAJA SOCIAL", 200000, 700000, "CINEFILO", "SUSPENDIDA");


        tarjeta1.imprimirTarjeta();
        tarjeta2.imprimirTarjeta();
        tarjeta3.imprimirTarjeta();
        tarjeta4.imprimirTarjeta();
        tarjeta5.imprimirTarjeta();

        System.out.println();


        tarjeta1.disminuirSaldo(990000);
        tarjeta1.imprimirTarjeta();



        tarjeta2.aumentarSaldo(400000);
        tarjeta2.imprimirTarjeta();


        tarjeta3.disminuirSaldo(100000);
        tarjeta3.imprimirTarjeta();

        tarjeta4.disminuirSaldo(1000000);
        tarjeta4.imprimirTarjeta();


        tarjeta5.aumentarSaldo(800000);
        tarjeta5.imprimirTarjeta();


        cajero1.consignarDineroaTarjeta(tarjeta2, 100000);
        tarjeta2.imprimirTarjeta();
        

        cajero1.consignarDineroaTarjeta(tarjeta3, 100000);
        tarjeta3.imprimirTarjeta();



        cajero1.retirarDineroTarjeta(tarjeta5, 400000);
        tarjeta5.imprimirTarjeta();




    }


}