
package entidades;

//Extends es para heredar de otra clase, en este claso Persona
public class Cliente extends Persona {
    private long saldo;
    
    //Constructor 1
    //Constructor completo con los atributos de persona y el cliente
    public Cliente(String n, String a, int d, long s){
        
        //Llamo al constructor de persona con "super"
        super(n,a,d);
        
        /*  metodo viejo para traer los atributos de persona
        this.nombre = n;
        this.apellido = a;
        this.documento = d;
        */
        this.saldo = s;
    }
    
    //Constructor 2
    public Cliente(String n, String a, int d){
        super(n,a,d);
    }
    
     //Sobreescribir el getter
    
   @Override
   public String getNombre(){
       return "Cliente" + this.nombre;
   }
    
    public long getSaldo(){
        return this.saldo;
        
    }
    
    public void setSaldo(long s){
        this.saldo = s;
    }
    
    @Override
    public void saludar(){
        super.saludar();
        System.out.println("Tengo saldo $" + this.saldo);
    }
        
}
