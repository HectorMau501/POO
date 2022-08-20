
package ClasesYObjectos;

import javax.swing.JOptionPane;


public class Main {
    
    
    public static void main(String [] agrs)
    {
        Persona p1 = new Persona("Hector",18);
        Persona p2 = new Persona("Hola");
        
        p1.correr();
        p2.correr(100);
        
    }
}

