
public class Persona
{
    private String nombre;
    private String dni;

    /**
     * Constructor de la clase Persona.
     * @param nombre sring que ingresa el nombre de la persona.
     * @param dni string que guarda el dni de la persona.
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    /**
     * Devuelve toda la información relacionada con la Persona.
     * @return información de la persona.
     */
    public String toString()
    {
        String cadenaADevoler = "";
        cadenaADevoler += "Nombre: "+nombre+ "\n";
        cadenaADevoler += "DNI: "+dni+ "\n";
        return cadenaADevoler;
    }
}
