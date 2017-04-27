
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String toString()
    {
        String cadenaADevoler = "";
        cadenaADevoler += "Nombre: "+nombre+ "\n";
        cadenaADevoler += "DNI: "+dni+ "\n";
        return cadenaADevoler;
    }
}
