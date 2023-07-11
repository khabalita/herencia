
/* 
    TEORIA DE HERENCIA
*/
package herencia194;

import entidades.Persona;
import entidades.Cliente;


public class Herencia194 {

    
    public static void main(String[] args) {
        Persona p = new Persona ("Nicolas", "Lazaro");
        Cliente c = new Cliente("Nicolas", "Lazaro", 123456789, 0);
        
        p.setDocumento(123456789);
        System.out.println(p);
        
        Persona q;
        
        //Comparo P con Q
        q = new Persona ("Juan", "Perez, 1234");
        System.out.println(p.equals(q));
    }
    
}
