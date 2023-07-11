
package entidades;


//lo que es privado fuera de las clases hijas no se ve
public class Persona{
    protected String nombre;
    protected String apellido;
    protected int documento;
    
    //Constructores, van en public y sin el VOIDDD!!!!
    //Constructor 1
    public Persona(){
        this.nombre = "";
        this.apellido = "";
    }
    //Constructor 2
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Constructor 3
    public Persona(String nombre, String apellido, int documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }
    
    //Getters and Setters
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String a){
        this.apellido = a;
    }
    
    public int getDocumento(){
        return this.documento;
    }
    
    public void setDocumento(int d){
        this.documento = d;
    }
    
    //Metodos
    
    public void saludar(){
        System.out.println("Hola");
    }
    
    @Override
    public String toString(){
         //devuelve un string con todos los atributos del objeto, puedo conocer
         //en que estado se encuentra el Objeto
         String salida = "Persona {";
         salida += "nombre: " +this.nombre + ", ";
         salida += "apellido: " +this.apellido + ", ";
         salida += "documento: " +this.documento + "} ";
         
         return salida;
        
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true; 
        }
        if (o == null){
            return false;
        }
        if (o.getClass() != this.getClass()){
            return false;
        }
        //estoy casteando, convierto el "o" en los
        Persona p = (Persona ) o;
        
        if(this.documento != p.documento){
            return false;
        }
        
        if(this.nombre.equals(p.nombre) != true){
            return false;
        }
        
        //si no es A, ni B, ni C, es D.. solo retorno D
        return this.apellido.equals(p.apellido);
        
        
        //Alternativa al return de arriba, con un if mas
        /*if(this.apellido.equals(p.apellido) != true){
            return false;
        }
        return true;  */
    }
}
