
public class EmbarcacionAMotor extends Barco
{

    private int potencia;

    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int potencia)
    {
        super(matricula, eslora, ano, propietario);
        this.potencia = potencia;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += super.toString();
        cadenaADevolver += "Potencia: " + potencia + "\n";
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return potencia;
    }
}