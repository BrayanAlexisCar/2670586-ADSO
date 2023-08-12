import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el precio de la gasolina por KM: ");
        double preciogasoporKM = scanner.nextDouble();
        scanner.nextLine();


        System.out.print("Ingrese la ciudad origen: ");
        String ciudadorigen = scanner.nextLine();
        
        System.out.print("Ingrese la cantidad de paradas: ");
        int cantidadParadas = scanner.nextInt();
        scanner.nextLine();
        
        
      
        
        double consumototal= 0.0;



        double  mistrato_mistrato = 5.0;
        double  mistrato_pueblorico = 81.5;
        double  mistrato_quinchia = 57.9;
        double  mistrato_santaRosa= 98.5;
        double  mistrato_santuario=70.5;

        double pueblorico_puebloRico = 5.0;
        double pueblorico_mistrato= 81.7;
        double pueblorico_quinchia = 103.0;
        double pueblorico_santaRosa= 102.0;
        double pueblorico_santuario=34.5;


        double quinchia_quinchia = 5.0;
        double quinchia_mistrato = 53.5;
        double quinchia_pueblorico = 103.0;
        double quinchia_santarosa = 83.5;
        double quinchia_santuario= 109.0;

        double santarosa_santarosa = 5.0;
        double santarosa_mistrato = 99.8;
        double santarosa_pueblorico = 103.0;
        double santarosa_quinchia = 83.2;
        double santarosa_santuario= 76.4;


        double santuario_santuario = 5.0;
        double santuario_mistrato = 70.4;
        double santuario_pueblorico = 34.3;
        double santuario_quinchia = 109.0;
        double santuario_santarosa= 75.2;
        
        for (int i = 0; i < cantidadParadas; i++) {
            System.out.print("Ingrese la ciudad donde va a hacer la parada" + (i + 1) + ": ");
            String ciudadParada = scanner.nextLine();

            double distancia = 0.0;

            //mistrato

             if (ciudadorigen.equals("mistrato")) {
                if (ciudadParada.equals("mistrato")) distancia = mistrato_mistrato;
                else if (ciudadParada.equals("pueblo rico")) distancia = mistrato_pueblorico;
                else if (ciudadParada.equals("quinchia")) distancia = mistrato_quinchia;
                else if (ciudadParada.equals("santa rosa ")) distancia = mistrato_santaRosa;
                else if (ciudadParada.equals("santuario")) distancia = mistrato_santuario;


            //pueblo rico
            } else if (ciudadorigen.equals("pueblo rico")) {
                if (ciudadParada.equals("pueblo rico")) distancia = pueblorico_puebloRico;
                    else if (ciudadParada.equals("mistrato")) distancia = pueblorico_mistrato;
                    else if (ciudadParada.equals("quinchia")) distancia = pueblorico_quinchia;
                    else if (ciudadParada.equals("santa rosa ")) distancia = pueblorico_santaRosa;
                    else if (ciudadParada.equals("santuario")) distancia = pueblorico_santuario;



                //quinchia
            }else if (ciudadorigen.equals("quinchia")) {
                if (ciudadParada.equals("quinchia")) distancia = quinchia_quinchia;
                    else if (ciudadParada.equals("mistrato")) distancia = quinchia_mistrato;
                    else if (ciudadParada.equals("pueblo rico")) distancia = quinchia_pueblorico;
                    else if (ciudadParada.equals("santa rosa ")) distancia = quinchia_santarosa;
                    else if (ciudadParada.equals("santuario")) distancia = quinchia_santuario;
        


                // santa rosa
            }else if (ciudadorigen.equals("santa rosa")) {
                if (ciudadParada.equals("santa rosa")) distancia = santarosa_santarosa;
                    else if (ciudadParada.equals("mistrato")) distancia = santarosa_mistrato;
                    else if (ciudadParada.equals("pueblo rico")) distancia = santarosa_pueblorico;
                    else if (ciudadParada.equals("quinchia")) distancia = santarosa_quinchia;
                    else if (ciudadParada.equals("santuario")) distancia = santarosa_santuario;

                    
                    //santuario
            }else if (ciudadorigen.equals("santuario")) {
                if (ciudadParada.equals("santuario")) distancia = santuario_santuario;
                    else if (ciudadParada.equals("mistrato")) distancia = santuario_mistrato;
                    else if (ciudadParada.equals("pueblo rico")) distancia = santuario_pueblorico;
                    else if (ciudadParada.equals("quinchia")) distancia = santuario_quinchia;
                    else if (ciudadParada.equals("santa rosa")) distancia = santuario_santarosa;

            }

            consumototal = consumototal + distancia;

        }

        double costototal = consumototal * preciogasoporKM;
       
        System.out.println("El consumo total de gasolina es de: " + consumototal + " km.");
        System.out.println("El costo en pesos de la gasolina  es de: " + costototal + " pesos.");
    }


}