package ClasesYObjectos;

import javax.swing.JOptionPane;


public class Operacion {    
    
    public int sumar(int numero1, int numero2)
    {
        int suma = numero1 + numero2;
        return suma;
    }
    
        public int multiplicacion(int numero1, int  numero2)
    {
        int mult = numero1 * numero2;
        return mult; 
    }
    
        public int restar(int numero1, int numero2)
        {
           int resta = numero1 - numero2;  
           return resta;
        }
        
        public int division(int numero1, int numero2)
        {
            int div = numero1 / numero2;   
            return div; 
        }
        
        public void mostrarResultados(int suma, int resta, int mult, int div)
        {
            System.out.println("El resultado de la suma es: "+suma);
            System.out.println("El resultado de la resta es: "+resta);
            System.out.println("El resultado de la multiplicacion es: "+mult);
            System.out.println("El resultado de la division es: "+div);
        }
        
        
}
