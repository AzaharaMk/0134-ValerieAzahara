
public class Yate extends EmbarcacionAMotor
{

    private int numCamarotes;


    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia, int numCamarotes)
    {
        super(matricula, eslora, ano, propietario, potencia);
        this.numCamarotes = numCamarotes;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += super.toString();
        cadenaADevolver += "Número camarotes: " + numCamarotes + "\n";
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return numCamarotes + super.getCoeficienteBernua();
    }

}