
public abstract class Barco
{
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona propietario;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, double eslora,int anoFabricacion,Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.propietario = propietario;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += "matricula: "+matricula+ "\n";
        cadenaADevolver += "Eslora: "+eslora+ "\n";
        return cadenaADevolver;
    }
    
    public double getEslora()
    {
        return eslora;
    }
    
    public abstract int getCoeficienteBernua();
}
