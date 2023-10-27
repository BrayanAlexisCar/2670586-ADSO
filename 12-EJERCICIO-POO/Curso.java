public class Curso {

    //atributos 
     public int codigo;
     public String nombre;
     public String area_conocimiento;
     public int duracion_horas;
     public  String[] listaTemas;
    public  int temas;


    // metodos



    //   -constructores
    
    public Curso(int codigo, String nombre, String area_conocimiento, int duracion_horas){

        this.codigo = codigo;
        this.nombre = nombre;
        this.area_conocimiento = area_conocimiento;
        this.duracion_horas = duracion_horas;
        this.listaTemas = new String[15];
        this.temas = 0;
    }

     //   -getters 
    public int getCodigo(){
        return codigo;

    }

    public String getNombre(){
        return nombre;   

    }

      public String getArea_conocimiento(){
        return area_conocimiento; 

    }

      public int getDuracion_horas(){
        return duracion_horas;
        
    }

      public String [] getListatemas(){
        return listaTemas;
        
    }

    public int gettemas(){
        return temas;
        
    }


      //   -setters

      public void setCodigo(int dato){
       
        codigo = dato;
      


      }


       public void setNombre(String dato){
        nombre = dato;

      }

      
       public void setArea_conocimiento(String dato){
        area_conocimiento = dato;

      }
      
       public void setDuracion_horas(int dato){
        duracion_horas = dato;

      }

      

      

      public void imprimirDetalleCurso(){
        System.out.println("\n");
        System.out.println("-----------------------------------|");
        System.out.println("- codigo: " + codigo);
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Area de conocimiento: " + area_conocimiento);
        System.out.println("- Duracion en horas: " + duracion_horas);
        System.out.println("- lista de temas: " );
        for (int i = 0; i < temas; i++) {
            System.out.println(" - " +listaTemas[i]);
          
        }
        System.out.println("-------------------------------|");
      }



      public void agregarTema(String tema){
            if (temas < 15) {
              listaTemas[temas] = tema;
              temas++;
              System.out.println("----------------------------------------------------------|");
                System.out.println("   TEMA AGREGADO SATISFACTORIAMENTE");
                 System.out.println("--------------------------------------------------------|");
            }else{
               System.out.println("----------------------------------------------------------|");
                System.out.println("   NO SE PUEDEN AGREGAR MAS TEMAS, EL MAXIMO ES DE 15");
                 System.out.println("--------------------------------------------------------|");
                
            }

      }





      public void editarInformacionCurso(String nombre, String area, int duracion_horas){
           if(nombre != null && area != null && duracion_horas > 0){
              setNombre(nombre);
              setArea_conocimiento(area);
              setDuracion_horas(duracion_horas);

              System.out.println("INFORMACION ACTUALIZADA CORRECTAMENTE");
           }else{
              System.out.println("LOS DATOS NO SE PUDIERON EDITAR");
          }

          

      }


      public String getInfoInLine(){
        String texto = codigo+ " - " +nombre+ " - " +area_conocimiento+ " - "+duracion_horas;
        return texto;
      }
     



}
