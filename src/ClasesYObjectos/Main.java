
package ClasesYObjectos;

import javax.swing.JOptionPane;


public class Main {
    
    
    public static void main(String [] agrs)
    {
        int n1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        
        
        Operacion operacion1 = new Operacion();
        
        System.out.println("El resultado de la divison es: "+operacion1.division(n1, n2));
        System.out.println("El resultado de la multiplicacion es: "+operacion1.multiplicacion(n1, n2)); 
        System.out.println("E; resultado de la resta es: "+operacion1.restar(n1,n2));
        System.out.println("El resultado de la suma es: "+operacion1.sumar(n1,n2));
       
    }
}

