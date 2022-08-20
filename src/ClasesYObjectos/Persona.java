package ClasesYObjectos;


public class Persona 
{
    
    private String nombre;
    private int edad;
    private String idi;

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;        
    }

    public Persona(String idi) {
        this.idi = idi;
    }
    
    public void correr()
    {
        System.out.println("Soy "+nombre+ " Tengo años "+edad+" y estoy corriendo un maraton");
    }
    
    public void correr(int km)
    {
        System.out.println("He corrido "+km+" kilometros");    
    }
         
    public void mostrarDatos()
    {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    
    
}
