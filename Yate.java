
public class Yate extends EmbarcacionAMotor
{

    private int numCamarotes;

    /**
     * Constructor de la clase Yate.Clase hija de Barco
     * @param matricula String mediante el cual se ingresa la matricula del barco.
     * @param ano año de fabricación del barco
     * @param propietario objeto de la clase persona con los datos del propietario del barco.
     * @param potencia entero por el cual se especifica la potencia del barco.
     * @param numCamarotes entero especifica el numero de camarotes.
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia, int numCamarotes)
    {
        //llamamos al constructor de la clase padre.
        super(matricula, eslora, ano, propietario, potencia);
        this.numCamarotes = numCamarotes;
    }

    /**
     * Devuelve información relacionada con el yate
     * @return informacion del yate
     */
    public String toString()
    {
        String cadenaADevolver = "";
        //llamamos a la clase toString de la clase padre
        cadenaADevolver += super.toString();
        cadenaADevolver += "Numero camarotes: " + numCamarotes + "\n";
        return cadenaADevolver;
    }
    
    /**
     * Devuelve el valor del coeficiente de bernua en el caso de los yates.
     * @return coeficiente de Bernua.
     */
    public int getCoeficienteBernua()
    {
        return numCamarotes + super.getCoeficienteBernua();
    }

}