package ClasesYObjectos;

import javax.swing.JOptionPane;


public class Operacion {
    
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int division;
    private int multiplicacion; 
        
    public void leernumeros ()
    {
        numero1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
    }
    
    public void suma()
    {
        suma = numero1 + numero2;
    }
        public void multiplicacion()
    {
        multiplicacion = numero1 * numero2;
    }
    
        public void resta()
        {
            resta = numero1 - numero2;         
        }
        
        public void division()
        {
            division = numero1 / numero2;         
        }
        
        public void mostrarResultados()
        {
            System.out.println("El resultado de la suma es: "+suma);
            System.out.println("El resultado de la resta es: "+resta);
            System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
            System.out.println("El resultado de la division es: "+division);
        }
        
        
}
