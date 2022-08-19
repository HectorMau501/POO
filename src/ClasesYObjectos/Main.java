
package ClasesYObjectos;

import javax.swing.JOptionPane;


public class Main {
    
    
    public static void main(String [] agrs)
    {
        int n1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        
        
        Operacion operacion1 = new Operacion();
        
        int div = operacion1.division(n1, n2);
        int mul = operacion1.multiplicacion(n1, n2);
        int ret = operacion1.restar(n1,n2);
        int sum = operacion1.sumar(n1,n2);
       
        operacion1.mostrarResultados(sum, ret, mul, div);
    }
}

