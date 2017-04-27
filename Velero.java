
public class Velero extends Barco
{
    private int numMastiles;

    /**
     * Constructor de la clase Velero. Clase hija de Barco
     * @param matricula string en el que se igresa la matricula del Velero.
     * @param anoFabricacion año de fabricación del Velero.
     * @param propietario objeto de la clase persona con los datos del propietario del Velero.
     * @param numMastiles entero especifica el numero de mastiles que posee el Velero.
     */
    public Velero( String matricula,double eslora,int anoFabricacion,Persona propietario,int numMastiles)
    {
        //llamamos al constructor de la clase padre
        super(matricula, eslora,anoFabricacion,propietario);
        this.numMastiles = numMastiles;
    }
    
    /**
     * Devuelve información relacionada con el Velero.
     * @return informacion del Velero.
     */
    public String toString()
    {
        String cadenaADevolver = "";
        //llamamos al toString de la clase Barco
        cadenaADevolver += super.toString();
        cadenaADevolver += "Numero de mÃ¡stiles: "+numMastiles+ "\n";
        return cadenaADevolver;
    }
    
    /**
     * Devuelve el valor del coeficiente de bernua en el caso de los Veleros.
     * @return numero de mastiles del Velero
     */
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
}
