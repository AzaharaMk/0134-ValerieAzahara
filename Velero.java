
public class Velero extends Barco
{
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero( String matricula,double eslora,int anoFabricacion,Persona propietario,int numMastiles)
    {
        super(matricula, eslora,anoFabricacion,propietario);
        this.numMastiles = numMastiles;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += super.toString();
        cadenaADevolver += "Numero de mástiles: "+numMastiles+ "\n";
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
}
