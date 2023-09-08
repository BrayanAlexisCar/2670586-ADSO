import java.util.Scanner;


public class Principal{
    public static void main(String[]args){



        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto =  new Scanner(System.in);

        Persona listapersonas [] = new Persona [99];
        

        listapersonas[0] = new Persona( 108800, "Oscar", "Loaiza", 85, 185, 300.5 );
		listapersonas[1] = new Persona( 108801, "Daniel", "Garcia", 32, 175, 110.8 );
		listapersonas[2] = new Persona( 108802, "Juan", "Perez", 20, 180, 50);
		listapersonas[3] = new Persona( 108803, "Daniela", "Soto", 25, 160, 55);
		listapersonas[4] = new Persona( 108804, "Andres", "Guzman", 18, 165, 50);

        int indicePersona = 5;
        int opcion = 0;

        while(opcion !=11){
            System.out.println("");

            System.out.println("---------------------------------");
            System.out.println("        MENU DE PERSONAS         ");
            System.out.println("---------------------------------");
            System.out.println("|                   MEMORIA: "+(99-indicePersona)+"  |");
            System.out.println("|  1:  registrar persona.        |");
            System.out.println("|  2:  ver lista de personas.    |");
            System.out.println("|  3:  editar persona.           |");
            System.out.println("|  4:  eliminar persona.         |");
            System.out.println("|  5:  Persona con mayor edad.   |");
            System.out.println("|  6:  persona con menor edad    |");
            System.out.println("|  7:  persona mas alta          |");
            System.out.println("|  8:  persona mas baja          |");
            System.out.println("|  9:  promedio de edades        |");
            System.out.println("|  10:  promedio de altura.      |");
            System.out.println("|  11:  salir.                   |");
            System.out.println("---------------------------------");
            System.out.println("INGRESE UNA OPCION (1 AL 5):");
            opcion = entrada_numero.nextInt();



            if(opcion == 1){

           
            System.out.println("---------------------------------");
            System.out.println("        REGISTRAR PERSONA       ");
            System.out.println("---------------------------------");

            System.out.print(" Ingrese la cedula:");
            int cedula = entrada_numero.nextInt();

           
            
            int encontrado = 0; // encontrado no registrado
            for( int i = 0; i<listapersonas.length; i++){

                if( listapersonas[i] != null && listapersonas[i].getCedula() == cedula){
                   System.out.print(" ------- ESA PERSONA YA ESTA REGISTRADA EN EL SISTEMA -------");
                   encontrado = 1; // encontrADO SI ESTA REGISTRADO
                  }

               }
               
                if( encontrado == 0){ // SI NO ESTA REGISTRADO, PEDIR DATOS
                    
                    System.out.print(" ingrese nombre:");
                    String nombres = entrada_texto.nextLine();
                    
                    System.out.print(" ingrese apellidos:");
                    String apellidos = entrada_texto.nextLine();
                    
                    System.out.print(" Ingrese la edad:");
                    int edad = entrada_numero.nextInt();

                    System.out.print(" Ingrese la altura:");
                    int altura = entrada_numero.nextInt();

                    System.out.print(" Ingrese el peso:");
                    double peso = entrada_numero.nextDouble();

                    Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
                    listapersonas[indicePersona] = temporal;
                    indicePersona++;
                

                  }
                  
               
                }
                
            
            if(opcion == 2){

            System.out.println("---------------------------------");
            System.out.println("        LISTA DE PERSONAS       ");
            System.out.println("---------------------------------");
                for( int i = 0; i < listapersonas.length; i++){
                    if(listapersonas[i] != null){
                       System.out.println( ( i + 1)+ " => " +listapersonas[i].getInfoInLine() );
                    }

                }


            }
          
            if(opcion == 3){
                // solicitar cedula
            System.out.println("---------------------------------");
            System.out.println("        EDITAR PERSONAS       ");
            System.out.println("---------------------------------");
            System.out.println("=> ingrese la cedula:");
            int cedula = entrada_numero.nextInt();

            // buscar si existe persona con esa cedula

           
            int indiceencontrada = -1;
            for( int i = 0; i<listapersonas.length; i++){

                if( listapersonas[i] != null && listapersonas[i].getCedula() == cedula){
                    indiceencontrada = i;
                }
            }

            
            //si existe, solicitar nuevos datos

            //si no, mostrar mensaje de error

            if(indiceencontrada != -1){

            System.out.print(" ingrese nombre:");
            String nombres = entrada_texto.nextLine();
            
            System.out.print(" ingrese apellidos:");
            String apellidos = entrada_texto.nextLine();
            
            System.out.print(" Ingrese la edad:");
            int edad = entrada_numero.nextInt();

            System.out.print(" Ingrese la altura:");
            int altura = entrada_numero.nextInt();

            System.out.print(" Ingrese el peso:");
            double peso = entrada_numero.nextDouble();

            Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
            listapersonas[indiceencontrada] = temporal;

            }else{
            System.out.println("---------------------------------");
            System.out.println("La cedula " +cedula+ " no corresponde a un usario del sistema" );
            System.out.println("---------------------------------");
            }
            

            }
            

            if(opcion == 4){
            System.out.println("---------------------------------");
            System.out.println("       ELIMINAR PERSONAS       ");
            System.out.println("---------------------------------");
            System.out.println("=> ingrese la cedula:");
            int cedula = entrada_numero.nextInt();

            // buscar si existe persona con esa cedula

           
            int indiceencontrada = -1;
            for( int i = 0; i<listapersonas.length; i++){

                if( listapersonas[i] != null && listapersonas[i].getCedula() == cedula){
                    indiceencontrada = i;
                }
            }

            // validar si existe peraona con esa cedula
            if(indiceencontrada != -1){
                for(int i = indiceencontrada; i < listapersonas.length -1; i++){

                    listapersonas[i] = listapersonas[i+1];
                }
                listapersonas[ listapersonas.length-1] = null;
                indicePersona = indicePersona - 1;

                System.out.println("---------------------------------");
                System.out.println("   PERSONA ELIMINADA CON EXITO   " );
                System.out.println("---------------------------------");

            }else{
                System.out.println("---------------------------------");
                System.out.println("La cedula " +cedula+ " no corresponde a un usario del sistema" );
                System.out.println("---------------------------------");
            }
             
            }

            if(opcion == 5){

                System.out.println("---------------------------------");
                System.out.println("       PERSONA CON MAYOR EDAD    ");
                System.out.println("---------------------------------");

                Persona personaMayoredad = listapersonas[0];

                for( int i = 1; i < indicePersona;i++){

                    if( listapersonas[i] != null && listapersonas[i].getEdad() > personaMayoredad.getEdad() ){
                            personaMayoredad = listapersonas[i];
                    }              
            }

             if(personaMayoredad != null){
                 System.out.println("---------------------------------");
                 System.out.println("Persona con mayor edad:");
                 System.out.println(personaMayoredad.getInfoInLine());
                 System.out.println("---------------------------------");

                  }
             
            }
            
            if(opcion == 6){
                System.out.println("---------------------------------");
                System.out.println("       PERSONA CON MENOR EDAD    ");
                System.out.println("---------------------------------");

                Persona personaMenoredad = listapersonas[0];

                for( int i = 1; i < indicePersona;i++){

                    if( listapersonas[i] != null && listapersonas[i].getEdad() < personaMenoredad.getEdad() ){
                            personaMenoredad = listapersonas[i];

                    }
                  

            }


               if(personaMenoredad != null){
                    System.out.println("---------------------------------");
                    System.out.println("Persona con menor edad:");
                    System.out.println(personaMenoredad.getInfoInLine());
                    System.out.println("---------------------------------");

                }
             

            }

            if(opcion == 7){
                
                System.out.println("---------------------------------");
                System.out.println("       PERSONA MAS ALTA   ");
                System.out.println("---------------------------------");

                Persona personaMasalta= listapersonas[0];

                for( int i = 1; i < indicePersona;i++){

                    if( listapersonas[i] != null && listapersonas[i].getAltura() > personaMasalta.getAltura() ){
                            personaMasalta = listapersonas[i];

                    }
                    
                }


             if(personaMasalta!= null){
                 System.out.println("---------------------------------");
                 System.out.println("Persona mas alta :");
                 System.out.println(personaMasalta.getInfoInLine());
                 System.out.println("---------------------------------");

                }
             
            }

            if(opcion == 8){
                System.out.println("---------------------------------");
                System.out.println("       PERSONA MAS BAJA   ");
                System.out.println("---------------------------------");

            Persona personaMasbaja = listapersonas[0];

            for( int i = 1; i < indicePersona;i++){

                if( listapersonas[i] != null && listapersonas[i].getAltura() < personaMasbaja.getAltura() ){
                        personaMasbaja = listapersonas[i];
                    
                  }
                
            }

             if(personaMasbaja != null){
                 System.out.println("---------------------------------");
                 System.out.println("Persona mas baja:");
                 System.out.println(personaMasbaja.getInfoInLine());
                 System.out.println("---------------------------------");

                  }

            }
                

            if(opcion == 9){

                System.out.println("---------------------------------");
                System.out.println("       PROMEDIO DE EDADES        ");
                System.out.println("---------------------------------");

                int sumaedad = 0;

                for( int i = 0; i< indicePersona; i++){
                    if(listapersonas[i] != null){
                        sumaedad = sumaedad + listapersonas[i].getEdad();
                        System.out.println(sumaedad);

                    }

                }

                double promedio = sumaedad / indicePersona;

                System.out.println("---------------------------------");
                System.out.println("  el promedio de las edades es: " +promedio);
                System.out.println("---------------------------------");
               
            }

            if(opcion == 10){

                System.out.println("---------------------------------");
                System.out.println("       PROMEDIO DE ALTURA        ");
                System.out.println("---------------------------------");

                int sumaaltura = 0;

                for( int i = 0; i< indicePersona; i++){
                    if(listapersonas[i] != null){
                        sumaaltura = sumaaltura + listapersonas[i].getAltura();
                        System.out.println(sumaaltura);
                    }

                }

                double promedio = sumaaltura / indicePersona;

                System.out.println("---------------------------------");
                System.out.println("  el promedio de la altura es: " +promedio);
                System.out.println("---------------------------------");
           
            }

            if(opcion == 11){
                System.out.println("-----------hasta la vista, baby----------- ");

            }

            
        }


    
         // de tarea
            // opcion 5 sera persona con mayor edad
            // opcion 6 persona con menor edad
            //opcion 7 persona mas alta
            //opcion 8 persona mas baja
            //opcion 9 promedio de edades
            //opcion 10 promedio de altura
            // opccion 11 salir



    }
    
    
}
       





