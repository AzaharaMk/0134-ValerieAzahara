
public abstract class Barco
{
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona propietario;

    /**
     * Constructor de la clase Barco
     * @param matricula cadena de caracteres referente a la matricula del barco.
     * @param eslora parametro de tipo double mediante el cual se especifica el tamaño de la eslora.
     * @param anoFabricacion entero por el cual se ingresa el año de fabricación del barco.
     * @param propietario onbejo de tipo persona que especifica los datos del propietario del barco.
     */
    public Barco(String matricula, double eslora,int anoFabricacion,Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.propietario = propietario;
    }

    /**
     * Devuelve información relacionada con el Barco.
     * @return información referente al barco.
     */
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += "matricula: "+matricula+ "\n";
        cadenaADevolver += "Eslora: "+eslora+ "\n";
        return cadenaADevolver;
    }
    
    /**
     * Devuelve el tamaño de la eslora.
     * @return tamaño de eslora.
     */
    public double getEslora()
    {
        return eslora;
    }
    
    /**
     * Método abstracto que devuelve el coeficiente de Bernua
     */
    public abstract int getCoeficienteBernua();
}
