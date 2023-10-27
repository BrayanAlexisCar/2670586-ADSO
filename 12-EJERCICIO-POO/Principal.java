import java.text.StringCharacterIterator;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto =  new Scanner(System.in);

        Curso listacurso[] = new Curso [100];
       

        listacurso[0] = new Curso(2670586, "ADSO", "JAVA", 48 );
        listacurso[1] = new Curso(4353232, "PELUQUERIA", "MOTILAR", 48);
        listacurso[2] = new Curso(343452, "VETERINARIA", "INYECCIONES", 80);
        listacurso[3] = new Curso(867856, "ADSO", "PYTHON", 90);


        listacurso[1].editarInformacionCurso("BARTENDER", "LICOR", 34);
        listacurso[2].agregarTema("politica");


          listacurso[1].imprimirDetalleCurso();
       
        int opcion = 0;
        int indicecurso = 4;

       while(opcion != 7) {
            System.out.println("------------------------------------- |");
            System.out.println("            MENU DE PERSONAS          |");
            System.out.println("------------------------------------- |");
            System.out.println("                         MEMORIA: "+(100-indicecurso)+"  |");
            System.out.println("1. Crear curso                        |");
            System.out.println("2. listar todos los cursos            |");
            System.out.println("3. Ver detalle de curso               |");
            System.out.println("4. Editar informacion de un curso     |");
            System.out.println("5. Agregar tema a curso               |");
            System.out.println("6. Eliminar curso.                    |");
            System.out.println("7. Salir                              |");
            System.out.println("INGRESE UNA OPCION (1 AL 7):          |");
             System.out.println("------------------------------------- |");
            opcion = entrada_numero.nextInt();



            if(opcion == 1){

                if(indicecurso < 100){

                     System.out.println("---------------------------------");
                    System.out.println("         CREAR CURSO             ");
                    System.out.println("---------------------------------");

                    System.out.print(" Ingrese el codigo :");
                    int codigo = entrada_numero.nextInt();

                
                    int encontrado = 0; // encontrado no registrado
                    for( int i = 0; i< listacurso.length; i++){

                        if( listacurso[i] != null && listacurso[i].getCodigo() == codigo){
                            System.out.println(" ------- ESE CURSO( CODIGO ) YA EXISTE -------");
                            encontrado = 1; // encontrADO SI ESTA REGISTRADO
                        }

                    }
                
                    if( encontrado == 0){

                        System.out.print(" Ingrese el Nombre :");
                        String nombre = entrada_texto.nextLine();

                        System.out.print(" Ingrese el Area de cococimiento :");
                        String area = entrada_texto.nextLine();

                        System.out.print(" Ingrese la duracion :");
                        int duracion = entrada_numero.nextInt();


                        listacurso[indicecurso]  = new Curso(codigo, nombre, area, duracion);
                        indicecurso++;

                    }
                    

                }
   
            }

            if(opcion == 2){
                System.out.println("---------------------------------");
                System.out.println("        LISTA DE CURSOS       ");
                System.out.println("---------------------------------");

                for( int i = 0; i < listacurso.length; i++){
                    if(listacurso[i] != null){
                           System.out.println( " => " +listacurso[i].getInfoInLine());
                    }

                }


            }
            
            if(opcion == 3){
                System.out.println("---------------------------------");
                System.out.println("        VER DETALLE DE CURSO      ");
                System.out.println("---------------------------------");
                System.out.println("=> ingrese el codigo:");
                int codigo = entrada_numero.nextInt();

                // buscar si existe codigo 

                int indiceencontrada = -1;
                System.out.println("---------------------------------");
                for( int i = 0; i<listacurso.length; i++){

                    if( listacurso[i] != null && listacurso[i].getCodigo() == codigo){
                        indiceencontrada = i;
                        break;
                    }
                }

           

                if(indiceencontrada != -1){

                    for(int index = 0; index < listacurso.length; index++) {
                        listacurso[indiceencontrada].imprimirDetalleCurso();
                        break;
                    }

                }else{
                    System.out.println("---------------------------------");
                    System.out.println("el curso " +codigo+ " no se encuentra en el sistema" );
                    System.out.println("---------------------------------");
                }
            

                }

                if(opcion == 4){
                    System.out.println("---------------------------------");
                    System.out.println("        EDITAR INFORMACION DE UN CURSO        ");
                    System.out.println("---------------------------------");
                    System.out.println("=> ingrese el codigo:");
                    int codigo = entrada_numero.nextInt();


                    int encontrado = -1; // encontrado no registrado
                    for( int i = 0; i< listacurso.length; i++){

                        if( listacurso[i] != null && listacurso[i].getCodigo() == codigo){
                                
                                encontrado = i; // si existe encontrado va a eatr en posicion i
                        }

                    }
                    
                    if( encontrado != -1 ){

                        System.out.print(" Ingrese el Nombre :");
                        String nombre = entrada_texto.nextLine();
                        System.out.print(" Ingrese el Area de cococimiento :");
                        String area = entrada_texto.nextLine();
                        System.out.print(" Ingrese la duracion :");
                        int duracion = entrada_numero.nextInt();

                        listacurso[encontrado].setNombre(nombre);
                        listacurso[encontrado].setArea_conocimiento(area);
                        listacurso[encontrado].setDuracion_horas(duracion);

                        System.out.println("---------------------------------");
                        System.out.println("   CURSO EDITADO SATISFACTORIAMENTE");
                        System.out.println("---------------------------------");

                    }else{
                        System.out.println("   ESE CODIGO NO ESTA EN EL SISTEMA");
                    }
            }
                if(opcion == 5){
                    System.out.println("---------------------------------");
                    System.out.println("       AGREGAR TEMA A UN CURSO        ");
                    System.out.println("---------------------------------");
                    System.out.println("=> ingrese el codigo(curso) para agregarle temas:");
                    int codigo = entrada_numero.nextInt();

                    int encontrado = -1; // encontrado no registrado
                    for( int i = 0; i< listacurso.length; i++){

                        if( listacurso[i] != null && listacurso[i].getCodigo() == codigo){  
                            encontrado = i; // si existe encontrado va a eatr en posicion i
                            break;
                        }

                    }
                
                    if( encontrado != -1 ){

                        System.out.print(" Ingrese el tema :");
                        String tema = entrada_texto.nextLine();

                        listacurso[encontrado].agregarTema(tema);
                       

                    }else{
                        System.out.println("   ESE CODIGO NO ESTA EN EL SISTEMA");
                    }


            }  

                if(opcion == 6){
                    System.out.println("---------------------------------");
                    System.out.println("      ELIMINAR CURSO        ");
                    System.out.println("---------------------------------");
                    System.out.println("=> ingrese el codigo del curso que desea eliminar:");
                    int codigo = entrada_numero.nextInt();

                    int encontrado = -1; // encontrado no registrado
                    for( int i = 0; i< listacurso.length; i++){

                        if( listacurso[i] != null && listacurso[i].getCodigo() == codigo){  
                            encontrado = i; // si existe encontrado va a eatr en posicion i
                        }

                    }
                
                    if( encontrado != -1 ){

                        listacurso[encontrado] = null;
                        indicecurso--;

                         System.out.println("---------------------------------");
                        System.out.println("       CURSO ELIMINADO CORRECTAMENTE       ");
                        System.out.println("---------------------------------");

                    }else{
                        System.out.println("   ESE CODIGO NO ESTA EN EL SISTEMA");
                    }
                    

            }
            if(opcion == 7){
                System.out.println("---------------------------------");
                System.out.println("       SALIENDO EXITOSAMENTE      ");
                System.out.println("---------------------------------");
            }

                 


        }



}

}


