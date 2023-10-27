public class Perro {

    //atributos
    public  String nombre;
    public String propietario;
    public int edad;
    public String raza;
    public double peso;
    public int energia;



   
    //es usado para crear objetos de esa clase(instanciacion)
    // la funcion del constructorr es dar valor inicial a los atributos



        //metodos Construcotr
    public Perro(String nombre, String propietario, int edad, String raza, double peso,int energia){
        this.nombre = nombre;
        this.propietario = propietario;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.energia = energia;
       
     }


     public void imprimirDetalle(){
      System.out.println("+--------------------------------------------+");
      System.out.println("| nombre: " +nombre);
      System.out.println("| propietario: " +propietario);
      System.out.println("| edad: " + edad);
      System.out.println("| raza: " +raza);
      System.out.println("| peso: " +peso+ "kg");
      System.out.println("| energia: "+energia);
      System.out.println("+--------------------------------------------+");
     }




     //si son privados, con get para extraer el valor
     public String getNombre(){
      return nombre;

     }

      public String getPropietario(){
      return propietario;

     }

      public int getEdad(){
      return edad;

     }

      public String getRaza(){
      return raza;

     }

      public double getPeso(){
      return peso;

     }
      public int getEnergia(){
      return energia;

     }


     //setters sirve para modificar el atributo
     public void setNombre(String dato){
      nombre = dato;

     }

      public void setpropietario(String dato){
     propietario = dato;

     }

      public void setEdad(int dato){
     edad = dato;

     }

      public void setRaza(String dato){
     raza = dato;

     }

      public void setPeso(double dato){
      peso = dato;

     }

      public void setEnergia(int dato){
      energia = dato;

     }



      public void comer(int gramos){
         //peso
         peso = peso + ((double)gramos/1000);

         //energia
         energia = energia + (gramos/100);

     }



     public void caminar(int minutos){
         //peso
         peso = peso - ((double)minutos/60);
        energia = energia - (minutos / 10);


     }


      public void ladrar(int minutos){  
        energia = energia - (minutos / 5);
     }


      public void morder   (int minutos){        
        energia = energia - (minutos / 5);

     }



       public void dormir(int horas){
        energia = energia + (horas*5);


     }

     


      public void hacercaca(int gramos){
      
         peso = peso -((double)gramos * 0.001) ;

     }



     //otra manera de imprimir ( cons system out print)
    //    public String imprimir(){
    //     String texto = " nombre perro: "+ nombre + " - nombre propietario: " +propietario+" -  raza: "+raza+" - "+edad+" - peso: "+peso+" -  energia: "+energia;
    //     return texto;
    //  }

  
}