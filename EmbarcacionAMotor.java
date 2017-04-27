
public class EmbarcacionAMotor extends Barco
{

    private int potencia;
    /**
     * Constructor de la clase EmbarcacionAMotor. Clase hija de Barco.
     * @param matricula string en el que se igresa la matricula de la embarcación.
     * @param eslora parametro de tipo double por el cual se ingresa el tamaño de eslora.
     * @param ano año de fabricación de la embarcacion.
     * @param propietario objeto de la clase persona con los datos del propietario de la embarcacion.
     * @param entero que especifica la potencia de la embarcación
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int potencia)
    {
        //llamamos a la clase padre
        super(matricula, eslora, ano, propietario);
        this.potencia = potencia;
    }
    
     /**
     * Devuelve información relacionada con la embarcacion a motor.
     * @return informacion del Velero.
     */
    public String toString()
    {
        String cadenaADevolver = "";
        //llamamos al metodo toString de la clase Barco.
        cadenaADevolver += super.toString();
        cadenaADevolver += "Potencia: " + potencia + "\n";
        return cadenaADevolver;
    }
    
     /**
     * Devuelve el valor del coeficiente de bernua en el caso de la embarcacion a motor.
     * @return potencia de la embarcacion a motor
     */
    public int getCoeficienteBernua()
    {
        return potencia;
    }
}